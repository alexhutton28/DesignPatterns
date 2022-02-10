import java.util.ArrayList;
/**
 * A Exercise defined by a name the muscles it trains and the directions to preform it
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;
/**
 * Creates an Exercise and sets its name
 * @param title
 */
    Exercise(String title) {
        this.title = title;
    }
/**
 * Creates an exercise with title target muscles and directions
 * @param title title of the exercise
 * @param targetMuscles the muscles that will be trained
 * @param directions how to preform the exercise
 */
    Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }
/**
 * adds a target muscle to the list
 * @param muscle the muscle/ muscle group that is being worked on
 */
    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }
/**
 * removes a target muscle from the list
 * @param muscle the muscle/ muscle group that is being worked on
 */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }
/**
 * converts the exercise to a string
 * @return the exercise as a String.
 */
    public String toString() {
        String temp = "\n... " + this.title + " ...\nMuscles: ";
        for (int i = 0; i < targetMuscles.size(); i++) {
            temp += targetMuscles.get(i);
            if (i != targetMuscles.size() - 1)
                temp += ", ";
        }
        temp += "\nExercises:\n";
        for (int i = 0; i < directions.size(); i++) {
            temp += " - " + directions.get(i) + "\n";
        }
        return temp;
    }
}
