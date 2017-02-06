import java.util.Scanner;

/**
 * Created by anthonymparker on 2/5/17.
 */

public class Casino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Casino! ");
        System.out.println();

        roll();

    }

    public static int roll() {

        Scanner scan = new Scanner(System.in);
        String answer = "y";
        int numRoll = 0;
        while (answer.equals("y")) {
            numRoll++;
            System.out.print("How many sides should each die have? ");
            System.out.println("\nPress 'Enter' to roll dice==> ");
            int sides = scan.nextInt();

            int n = (int) (Math.random() * sides + 1);
            int n2 = (int) (Math.random() * sides + 1);

            System.out.println("\nRoll " + numRoll);
            System.out.println(n);
            System.out.println(n2);
            System.out.println();
            System.out.print("Continue? (y/n) ");
            answer = scan.next();

        }

        return 1;
    }


}

