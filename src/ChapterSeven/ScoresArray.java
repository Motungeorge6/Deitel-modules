package ChapterSeven;
import java.util.Arrays;
import java.util.Scanner;
public class ScoresArray {
    public static void main(String[] args) {
        int[] scores = new int [10];
        int[] num = new int [10];
        Scanner inpiut = new Scanner(System.in);
        int total = 0;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int score;
        int counter;
        for (counter = 0; counter < scores.length; counter ++){
            System.out.println("Enter a score");
            scores[counter] = inpiut.nextInt();
            num[counter] = scores[counter];
            total= total+scores[counter];
            if (minimum > scores[counter]){
                minimum = scores[counter];

            }
            if (maximum < scores[counter]) {
                maximum = scores[counter];
            }

        }
double average = (double) total/scores.length;
        System.out.println("Print average : "+ average);
        System.out .println("Print maximum : "+ maximum);
        System.out.println("Print minimum : "+ minimum);
        System.out.println("Print total: "+ total);

        for (int i  = 0; i < num.length; i++){
            System.out.print(num[i]+ " ");
        }


    }
}
