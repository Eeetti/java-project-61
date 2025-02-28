package hexlet.code;

import hexlet.code.Games.Welcome;
import hexlet.code.Games.Even;
import hexlet.code.Games.Cals;
import hexlet.code.Games.Progression;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Prime;


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
                Welcome.welcome();
                break;
            case 2:
                Even.welcome();
                Even.even();
                break;
            case 3:
                Cals.welcome();
                Cals.cals();
                break;
            case 4:
                GCD.welcome();
                GCD.gcd();
                break;
            case 5:
                Progression.welcome();
                Progression.progression();
                break;
            case 6:
                Prime.welcome();
                Prime.primee();
                break;
            default:
                break;
        }
    }
}
