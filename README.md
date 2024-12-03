# Music Player

A **Music Player** application built with Java, designed to provide seamless audio playback, library management, and a user-friendly interface. This project uses core Java libraries and external dependencies to enhance functionality.

## Features

1. **Audio Playback**
   - Support for common audio formats like MP3, WAV, and AAC.
   - Play, pause, stop, skip, and rewind controls.

2. **Playlist Management**
   - Create, edit, and manage playlists.
   - Shuffle and repeat playback modes.

3. **Library Organization**
   - Organize music by artist, album, genre, or folders.
   - Search and filter songs.

4. **Customizable UI**
   - Intuitive user interface with a modern design.
   - Display album art and metadata.

5. **Audio Enhancements**
   - Built-in equalizer with presets.
   - Volume control and normalization.

## Requirements

- **Java Development Kit (JDK)**: Version 8 or higher.
- **IDE**: IntelliJ IDEA, Eclipse, or any Java-supported IDE.

## Libraries Used

1. **JLayer**
   - A Java library for decoding and playing MP3 files.
   - [GitHub Repository](https://github.com/umjammer/jlayer)

   ```xml
   <!-- Add to pom.xml if using Maven -->
   <dependency>
       <groupId>javazoom</groupId>
       <artifactId>jlayer</artifactId>
       <version>1.0.1</version>
   </dependency>
   ```

2. **JavaFX**
   - Used for building the graphical user interface.
   - [Documentation](https://openjfx.io/)

   ```xml
   <!-- Add to pom.xml if using Maven -->
   <dependency>
       <groupId>org.openjfx</groupId>
       <artifactId>javafx-controls</artifactId>
       <version>17.0.2</version>
   </dependency>
   ```

3. **Apache Commons IO**
   - For file and directory operations.
   - [GitHub Repository](https://commons.apache.org/proper/commons-io/)

   ```xml
   <dependency>
       <groupId>commons-io</groupId>
       <artifactId>commons-io</artifactId>
       <version>2.11.0</version>
   </dependency>
   ```

## Setup and Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/music-player-java.git
   ```

2. **Import Project**:
   - Open the project in your favorite Java IDE.
   - Ensure all dependencies are added (Maven or manually).

3. **Run the Application**:
   - Locate the `Main.java` file in the `src` directory.
   - Run the file to start the music player.

## Usage

- **Add Songs**: Import your local music files into the library.
- **Create Playlists**: Organize songs into custom playlists.
- **Playback Control**: Use the player controls to enjoy your music.

## Contributing

We welcome contributions! To contribute:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m "Description of changes"`).
4. Push to the branch (`git push origin feature-name`).
5. Create a Pull Request.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

## Acknowledgements

- [JLayer](https://github.com/umjammer/jlayer) for MP3 playback.
- [JavaFX](https://openjfx.io/) for UI components.
- [Apache Commons IO](https://commons.apache.org/proper/commons-io/) for file handling.
