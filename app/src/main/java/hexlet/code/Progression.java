package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static String name;

    public static void setName(String name) {
        Progression.name = name;

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


    public static void progression() {
        System.out.println("What number is missing in the progression?");
        int rez = 0;
        while (rez < 3) {
            Random ran = new Random();
            int[] ara = new int[10];
            ara[0] = ran.nextInt(1, 50);
            int step = ran.nextInt(1, 10);
            for (int i = 1; i < ara.length; i++) {
                ara[i] = ara[i - 1] + step;
            }
            int randomqwest = ran.nextInt(0, 9);
            int question = ara[randomqwest];
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < ara.length; i++) {

                if (i == randomqwest) {
                    result.append(".. ");
                } else {
                    result.append(ara[i]);
                    result.append(" ");

                }
            }

            System.out.print("Question: " + result);
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            int answer;
            String input = scanner.nextLine();
            try {
                answer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                wrong(input, question);
                return;
            }
            if (answer == question) {
                System.out.println("Correct!");
                rez++;
            } else {
                wrong(input, question);
                break;
            }
        }
        if (rez == 3) {
            System.out.println("Congratulations, " + name + "!");
        }

    }
}
