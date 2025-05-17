package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void progression() {
        System.out.println("What number is missing in the progression?");
        int rez = 0;
        int count = 3;
        while (rez < count) {
            Random ran = new Random();
            final int sizeAray = 10;
            int[] ara = new int[sizeAray];
            final int sideofbaund1 = 50;
            final int sideofbaund2 = 10;

            ara[0] = ran.nextInt(1, sideofbaund1);
            int step = ran.nextInt(1, sideofbaund2);
            for (int i = 1; i < ara.length; i++) {
                ara[i] = ara[i - 1] + step;
            }
            int sideofqwest = 9;
            int randomqwest = ran.nextInt(0, sideofqwest);
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
                Utils.wrong(input, question);
                return;
            }
            if (answer == question) {
                System.out.println("Correct!");
                rez++;
            } else {
                Utils.wrong(input, question);
                break;
            }
        }
        if (rez == count) {
            System.out.println("Congratulations, " + Utils.getName() + "!");
        }

    }
}
