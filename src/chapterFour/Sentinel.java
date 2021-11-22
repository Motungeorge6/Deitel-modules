package chapterFour;
import java.util.Scanner;
public class Sentinel {
    public static void main(String[] args) {
        Scanner mint = new Scanner(System.in);

        int value;
        int count = 2;
        int minimum;
        int maximum;
        int total = 0;
        double average;
        System.out.println("Kindly enter a value");
        value = mint.nextInt();
        maximum = value;
        minimum = value;
        do {
            total = total + value;
            count++;

            if (maximum < value) {
                maximum = value;
            }
            if (minimum < value) {
                minimum = value;
            }


        }
        while ((value = mint.nextInt()) != -45) ;

        average = value / (count * 1.0);
        System.out.printf("The sum is %d%n", value);
        System.out.printf("The minimum is %d%n", minimum);
        System.out.printf("The maximum is %d%n", maximum);
        System.out.printf("The average is %.2f%n", average);

    }
}
