package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static String name;

    public static void setName(String name) {
        Prime.name = name;

    }

    public static String getName() {
        return name;
    }

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        setName(scanner.nextLine());
        System.out.println("Hello, " + getName() + "!");
    }


    public static void primee() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rez = 0;
        while (rez < 3) {
            int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
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
                System.out.println("Let's try again, " + getName() + "!");
                break;
            }
        }
        if (rez == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
