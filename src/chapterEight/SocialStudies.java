package chapterEight;



import SweetXmas.Question;

import java.util.Scanner;
public class SocialStudies {


    public static void main(String[] args) {
        Questions();

    }

    public static void Questions() {

        String[] solution = new String[10];

        solution[0] = "1.___________ Family consist of father,mother and the children?\n (a)Marriage\n (b) Nuclear\n (c) Extended";
        solution[1] = "2.A group that is related by blood,adoption of marriage is ______?\n (a)Club\n (b)Union\n (c)Family";
        solution[2] = "3.The brother of your father or mother is called________?\n (a)Cousin\n (b)Uncle\n (c)Nephew";
        solution[3] = "4.The children of your uncles and aunts are our______?\n (a)Nieces\n (b)Nephew\n (c)Cousin";
        solution[4] = "5.The legal union of man and woman as husband and wife is _______?\n (a)Courtship\n (b)Marriage\n (c)Fellowship";
        solution[5] = "6.The way of life of people is called_______?\n (a)Unity\n (b)Character\n (c)Culture";
        solution[6] = "7.Some of our culture object are preserved in the ______?\n (a)Church\n (b)Mosque\n (c)Museum";
        solution[7] = "8.______ pray five times daily?\n (a)Traditional worshipper\n (b)Christians\n (c)Muslims";
        solution[8] = "9.Which of these patterns of dressing is not a Nigerian\n (a)Shirt and trouser\n (b)Babariga\n (c)Agbada";
        solution[9] = "10.Religion is the belief in _______\n (a)Existence of spirit\n (b)Existence of God and gods\n (c)Existence of man and woman";
        askQuestion(solution,answer());
    }

    public static void askQuestion(String[] solution, String[] answers) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
            String collector = input.next();
         if (collector.equals(answers[i])){
            count++;
         }

        }
        System.out.println("You scored"+" "+ count + "/10");
    }

    public static String[] answer() {
        String[] answer = new String[10];
        answer[0] = "b";
        answer[1] = "c";
        answer[2] = "b";
        answer[3] = "c";
        answer[4] = "b";
        answer[5] = "c";
        answer[6] = "c";
        answer[7] = "c";
        answer[8] = "a";
        answer[9] = "b";
        return answer;


    }
}





