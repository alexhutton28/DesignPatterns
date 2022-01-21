import java.util.HashMap;

/**
 * takes in poll results and displays the current poll results in a form of the
 * percentage of votes towards each candidate
 */
public class PercentageDisplay implements Observer {
    Subject poll;
    HashMap<String, Integer> votes;

    /**
     * Creates a new Percentage Display
     * 
     * @param poll  the poll that the votes are going towards
     * @param votes the hashmap containing the name of the candidates
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        votes = new HashMap<String, Integer>();
    }

    /**
     * updates the local hashmap with information from the polls
     * 
     * @param votes
     */
    public void update(HashMap<String, Integer> votes) {

        this.votes.putAll(votes);

        display();
    }

    /**
     * displays results from the poll in the form of precent of votes for each
     * candidate.
     */
    public void display() {
        int totalVotes = this.votes.get("Jim Roberts") + this.votes.get("Cindy Smith");
        double cP = (this.votes.get("Cindy Smith"));
        double jP = (this.votes.get("Jim Roberts"));
        cP = (cP / totalVotes) * 100;
        jP = (jP / totalVotes) * 100;

        System.out.println("\nCurrent Percent of Vote:\nJim Roberts: " + jP + "\nCindy Smith: " + cP);

    }
}
