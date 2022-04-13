import java.util.ArrayList;

/**
 * Music Box Class can switch between different language states and plays the
 * music.
 */
public class MusicBox {
  private State englishState;
  private State spanishState;
  private State frenchState;
  private State state;

  /**
   * Creates local states for each language
   */
  public MusicBox() {

    englishState = new EnglishState(this);
    spanishState = new SpanishState(this);
    frenchState = new FrenchState(this);
    setState(englishState);
  }

  /**
   * Sets State to the indicated state
   * 
   * @param state the state the box will be set to
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Gets the english state
   * 
   * @return the English state
   */
  public State getEnglishState() {
    return englishState;
  }

  /**
   * Gets the French State
   * 
   * @return the french state
   */
  public State getFrenchState() {
    return frenchState;
  }

  /**
   * Gets the spanish State
   * 
   * @return the spanish state
   */
  public State getSpanishState() {
    return spanishState;
  }

  /**
   * Presses the Twinkle Twinkle little star button for current state
   */
  public void pressStarButton() {
    state.pressStarButton();
  }

  /**
   * Presses the Happy and you know it button for current state
   */
  public void pressHappyButton() {
    state.pressHappyButton();
  }

  /**
   * Presses the English button to switch to english state if possible
   */
  public void pressEnglishButton() {

    this.state.pressEnglishButton();
  }

  /**
   * Presses the French Button to switch to french state if possible
   */
  public void pressFrenchButton() {

    this.state.pressFrenchButton();
  }

  /**
   * Presses the Spanish Button to switch to spanish state if possible
   */
  public void pressSpanishButton() {

    this.state.pressSpanishButton();
  }

  /**
   * Plays the selected song in the current langauge state
   * 
   * @param songName name of the song to be played
   * @param lyrics   Array list containing the lyrics of the song to be played
   */
  public void playSong(String songName, ArrayList<String> lyrics) {
    System.out.println("Now Playing: " + songName + "\n");
    for (int i = 0; i < lyrics.size(); i++) {
      System.out.println(lyrics.get(i));
      try {
        Thread.sleep(750);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("");
  }
}
