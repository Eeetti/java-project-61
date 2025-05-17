package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static String name;

    public static void setName(String name) {
        GCD.name = name;

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

    public static void wrong(String a, int b) {
        System.out.println("'" + a + "' is wrong answer :(. Correct answer '" + b + "'");
        System.out.println("Let's try again, " + getName() + "!");
    }


    public static void gcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int rez = 0;
        while (rez < 3) {
            Random ran = new Random();
            int randomnum1 = ran.nextInt(1, 100);
            int randomnum2 = ran.nextInt(1, 100);


            System.out.println("Question: " + randomnum1 + " " + randomnum2);
            Scanner scanner = new Scanner(System.in);
            while (randomnum2 != 0) {
                int c = randomnum1 % randomnum2;
                randomnum1 = randomnum2;
                randomnum2 = c;
            }
            int result = randomnum1;
            System.out.print("Your answer: ");
            int answer;
            String input = scanner.nextLine();
            try {
                answer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                wrong(input, result);
                return;
            }
            if (answer == result) {
                System.out.println("Correct!");
                rez++;
            } else {
                wrong(input, result);
                break;
            }
        }
        if (rez == 3) {
            System.out.println("Congratulations, " + name + "!");
        }

    }
}
