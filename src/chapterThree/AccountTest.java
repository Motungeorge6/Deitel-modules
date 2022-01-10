package chapterThree;
import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {

        Account myAccount = new Account("Idowu Motunrayo", 60.00);
        Account rayoAccount = new Account("Motunrayo Idowu", 0.00);



        Scanner input = new Scanner (System.in);

        System.out.print("Enter deposit amount for my Account: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to myAccount balance%n%n", depositAmount);
        myAccount.deposit(depositAmount);

        System.out.printf("%s balance: #%.2f%n",
                myAccount.getName(), myAccount.getBalance());
        System.out.printf("%s balance: #%.2f%n",
                rayoAccount.getName(), rayoAccount.getBalance());

        System.out.print("Enter deposit amount for rayo's Account : ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to rayo's balance%n%n",
                depositAmount);
        rayoAccount.deposit(depositAmount);

        System.out.printf("%n%s balance : #%.2f%n",
                myAccount.getName(), myAccount.getBalance());
        System.out.printf("%s balance : #%.2f%n%n",
                rayoAccount.getName(), rayoAccount.getBalance());



        System.out.print("Enter withdrawal amount for myAccount : ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%n removing %.2f from myAccount %n%n",
                withdrawalAmount);
        myAccount.withdrawal(withdrawalAmount);
        System.out.printf("%n%s balance : #%.2f%n",
                myAccount.getName(), myAccount.getBalance());


        System.out.print("Enter withdrawal amount for rayo's Account : ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%n removing %.2f from %s Account %n",
                withdrawalAmount, rayoAccount.getName());
        rayoAccount.withdrawal(withdrawalAmount);


        System.out.printf("%s balance : #%.2f%n%n",
                rayoAccount.getName(), rayoAccount.getBalance());

    }
}


