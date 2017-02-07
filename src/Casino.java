import java.util.Scanner;

/**
 * Created by anthonymparker on 2/5/17.
 */

public class Casino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Casino! ");

        System.out.println();

        String answer = "";
        int numRoll = 0;
        do {
            numRoll++;
            System.out.print("How many sides should each die have? ");
            int sides = scan.nextInt();

            System.out.println("\nEnter '1' to roll dice==> ");
            scan.next();

            System.out.println("\nRoll " + numRoll);
            System.out.println(roll(sides));
            System.out.println(roll(sides));
            System.out.println("Roll again? (y/n? ");
            answer = scan.next();
        }
        while (answer.equals("y"));
    }

    public static int roll(int sides) {

        int n = (int) (Math.random() * sides + 1);

        return n;
    }

}


