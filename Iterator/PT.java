import java.util.ArrayList;
/**
 * A Psyical Trainer, with a first and last name, a bio and a list of exercises.
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercise;
    private int numExercises;
/**
 * Creates an instance of the PT
 * @param firstName The PT's first name
 * @param lastName The PT's Last name
 * @param bio The PT's Bio
 */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.numExercises = 0;
        this.exercise = new Exercise[2];
    }
    /**
     * Adds an exercise to the PT's list
     * @param title title of exercise   
     * @param muscleGroups the muscle groups that will be worked
     * @param directions how to preform the exercise
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        Exercise newE = new Exercise(title, muscleGroups, directions);

        if (exercise[0] == null) {
            this.exercise = new Exercise[1];
            this.exercise[0] = newE;
            numExercises++;
        } else {
            this.exercise = growArray(exercise);
            this.exercise[numExercises] = newE;
            numExercises++;
        }
    }
/**
 * Gets the first name
 * @return the first name of the PT
 */
    public String getFirstName() {
        return this.firstName;
    }
/**
 * The last name of the PT
 * @return The last name of the PT
 */
    public String getLastName() {
        return this.lastName;
    }
/**
 * gets the bio of the pt
 * @return the bio of the pt
 */
    public String getBio() {
        return this.bio;
    }

    /**
     * Grows the array by doubling it in size
     * @param exercises the array of exercises to be doubled
     * @return an array with double the size of the input with the same information
     */
    public Exercise[] growArray(Exercise[] exercises) {
        int currentLength = exercises.length;
        Exercise[] temp = new Exercise[currentLength * 2];
        for (int i = 0; i < currentLength; i++) {
            temp[i] = exercises[i];
        }
        return temp;
    }
    

    /**
     *  creates a new Iterator for exdercises
     * @return a new Exercise iterator
     */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercise);
    }
    
/**
 * coverts the PT to a string
 * @return the PT's information
 */
    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + this.bio + "\n";
    }
}
