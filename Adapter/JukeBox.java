import java.util.HashMap;

/**
 * Juke Box Class that contains a hashmap of songs and can play these songs.
 */
public class JukeBox {
  private HashMap<String, Song> songs;
  private int currentSong;

  /**
   * Jukebox constructor creates the hashmap for the songs
   */
  public JukeBox() {
    this.songs = new HashMap<String, Song>();
  }

  /**
   * Adds a song to the hashmap with its title as the key
   * 
   * @param song the song to be added to the hash map
   */
  public void addSong(Song song) {
    songs.put(song.getTitle().toLowerCase(), song);
  }

  /**
   * Plays the specified song
   * 
   * @param songName the song to be played
   */
  public void play(String songName) {

    if (songs.get(songName.toLowerCase()) != null) {
      System.out.println(songs.get(songName.toLowerCase()).toString());
    } else
      System.out.println(songName.toLowerCase() + " Was not Found\n");
  }
}
