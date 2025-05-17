package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static String name;

    public static void setName(String name) {
        Even.name = name;

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
        System.out.println("Let's try again, " + getName() + " !");
    }

    public static void even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rez = 0;
        while (rez < 3) {
            Random ran = new Random();
            int randomnum = ran.nextInt(1, 100);
            String result;
            if (randomnum % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            System.out.println("Question: " + randomnum);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(result)) {
                System.out.println("Correct!");
                rez++;
            } else {
                System.out.println("'" + answer + "' is wrong answer :(. Correct answer '" + result + "'");
                System.out.println("Let's try again, " + getName() + " !");
                break;
            }
        }
        if (rez == 3) {
            System.out.println("Congratulations, " + name + "!");
        }

    }
}
