import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for (boolean playAgain = true; playAgain; ) {
            System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------");

            boolean triple = false;
            for (int roll = 1; !triple; roll++) {
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", roll, die1, die2, die3, sum);

                triple = (die1 == die2 && die2 == die3);
            }

            System.out.print("\nTriple! Roll again? (y/n): ");
            String answer = input.nextLine().trim();
            playAgain = answer.equalsIgnoreCase("y");
            System.out.println();
        }
        System.out.println("Thanks for playing!");
    }
}
