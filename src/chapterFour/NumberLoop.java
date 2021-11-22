package chapterFour;
import java.util.Scanner;
//Get ten numbers from a user
//Compare the numbers
//Display the minimum,maximum and the average number
public class NumberLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        int count = 2;
                int maximum ;
                int minimum;
                int total = 0;
                double average;

        System.out.println("Enter a value: ");
        num = input.nextInt();
        maximum = num;
        minimum = num;
        for (; count < 10;){
            num = input.nextInt();
            total = total + num;
            if (maximum < num){
                minimum = num;
            }
            if (minimum< num){
                maximum = num;

            }
            count++;
        }
        System.out.println("The count is"  + count);
        average = total / (count*1.0);
        System.out.printf("The average is %.2f%n",average);
        System.out.printf("The largest number is %d%n", maximum);
        System.out.printf("The smallest number is %d",minimum);



    }
}
