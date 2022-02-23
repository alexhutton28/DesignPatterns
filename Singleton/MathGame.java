import java.util.Random;
import java.util.*;

/**
 * A math game that tests the user with addition, subtraction, multiplication,
 * and division problems.
 */
public class MathGame {
    private static MathGame mathGame;
    private int score = 0;
    private Random rand;
    private Scanner reader;
    private String[] operands = { "+", "-", "*", "/" };

    /**
     * Default constructor for the mathgame which will be called by get Instance
     */
    private MathGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Let's Have fun with Math!");
    }

    /**
     * Checks if there is an instance of math game created, creates a math game if
     * not.
     * 
     * @return the created math game
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * A loop that will ask the user if they would like to continue playing or quit.
     * Calls playround so the user may play
     */
    public void play() {
        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.print("(P)lay or (Q)uit: ");
            String respo = reader.nextLine();

            if (respo.toUpperCase().equals("P")) {
                playRound();
            } else if (respo.toUpperCase().equals("Q")) {
                System.out.println("You won " + score + " games! \nGoodbye");
                System.exit(0);
            } else {
                System.out.println("Sorry, you must enter p or q");
            }

        }
    }

    /**
     * Calculates the random numbers and the equation
     * 
     * @return true if the user is correct, false if not
     */
    private boolean playRound() {
        double correctA = 0;
        double num1 = rand.nextInt(100) + 1;
        double num2 = rand.nextInt(100) + 1;
        int opIndex = rand.nextInt(4);

        System.out.print("\nRound answer to 1 decimal place\n" + num1 + " " + operands[opIndex] + " " + num2 + " = ");

        if (opIndex == 0) { // ADD
            correctA = num1 + num2;
        }
        if (opIndex == 1) { // SUBTRACT
            correctA = num1 - num2;
        }
        if (opIndex == 2) { // MULTIPLY
            correctA = num1 * num2;
        }
        if (opIndex == 3) { // DIVIDE
            correctA = num1 / num2;
            correctA = Math.round(correctA * 10) / 10.0; // Rounds to 1 decimal
        }

        double response = reader.nextDouble();
        reader.nextLine();

        if (response == correctA) {
            System.out.println("You got it!");
            score++;
            return true;
        } else {
            System.out.println("The correct answer is " + correctA);
            return false;
        }
    }

    public static int sumPrimes(int num) {
        int sum = 0;
        int numDivisible = 0;

        for (int i = 1; i <= num; i++) {
            numDivisible = 0;

            for (int j = 1; j <= 1; j++) {
                if (i % j == 0) {
                    numDivisible++;
                }
            }
            if (numDivisible > 2 || i == 1) {
                // not prime
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
