package org.example;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class AudioPlayer {

    private Clip clip;
    private long currentFrame;
    private String currentFile;

    public void play(String filePath) {
        try {
            stop(); // stop previous if playing

            InputStream audioSrc = getClass()
                    .getClassLoader()
                    .getResourceAsStream(filePath);

            if (audioSrc == null) {
                System.out.println("❌ Audio file not found in resources: " + filePath);
                System.out.println("➡ Make sure file is inside src/main/resources/");
                return;
            }

            BufferedInputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            currentFile = filePath;
            currentFrame = 0;

            System.out.println("▶ Playing: " + filePath);

        } catch (UnsupportedAudioFileException e) {
            System.out.println("❌ Unsupported format. Use WAV files only.");
        } catch (LineUnavailableException e) {
            System.out.println("❌ Audio system unavailable.");
        } catch (Exception e) {
            System.out.println("❌ Error playing audio: " + e.getMessage());
        }
    }

    public void pause() {
        if (clip != null && clip.isRunning()) {
            currentFrame = clip.getMicrosecondPosition();
            clip.stop();
            System.out.println("⏸ Paused");
        } else {
            System.out.println("⚠ No audio is playing.");
        }
    }

    public void resume() {
        if (clip != null && !clip.isRunning()) {
            clip.setMicrosecondPosition(currentFrame);
            clip.start();
            System.out.println("▶ Resumed");
        } else {
            System.out.println("⚠ Nothing to resume.");
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            clip.close();
            clip = null;
            currentFrame = 0;
            System.out.println("⏹ Stopped");
        }
    }

    public boolean isPlaying() {
        return clip != null && clip.isRunning();
    }
}