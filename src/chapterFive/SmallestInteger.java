package chapterFive;

import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args) {


        {
            Scanner input = new Scanner(System.in);
            int smallest = 0;
            int number = 0;
            int integers;
//            System.out.println("Enter number of integers");
//            integers = input.nextInt();
            for (int counter = 1; counter <= 2; counter++) {
                System.out.println("Enter integer");
                number = input.nextInt();
                if (counter ==1)
                    smallest = number;
                else if (number < smallest)
                    smallest = number;
            }
                System.out.printf("Smallest integer is %d%n", smallest);
        }
    }
}