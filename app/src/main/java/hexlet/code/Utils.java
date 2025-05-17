package hexlet.code;

import java.util.Scanner;

public class Utils {
    private static String name;

    public static void setName(String name) {
        Utils.name = name;
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
        System.out.println("Let's try again, " + Utils.getName() + "!");
    }
}
