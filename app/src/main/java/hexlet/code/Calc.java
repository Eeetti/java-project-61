package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static String name;

    public static void setName(String name) {
        Calc.name = name;

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

    public static void calc() {
        System.out.println("What is the result of the expression?");

        int rez = 0;
        while (rez < 3) {
            Random ran = new Random();
            int numoper = ran.nextInt(1, 3);
            int randomnum1 = ran.nextInt(1, 30);
            int randomnum2 = ran.nextInt(1, 30);
            int result = 0;
            String oper = switch (numoper) {
                case 1 -> {
                    result = randomnum1 + randomnum2;
                    yield "+";
                }
                case 2 -> {
                    result = randomnum1 - randomnum2;
                    yield "-";
                }
                case 3 -> {
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
