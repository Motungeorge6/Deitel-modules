package chapterTwo;
import java.util.Scanner;
public class Arithmetic {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1,
                number2,
                sum,
                product,
                difference,
        division;
        System.out.print("Enter first integer:");
        number1 = input.nextInt();

        System.out.print("Enter second integer:");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1* number2;
        difference = number1 - number2;
        division = number1 / number2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Division is %d%n", division);
    }

}
