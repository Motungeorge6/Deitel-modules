package chapterFour;

import java.util.Scanner;

public class GuessModification {
    public static void main(String[] args) {
        int choice = (int) (Math.random() * 1000);
        int count = 0;

        System.out.println("Guess the number that has been chosen");
        Scanner input = new Scanner(System.in);
        int trial = input.nextInt();

        while (trial != choice){
            if (trial > choice){
                System.out.println("Very high.Try again");
            }
            if (trial < choice){
                System.out.println("Very low. Try again");
            }
            count++;
            System.out.println("Try again");
            trial = input.nextInt();
        }
        System.out.println("Congrats. You got the number correctly");
        if (count <= 10){
            System.out.println("It is either you know the secret or you just got the luck!");
        }
        if (count == 10){
            System.out.println("Haba You know the secret");
        }
        if(count > 10){
            System.out.println("You can do better next time");
        }


    }
}

