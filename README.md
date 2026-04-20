# 🎵 Jukebox Application (Java + Maven)

A console-based Jukebox Application built using **Java** and **Maven** that allows users to play songs, explore music, manage playlists, and listen to podcasts.

This project demonstrates core **Object-Oriented Programming (OOP)** concepts along with practical implementation of **audio playback using Java Sound API**.

---

## 🚀 Features

### 🎶 Music Management
- View complete song catalog
- Play songs using `.wav` files
- Pause, resume, and stop playback

### 🔍 Smart Browsing
- Browse songs by:
  - Artist
  - Album
  - Genre
- Flexible search (partial matching supported)

### 🔤 Alphabetical Search
- Find songs based on starting letter
- Sorted listing for better navigation

### 🎧 Podcast Support
- View available podcasts
- Play podcast audio

### 📂 Playlist Management
- Create custom playlists
- Add songs to playlist
- Remove songs from playlist
- View playlist contents
- Play songs directly from playlist

### 🧭 User-Friendly Menu
- Console-based navigation
- Input validation to prevent crashes

---

## 🛠️ Tech Stack

| Technology | Purpose |
|----------|--------|
| Java | Core programming language |
| Maven | Project structure & build management |
| Java Sound API (`javax.sound.sampled`) | Audio playback |
| ArrayList | Data storage |
| OOP Concepts | Design & structure |

---

## 📁 Project Structure
JukeboxProject/

├── pom.xml

├── src/

│ ├── main/

│ │ ├── java/org/example/
│ │ │ ├── Main.java
│ │ │ ├── JukeboxService.java
│ │ │ ├── AudioPlayer.java
│ │ │ ├── Song.java
│ │ │ ├── Podcast.java
│ │ │ ├── Playlist.java
│ │ │ └── SampleData.java
│ │ └── resources/
│ │ ├── songs/
│ │ └── podcasts/
│ └── test/

---

## ▶️ How to Run the Project

### 🔧 Prerequisites
- Java 17 or above
- Maven installed

### ▶️ Steps

1. Clone the repository:
```bash
git clone https://github.com/your-username/JukeboxProject.git
cd JukeboxProject

2. Compile the project:
mvn compile

3. Run the application:
mvn exec:java
⚠️ Important Note (Audio Files)

Audio files are not included in this repository to keep it lightweight.

To run the application:

📂 Add .wav files here:
src/main/resources/songs/
src/main/resources/podcasts/
🧠 Example:
songs.add(new Song(1, "Tum Hi Ho", "Arijit Singh", "Aashiqui 2", "Romance", "songs/TUM_HI_HO.wav"));
⚠️ Requirements:
File names must match exactly
Use .wav format only
Prefer PCM format for compatibility
🧠 Design Overview

The application follows a modular and object-oriented design:

📌 Core Classes
Song → Stores song details
Podcast → Stores podcast data
Playlist → Manages user playlists
AudioPlayer → Handles audio playback
JukeboxService → Main application logic
SampleData → Loads initial data
Main → Entry point of application

🎯 Key Concepts Demonstrated
Object-Oriented Programming (Encapsulation, Modularity)
Collection Framework (ArrayList)
File handling using resources
Exception handling
Menu-driven application logic
Maven project structure

🚧 Limitations
Supports only .wav files
Console-based UI (no GUI)
Data stored in-memory (no database)
No automatic playlist queue system

🚀 Future Enhancements
GUI using JavaFX or Swing
Database integration (MySQL / MongoDB)
Support for MP3 files
Streaming from external sources
User login system
Auto-play playlist queue
