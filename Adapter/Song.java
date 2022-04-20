/**
 * Abstract base class song that can be returned as a string of all of its
 * elements
 */
abstract class Song {
  public abstract String getTitle();

  public abstract String getAlbum();

  public abstract String getArtistFirstName();

  public abstract String getArtistLastName();

  public abstract String getGenre();

  /**
   * converts the song to a string
   */
  public String toString() {
    String ret = "";
    ret += this.getTitle() + "\nAlbum: " + this.getAlbum() + "\nBy: " + this.getArtistFirstName() + " "
        + this.getArtistLastName() + "\nGenre: " + this.getGenre() + "\n";

    return ret;
  }
}
