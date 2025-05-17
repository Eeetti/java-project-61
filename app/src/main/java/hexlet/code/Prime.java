package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    public static void primee() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rez = 0;
        final int count = 3;
        while (rez < count) {
            final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
            Random ran = new Random();
            int randomnum = ran.nextInt(0, primes.length - 1);
            int question = primes[randomnum];
            String result = "yes";

            System.out.println("Question: " + question);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(result)) {
                System.out.println("Correct!");
                rez++;
            } else {
                System.out.println("'" + answer + "' is wrong answer :(. Correct answer '" + result + "'");
                System.out.println("Let's try again, " + Utils.getName() + "!");
                break;
            }
        }
        if (rez == count) {
            System.out.println("Congratulations, " + Utils.getName() + "!");
        }
    }
}
