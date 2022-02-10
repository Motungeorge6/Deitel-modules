package chapterThree;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRate rate =new HeartRate("Motunrayo","George",19,3,2004);
//
//        System.out.println( rate.getLastName());;
//        System.out.println(  rate.getDay());;
//        System.out.println(rate.getMonth());;
//        System.out.println(rate.getYear());;
//
//        System.out.println(rate.getFirstName() );
        System.out.println("what is your name");
        String name = input.nextLine();
        rate.setFirstName(name);
        System.out.println(rate.getFirstName());
        rate.setLastName(name);
        System.out.println(rate.getLastName());
//
//        System.out.println("Input your date of birth");
//        int  dateOfBirth = input.nextInt();
//        rate.setDay(dateOfBirth);
//        System.out.println(rate.getDay());
//        rate.setMonth(dateOfBirth);
//        System.out.println(rate.getMonth());
//        rate.setYear(dateOfBirth);
//        System.out.println(rate.getYear(  ));
    }
}
