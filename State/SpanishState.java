import java.util.ArrayList;

/**
 * The Spanish State for our music Box, Plays Songs in English
 */
public class SpanishState implements State {
  private MusicBox box;

  /**
   * Constructor for the Spanish box, sets local box equal to box
   */
  SpanishState(MusicBox box) {
    this.box = box;
  }

  /**
   * Sets Spanish Twinkle Twinkle Little Star Lyrics and calls play method from
   * the music box with song
   */
  public void pressStarButton() {
    ArrayList<String> lyrics = new ArrayList<String>();
    lyrics.add("Estrellita, ¿dónde estás?");
    lyrics.add("Quiero verte cintilar");
    lyrics.add("En el cielo, sobre el mar.");
    lyrics.add("Un diamante de verdad.");
    lyrics.add("Estrellita, ¿donde estas?");
    lyrics.add("Quiero verte cintilar.");
    String songName = "Estrellita, ¿Donde Estas?";
    box.playSong(songName, lyrics);
  }

  /**
   * Sets Spanish If you're Happy and you know it Lyrics and calls play method
   * from the music box with song
   */
  public void pressHappyButton() {
    ArrayList<String> lyrics = new ArrayList<String>();
    String songName = "Si usted esta feliz";
    lyrics.add("Si usted esta feliz Apaluda las fuerte.");
    lyrics.add("Si usted esta feliz Apaluda las fuerte.");
    lyrics.add("Si usted esta feliz");
    lyrics.add("En su cara se vera.");
    lyrics.add("Si usted esta feliz");
    lyrics.add("Apaluda las fuerte.");
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
   * Switches box to french mode
   */
  public void pressFrenchButton() {
    System.out.println("Switched to French Mode");
    box.setState(box.getFrenchState());
  }

  /**
   * Tells user they are already in spanish mode
   */
  public void pressSpanishButton() {
    System.out.println("You are already in Spanish Mode");
  }
}
