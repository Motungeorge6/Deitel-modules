package chapterFour;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input value");
        int num = input.nextInt();

        int num1 = num/1000;
        int num2 =( num % 1000)/100;
        int num3 = (num % 100)/10;
        int num4 = (num % 10);

        int encryptednum1 = (num1 + 7) % 10;
        int encryptednum2 = (num2 + 7) % 10;
        int encryptednum3 = (num3 + 7) % 10;
        int encryptednum4 = (num4 + 7) % 10;

        System.out.println("Your num has been encrypted as:");
        System.out.printf("%d%d%d%d", encryptednum3, encryptednum4, encryptednum1, encryptednum2);
    }
}
