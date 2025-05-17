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
        switch (numberGame) {
            case 1:
                Utils.welcome();
                break;
            case 2:
                Utils.welcome();
                Even.even();
                break;
            case 3:
                Utils.welcome();
                Calc.calc();
                break;
            case 4:
                Utils.welcome();
                GCD.gcd();
                break;
            case 5:
                Utils.welcome();
                Progression.progression();
                break;
            case 6:
                Utils.welcome();
                Prime.primee();
                break;
            default:
                break;
        }
    }
}

