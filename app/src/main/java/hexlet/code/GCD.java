package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    public static void gcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int rez = 0;
        final int count = 3;
        while (rez < count) {
            Random ran = new Random();
            final int sideofbaund3 = 100;
            int randomnum1 = ran.nextInt(1, sideofbaund3);
            int randomnum2 = ran.nextInt(1, sideofbaund3);


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
                Utils.wrong(input, result);
                return;
            }
            if (answer == result) {
                System.out.println("Correct!");
                rez++;
            } else {
                Utils.wrong(input, result);
                break;
            }
        }
        if (rez == count) {
            System.out.println("Congratulations, " + Utils.getName() + "!");
        }

    }
}
