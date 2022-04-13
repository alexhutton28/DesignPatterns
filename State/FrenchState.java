import java.util.ArrayList;

/**
 * The French State for our music Box, Plays Songs in English
 */
public class FrenchState implements State {
  private MusicBox box;

  /**
   * Constructor for the French box, sets local box equal to box
   */
  FrenchState(MusicBox box) {
    this.box = box;
  }

  /**
   * Sets French Twinkle Twinkle Little Star Lyrics and calls play method from
   * the music box with song
   */
  public void pressStarButton() {
    ArrayList<String> lyrics = new ArrayList<String>();
    String songName = "Brille, brille, petite étoile";
    lyrics.add("Brille, brille, petite étoile");
    lyrics.add("Je me demande vraiment ce que tu es!");
    lyrics.add("Au-dessus du monde si haut");
    lyrics.add("Comme un diamant dans le ciel");
    lyrics.add("Brille, brille, petite étoile");
    lyrics.add("Je me demande vraiment ce que tu es!");
    box.playSong(songName, lyrics);
  }

  /**
   * Sets French If you're Happy and you know it Lyrics and calls play method
   * from the music box with song
   */
  public void pressHappyButton() {
    ArrayList<String> lyrics = new ArrayList<String>();

    String songName = "Si Tu as D' la Joie au Coeur";
    lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
    lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
    lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
    lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");

    box.playSong(songName, lyrics);
  }

  /**
   * Switches box to english mode
   */
  public void pressEnglishButton() {
    System.out.println("Switched to English mode");
    box.setState(box.getEnglishState());
  }

  /**
   * Tells user they are already in French Mode
   */
  public void pressFrenchButton() {
    System.out.println("You are Already in French Mode");
  }

  /**
   * Switches to Spanish mode
   */
  public void pressSpanishButton() {
    System.out.println("Switched to Spanish Mode");
    box.setState(box.getSpanishState());
  }
}
