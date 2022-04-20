/**
 * Song adapter converts a tune to a song
 */
public class SongAdapter extends Song {
  private Tune tune;

  /***
   * Sets our local tune equal to the tune passed in.
   * 
   * @param tune
   */
  public SongAdapter(Tune tune) {
    this.tune = tune;
  }

  /**
   * The title is the first half of the display title, it is set as such
   */
  public String getTitle() {
    String[] titles = tune.getDisplayTitle().split(":");
    return titles[0];
  }

  /**
   * The album is the second half of the display title, it is set as such
   */
  public String getAlbum() {
    String[] titles = tune.getDisplayTitle().split(":");
    return titles[1];
  }

  /**
   * The First name of the artist is everything that comes before the first space
   * in an artists full name
   */
  public String getArtistFirstName() {
    String[] names = tune.getArtistName().split(" ");
    return names[0];
  }

  /**
   * The Last name of an artist is everything after the first space in the full
   * name
   */
  public String getArtistLastName() {
    String[] names = tune.getArtistName().split(" ");
    return names[1];
  }

  /**
   * Converts the category of the song into a set GENRE or else we set it as
   * other.
   */
  public String getGenre() {
    if (tune.getCategory().contains("Rock")) {
      return "ROCK";
    } else if (tune.getCategory().contains("Country")) {
      return "COUNTRY";
    } else
      return "OTHER";
  }
}
