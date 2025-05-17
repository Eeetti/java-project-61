package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit"""
        );
        System.out.print("Your choice: ");
        Scanner scan = new Scanner(System.in);
        int numberGame = scan.nextInt();
        System.out.println();
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        switch (numberGame) {
            case greet:
                Utils.welcome();
                break;
            case even:
                Utils.welcome();
                Even.even();
                break;
            case calc:
                Utils.welcome();
                Calc.calc();
                break;
            case gcd:
                Utils.welcome();
                GCD.gcd();
                break;
            case progression:
                Utils.welcome();
                Progression.progression();
                break;
            case prime:
                Utils.welcome();
                Prime.primee();
                break;
            default:
                break;
        }
    }
}

