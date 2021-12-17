package chapterFour;

import java.util.Scanner;

public class GuessIt {

    public static void main(String[] args) {
        int choice = 5;
        System.out.println("Guess the number that has been chosen");
        Scanner input = new Scanner(System.in);
        int trial = input.nextInt();

        while (trial != choice) {
            if (trial > choice) {
                System.out.println("Very high. Try again later");
            }
            if (trial < choice) {
                System.out.println("very low. Try again later");
            }
            System.out.println("Guess again");
            trial = input.nextInt();
        }
        if (trial == choice) System.out.println("correct!");
    }
}