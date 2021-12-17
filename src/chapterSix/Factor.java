package chapterSix;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int loopNumber = 0;
        int number = input.nextInt();
        System.out.print("Factors of "  + number + " are:");
        for (int num = 1; num <= number; num++) {
            if (number % num == 0){
                System.out.println(num + "");
                loopNumber++;

            }

        }
        System.out.println("The number is " + loopNumber);
    }
}