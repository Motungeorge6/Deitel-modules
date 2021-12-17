package chapterFour;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input four number");
        int encryptednum = input.nextInt();


        int Firstnum = encryptednum /1000;
        int secondnum = (encryptednum % 1000) / 100;
        int thirdnum = (encryptednum % 1000) / 10;
        int fourthnum = (encryptednum % 10);

        double initialDecryptednum1 =((1.0 +((double)Firstnum / 10)) * 10);
        double initialDecryptednum2 = ((1.0 +((double) secondnum / 10)) * 10);
        double initialDecryptednum3 =((1.0 + ((double) thirdnum / 10)) * 10);
        double initialDecryptednum4 =((1.0+ ((double) fourthnum / 10)) * 10);

        double finalDecryptednum1 = (initialDecryptednum1 - 7) % 10;
        double finalDecryptednum2 = (initialDecryptednum2 - 7) % 10;
        double finalDecryptednum3 = (initialDecryptednum3 - 7) % 10;
        double finalDecryptednum4 = (initialDecryptednum4 - 7) % 10;

        int realnum1 =(int) Math.round(finalDecryptednum1);
        int realnum2 =(int) Math.round(finalDecryptednum2);
        int realnum3 =(int) Math.round(finalDecryptednum3);
        int realnum4 =(int) Math.round(finalDecryptednum4);

        System.out.println("Your num has been decrypted. This is the real num");
        System.out.printf("%d%d%d%d", realnum3,realnum4,realnum1,realnum2);
    }
}
