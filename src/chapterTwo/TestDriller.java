package chapterTwo;

import java.util.Scanner;

public class TestDriller {
    //Get the number user wants to buy
//if the number is in between one and four,the price is #2000
//if the number is in netween five and nine,the price is #1800
//if the number is in between ten and twenty nine,the price is #1600
//if the number is in between thirty and forty nine, the price is #1500
//if the number is in between fifty and ninety nine,the price is #1300
//if the number is in between hundred and one hundred and ninety-nine,the price is #1200
//if the number is in between two hundred and four hundred and ninety-nine,the price is #1100
//if the number is in between five hundred and above ,the price is #1000
//calculate the amount the user will pay i.e





        public static void main(String[] args) {
            Scanner Lekan = new Scanner(System.in);


            System.out.println("Enter the number");
            int quantity = Lekan.nextInt();
            int price;


            if (quantity >= 1) {
                if (quantity <= 4) ;
                price = quantity * 2000;
                System.out.printf("the price is %d%n", price);
            }

            if (quantity >= 5) {
                if (quantity <= 9) ;
                price = quantity * 1800;
                System.out.printf("the price is %d%n", price);
            }
            if (quantity >= 10) {
                if (quantity <= 49) ;
                price = quantity * 1600;
                System.out.printf("the price is %d%n", price);
            }
            if (quantity >= 30) {
                if (quantity <= 49) ;
                price = quantity * 1500;
                System.out.printf("the price is %d%n", price);
            }
            if (quantity >= 50) {
                if (quantity < 99) ;
                price = quantity * 1300;
                System.out.printf("the price is %d%n", price);
            }
            if (quantity >= 100) {
                if (quantity < 199) ;
                price = quantity * 1200;
                System.out.printf("the price is%d%n", price);
            }
            if (quantity >= 200) {
                if (quantity <= 499) ;
                price = quantity * 1100;
                System.out.printf("the price is %d%n", price);
            }
            if (quantity >= 500) {
                price = quantity * 1000;
                System.out.printf("the price is %d%n", price);
            }


        }


    }

