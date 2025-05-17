package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {


    public static void calc() {

        System.out.println("What is the result of the expression?");

        int rez = 0;
        final int count = 3;
        while (rez < count) {

            Random ran = new Random();
            final int sideofbaund = 30;
            final int sideofbaund2 = 3;
            int numoper = ran.nextInt(1, sideofbaund2);
            int randomnum1 = ran.nextInt(1, sideofbaund);
            int randomnum2 = ran.nextInt(1, sideofbaund);
            int result = 0;

            final int plus = 1;
            final int minus = 2;
            final int times = 3;
            String oper = switch (numoper) {
                case plus -> {
                    result = randomnum1 + randomnum2;
                    yield "+";
                }
                case minus -> {
                    result = randomnum1 - randomnum2;
                    yield "-";
                }
                case times -> {
                    result = randomnum1 * randomnum2;
                    yield "*";
                }
                default -> "";
            };
            System.out.println("Question: " + randomnum1 + " " + oper + " " + randomnum2);

            Scanner scanner = new Scanner(System.in);
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
