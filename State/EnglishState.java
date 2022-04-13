import java.util.ArrayList;

/**
 * The English State for our music Box, Plays Songs in English
 */
public class EnglishState implements State {
  private MusicBox box;

  /**
   * Constructor for the english box, sets local box equal to box
   */
  EnglishState(MusicBox box) {
    this.box = box;
  }

  /**
   * Sets English Twinkle Twinkle Little Star Lyrics and calls play method from
   * the music box with song
   */
  public void pressStarButton() {
    ArrayList<String> lyrics = new ArrayList<String>();
    lyrics.add("Twinkle twinkle little star");
    lyrics.add("How I wonder what you are");
    lyrics.add("Up above the world so high");
    lyrics.add("Like a dimond in the sky");
    lyrics.add("Twinkle twinkle little star");
    lyrics.add("How I wonder what you are");
    String songName = "Twinkle Twinkle Little Star";
    box.playSong(songName, lyrics);
  }

  /**
   * Sets English If you're Happy and you know it Lyrics and calls play method
   * from the music box with song
   */
  public void pressHappyButton() {
    ArrayList<String> lyrics = new ArrayList<String>();
    lyrics.add("If you're happy and you know it clap your hands");
    lyrics.add("If you're happy and you know it clap your hands");
    lyrics.add("If you're happy and you know it And you really want to show it");
    lyrics.add("If you're happy and you know it clap your hands");
    String songName = "If You're Happy and You Know It";
    box.playSong(songName, lyrics);

  }

  /**
   * Attempts to set the box to english will display to the user that the box is
   * already in english mode
   */
  public void pressEnglishButton() {
    System.out.println("You are already in English mode");
  }

  /**
   * Switches the box to french mode
   */
  public void pressFrenchButton() {
    System.out.println("Switched to French Mode");
    box.setState(box.getFrenchState());
  }

  /**
   * Switches the box to Spanish Mode
   */
  public void pressSpanishButton() {
    System.out.println("Switched to Spanish Mode");
    box.setState(box.getSpanishState());

  }
}
