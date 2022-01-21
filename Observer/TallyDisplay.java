import java.util.HashMap;

/**
 * Takes in the poll results and displays the current tallies of how many votes
 * each candidate has
 */
public class TallyDisplay implements Observer {
    Subject poll;
    HashMap<String, Integer> votes;

    /**
     * Creates a new Tally Display
     * 
     * @param poll  the poll that the votes are going towards
     * @param votes A hashmap containing the name of the candidate and their votes
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        votes = new HashMap<String, Integer>();
    }

    /**
     * updates the local hashmap with information from the polls
     * 
     * @param votes the hashmap containing poll information
     */
    public void update(HashMap<String, Integer> votes) {
        this.votes.putAll(votes);
        display();
    }

    /**
     * Displays the poll results in form of total votes for each candidate
     */
    public void display() {
        System.out.println("Current Tallies:\nJim Roberts: " + this.votes.get("Jim Roberts") + "\nCindy Smith: "
                + this.votes.get("Cindy Smith"));

    }
}
