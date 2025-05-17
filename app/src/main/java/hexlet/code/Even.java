package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rez = 0;
        final int count = 3;
        while (rez < count) {
            Random ran = new Random();
            final int sideofbaund1 = 100;
            int randomnum = ran.nextInt(1, sideofbaund1);
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
                System.out.println("Let's try again, " + Utils.getName() + "!");
                break;
            }
        }
        if (rez == count) {
            System.out.println("Congratulations, " + Utils.getName() + "!");
        }

    }
}
