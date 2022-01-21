import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class that creates a poll that can take in votes for mulitiple candidates
 * in an election
 * 
 * @param observers  those looking for updates from the poll
 * @param school     the name of the school
 * @param numUpdates the number of updates since the last update was sent
 */
public class StudentGovPoll implements Subject {
    ArrayList<Observer> observers;
    HashMap<String, Integer> votes;
    String school = "";
    int numUpdates;

    /**
     * creates a new Student Government Poll
     * 
     * @param school the name of the school
     * 
     */
    public StudentGovPoll(String school) {
        observers = new ArrayList<Observer>();
        this.school = school;
        votes = new HashMap<String, Integer>();
        numUpdates = 0;
    }

    /**
     * Registers an observer to the poll
     * 
     * @param observer the observer to be added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the poll
     * 
     * @param observer the observer to be removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * updates observers to the new poll updates
     */
    public void notifyObservers() {
        if (numUpdates == 4) {
            for (Observer observer : observers) {
                observer.update(votes);
                numUpdates = 0;
            }
        }
    }

    public void addCandidate(String president) {
        votes.put(president, 0);
    }

    public void enterVotes(String president, int num) {

        votes.put(president, num + votes.get(president));
        numUpdates++;
        notifyObservers();
    }

    public String getSchool() {
        return this.school;
    }

}
