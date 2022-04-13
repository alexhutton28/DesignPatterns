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
    lyrics.add(
        "Brille, brille, petite étoile\nJe me demande vraiment ce que tu es!\nAu-dessus du monde si haut\nComme un diamant dans le ciel\nBrille, brille, petite étoile\nJe me demande vraiment ce que tu es!\n");
    String songName = "Brille, brille, petite étoile";
    box.playSong(songName, lyrics);
  }

  /**
   * Sets French If you're Happy and you know it Lyrics and calls play method
   * from the music box with song
   */
  public void pressHappyButton() {
    ArrayList<String> lyrics = new ArrayList<String>();
    lyrics.add(
        "Si tu as d' la joie au coeur, Frappe des mains\nSi tu as d' la joie au coeur, Frappe des mains\nSi tu as d' la joie au coeur, Frappe des mains\nSi tu as d' la joie au coeur, Frappe des mains");
    String songName = "Si Tu as D' la Joie au Coeur";
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
