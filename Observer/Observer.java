import java.util.HashMap;

/**
 * An oberser to the Poll that is updated to the new votes
 * 
 * @param votes the hashmap containing the candidates name and their votes
 */
public interface Observer {
    public void update(HashMap<String, Integer> votes);
}
