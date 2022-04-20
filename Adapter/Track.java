/**
 * a new era song where everything is stored in the modern way
 */
public class Track extends Song {
  private String title;
  private String album;
  private String firstName;
  private String lastName;
  private Genre genre;

  /**
   * A Track consists of a title, album, firstname, lastname and genre.
   * 
   * @param title     the title
   * @param album     the album name
   * @param firstName the artists first name
   * @param lastName  the artists last name
   * @param genre     the genre of the song
   */
  public Track(String title, String album, String firstName, String lastName, Genre genre) {
    this.title = title;
    this.album = album;
    this.firstName = firstName;
    this.lastName = lastName;
    this.genre = genre;
  }

  /**
   * returns the title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * returns the album
   */
  public String getAlbum() {
    return this.album;
  }

  /**
   * returns the genre
   */
  public String getGenre() {
    return this.genre.toString();
  }

  /**
   * Returns the artists first name
   */
  public String getArtistFirstName() {
    return this.firstName;
  }

  /**
   * returns the artists last name
   */
  public String getArtistLastName() {
    return this.lastName;
  }
}
