package chapterFour;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
      int score = input.nextInt();
      if (score >= 90) {
          System.out.println("Grade is A");
      }else if (score >=80) {
                  System.out.println("Grade is B");
              } else if (score >= 70) {
                  System.out.println("Grade is C");
              }else if (score>=60) {
                      System.out.println("Grade is D");
                  }else {
                          System.out.println("Grade is F, you need to put more effort");
                      }
                      }
                  }







