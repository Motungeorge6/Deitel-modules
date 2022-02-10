package homePractice;
import java.util.Scanner;
public class MaxMinAndRange {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // int numbers = input.nextInt();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int a = 0; a < 5; a++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num > maximum) {
                 maximum = num;
            }
            if(num < minimum){
                minimum = num;
            }
        }
        System.out.println(" minimum " +  minimum);
        System.out.println(" maximum " +  maximum);
        System.out.println(" range is " + (maximum - minimum));

    }
}