package chapterTwo;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner Chibuzo = new Scanner(System.in);



        System.out.println("Enter five digits");
        int digit = Chibuzo.nextInt();


        int firstdigit=(digit/10000);
        System.out.println(firstdigit);

        int seconddigit=(digit % 10000)/1000;
        System.out.println(seconddigit);

        int thirddigit=(digit % 1000)/100;
        System.out.println(thirddigit);

        int fourthdigit=(digit % 100)/10;
        System.out.println(fourthdigit);

        int fifthdigit=(digit % 10)/1;
        System.out.println(fifthdigit);

        if(firstdigit==fifthdigit){
            if(seconddigit==fourthdigit){
                System.out.println("It is palindrome");


            }
        }


        if(firstdigit!=fifthdigit){
            if(seconddigit!=fourthdigit){
                System.out.println("It is not a palindrome");
            }
        }



    }

}
