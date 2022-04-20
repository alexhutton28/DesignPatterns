/**
 * An old era song where the data is stored differently
 */
public class Oldie implements Tune {
  private String artistName;
  private String songTitle;
  private String recordTitle;
  private String category;

  /**
   * An oldie consists of the artists full name, the song title, the record title
   * and the category
   * 
   * @param artistName
   * @param songTitle
   * @param recordTitle
   * @param category
   */
  public Oldie(String artistName, String songTitle, String recordTitle, String category) {
    this.artistName = artistName;
    this.songTitle = songTitle;
    this.recordTitle = recordTitle;
    this.category = category;
  }

  /**
   * returns the artist name
   */
  public String getArtistName() {
    return this.artistName;
  }

  /**
   * Returns the display title as a combination of the song & record title
   */
  public String getDisplayTitle() {
    String ret = "";
    ret += this.songTitle + ":" + this.recordTitle;
    return ret;
  }

  /**
   * Returns the category
   */
  public String getCategory() {
    return this.category;
  }

}
