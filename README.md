# 🎵 Jukebox Application

> A feature-rich, console-based music and podcast player built with **Core Java** and **Maven** — demonstrating real-world Object-Oriented Programming, Java Sound API, and clean software design.

---

## 📌 Overview

The Jukebox Application is a command-line music management system inspired by the classic jukebox experience. Users can browse songs and podcasts, build custom playlists, and play audio files — all from an intuitive console menu.

Built as part of the **NIIT StackRoute Full Stack Development Program**, this project showcases Java fundamentals applied to a practical, real-world use case.

---

## ✨ Features

### 🎶 Music Management
- Browse a complete song catalog with artist, album, and genre details
- Play songs using `.wav` files via the **Java Sound API**
- Pause, resume, and stop audio playback

### 🔍 Smart Browsing & Search
- Browse songs by **Artist**, **Album**, or **Genre**
- **Partial match search** — find songs without typing the full name
- **Alphabetical search** — filter songs by starting letter

### 🎧 Podcast Support
- Browse available podcasts by celebrity or title
- Play podcast audio files seamlessly

### 📂 Playlist Management
- Create custom playlists with unique names
- Add or remove tracks (duplicate checking built-in)
- Add tracks in bulk by genre, album, artist, or celebrity
- View playlist contents and play entire playlists sequentially

### 🛡️ Robust Error Handling
- Input validation to prevent crashes
- Custom exceptions for meaningful error messages
- Duplicate detection for songs, podcasts, and playlists

### 🧪 Unit Testing
- JUnit tests for core business logic
- Tests cover song management, podcast management, and playlist operations

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Core Java | Primary programming language |
| Maven | Project structure & build management |
| Java Sound API (`javax.sound.sampled`) | Audio playback for songs & podcasts |
| ArrayList & Collections | In-memory data storage |
| OOP Principles | Encapsulation, modularity, clean design |
| JUnit | Unit testing |
| Java File I/O | File handling for audio resources |
| Java 8 Features | Streams, Lambdas for data processing |

---

## 📁 Project Structure

```
JukeboxProject/
│
├── pom.xml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       ├── Main.java               ← Entry point & menu navigation
│   │   │       ├── JukeboxService.java     ← Core application logic
│   │   │       ├── AudioPlayer.java        ← Audio playback engine
│   │   │       ├── Song.java               ← Song model
│   │   │       ├── Podcast.java            ← Podcast model
│   │   │       ├── Playlist.java           ← Playlist model & management
│   │   │       └── SampleData.java         ← Pre-loaded demo data
│   │   │
│   │   └── resources/
│   │       ├── songs/                      ← Place .wav song files here
│   │       └── podcasts/                   ← Place .wav podcast files here
│   │
│   └── test/
│       └── java/                           ← JUnit test cases
│
├── .gitignore
└── README.md
```

---

## ▶️ Getting Started

### Prerequisites
- Java 17 or above
- Maven 3.6+

### Installation & Run

```bash
# 1. Clone the repository
git clone https://github.com/developsumitkumar/Java-Music-Library-Manager.git
cd JukeboxProject

# 2. Compile the project
mvn compile

# 3. Run the application
mvn exec:java
```

---

## ⚠️ Audio File Setup

Audio files are **not included** in this repository to keep it lightweight.

**Add your `.wav` files here:**
```
src/main/resources/songs/
src/main/resources/podcasts/
```

**Update `SampleData.java` to match your file names:**
```java
songs.add(new Song(1, "Tum Hi Ho", "Arijit Singh", "Aashiqui 2", "Romance", "songs/TUM_HI_HO.wav"));
songs.add(new Song(2, "Blinding Lights", "The Weeknd", "After Hours", "Pop", "songs/BLINDING_LIGHTS.wav"));
```

> ⚠️ Use `.wav` format only (PCM format preferred for compatibility)

---

## 🧠 Design Overview

The application follows a **modular, object-oriented architecture** with clear separation of concerns:

```
User Input (Main.java)
        ↓
Application Logic (JukeboxService.java)
        ↓
Data Models (Song, Podcast, Playlist)
        ↓
Audio Engine (AudioPlayer.java)
        ↓
Resource Files (.wav files)
```

### Core Classes

| Class | Responsibility |
|-------|---------------|
| `Main.java` | Entry point, menu-driven UI |
| `JukeboxService.java` | Business logic for all operations |
| `AudioPlayer.java` | Handles audio playback using Java Sound API |
| `Song.java` | Song model with title, artist, album, genre |
| `Podcast.java` | Podcast model with title and celebrity host |
| `Playlist.java` | Playlist with track management |
| `SampleData.java` | Pre-loaded sample songs and podcasts |

### Key OOP Concepts Demonstrated
- **Encapsulation** — private fields with getters/setters
- **Modularity** — single responsibility per class
- **Collections Framework** — ArrayList for data management
- **Exception Handling** — custom and predefined exceptions
- **Java 8 Features** — Streams and Lambdas for filtering/sorting

---

## 🚧 Known Limitations

- Supports `.wav` files only (no MP3)
- Console-based UI (no GUI)
- Data stored in-memory (resets on restart)
- No user authentication system

---

## 🚀 Future Enhancements

- [ ] GUI using JavaFX or Swing
- [ ] Database integration (MySQL / MongoDB)
- [ ] MP3 file support
- [ ] User login and personal playlists
- [ ] Auto-play playlist queue
- [ ] Streaming from external sources

---

## 👨‍💻 Author

**Sumit Kumar** — NIIT StackRoute Certified Software Engineer

- 📧 [develop.sumitkumar@gmail.com](mailto:develop.sumitkumar@gmail.com)
- 🌐 [Portfolio](https://developsumitkumar.github.io)
- 💻 [GitHub](https://github.com/developsumitkumar)

---

