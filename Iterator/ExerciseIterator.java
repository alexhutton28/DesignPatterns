import java.util.Iterator;
/**
 * an Iterator for the Exercise class
 */
public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position;
/**
 * creates an exercise iterator for the given array
 * @param exercises the array of exercises to be iterated through
 */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }
/**
 * confirms wether there is more information in the next posotion of the array
 */
    public boolean hasNext() {
        return exercises[position] != null && position < exercises.length;
    }
/**
 * moves to the next position of the array, if possible.
 */
    public Exercise next() {
        if (!hasNext())return null;
        Exercise exercise = exercises[position];
        position = position + 1;
        return exercise;
    }

}
