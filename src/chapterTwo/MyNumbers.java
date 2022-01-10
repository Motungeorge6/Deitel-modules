package chapterTwo;
import java.util.Scanner;
public class MyNumbers {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;

        int largest;
        int secondNumber;
        int thirdNumber;
        int smallest;

        System.out.print("input firstNumber");
        number1 = input.nextInt();

        System.out.print("input secondNumber");
        number2 = input.nextInt();

        System.out.print("input thirdNumber");
        number3 = input.nextInt();

        System.out.print("input fourthNumber");
        number4 = input.nextInt();

        largest = number1;

        if (number2 > largest)
            largest = number2;

        if (number3 > largest)
            largest = number3;

        if (number4 > largest)
            largest = number4;
        System.out.printf("largest is %d%n",largest);


        secondNumber = number2;

        if (number1 > secondNumber&& number1 != largest)
            secondNumber= number1;

        if (number3 > secondNumber&& number3 != largest)
            secondNumber = number3;

        if (number4 > secondNumber&& number4 != largest)
            secondNumber = number4;

        thirdNumber = number3;

        if (number1 > thirdNumber&& number1 != largest&& number1 != secondNumber)
            thirdNumber = number1;

        if  (number2 > thirdNumber && number2 != largest&& number2 != secondNumber)
            thirdNumber = number2;

        if (number4 > thirdNumber&& number4 != largest&& number4 != secondNumber)
            thirdNumber = number4;

        smallest = number4;

        if  (number1 > smallest&& number1 != largest&& number1 != secondNumber&& number1 !=thirdNumber)
            smallest = number1;

        if (number2 > smallest&& number2 != largest&& number2 != secondNumber&& number2 !=thirdNumber)
            smallest = number2;

        if (number3 > smallest&& number3 != largest&& number3 != secondNumber&& number3 !=thirdNumber)
            smallest = number3;


        System.out.printf("secondNumber is %d%n",secondNumber);
        System.out.printf("thirdNumber is %d%n",thirdNumber);
        System.out.printf("smallest is %d%n",smallest);








    }





}
