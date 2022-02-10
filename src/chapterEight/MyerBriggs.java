package chapterEight;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyerBriggs {
    private static Scanner inputCollector = new Scanner(System.in);

    public static void main(String[] args) {
        Briggs();

    }

    public static void Briggs() {
        String[] array = new String[20];
        array[0] = "A. Expand Energy, Enjoy Groups    B. Conserve energy, Enjoy one on one";
        array[1] = "A. More Outgoing, Think out Loud    B. More reserved, Think to Yourself";
        array[2] = "A.Seek many tasks, Public activities   B. Seek private,Solitary activities with quiet to concentrate";
        array[3] = "A. External,Communicative,Express yourself    B. Internal,Reticent,Keep to yourself";
        array[4] = "A. Active,Initiate   B. Reflective,Deliberate";
        array[5] = "A. Interpret Literally   B. Looking for meaning and Possibilities";
        array[6] = "A. Practical,Realistic,Experiential  B. Imaginative,Innovative,Theoretical";
        array[7] = "A. Standard,Usual,Conventional     B. Different,Novel,Unique";
        array[8] = "A. Focus on here and now    B. Look to the future,Global perspective,Big picture";
        array[9] = "A. Facts,Things,'What is'   B. Ideas,Dreams,'What could be',Philosophical";
        array[10] = "A. Logical,Thinking,Questioning    B. Emphatic,Feeling,Accommodating";
        array[11] = "A. Candid,Straight forward, Frank  B. Tactful,Kind,Encouraging";
        array[12] = "A. Firm,Tend to criticize,Hold the line   B. Gentle,Tend to appreciate,Conciliate";
        array[13] = "A. Tough minded,Just   B. Tender hearted,Merciful";
        array[14] = "A. Matter of fact,Issue oriented    B. Sensitive,People oriented,Compassionate";
        array[15] = "A. Organized,Orderly   B. Flexible,Adaptable";
        array[16] = "A. Plan,Schedule  B. Unplanned,Spontaneous";
        array[17] = "A. Regulated Structured   B. Easygoing,'Live' and 'Let live'";
        array[18] = "A. Preparation,Plan ahead   B.Go with the flow,Adapt as you go";
        array[19] = "A. Control,Govern   B. Latitude,Freedom";
        array2(array);
    }

    public static void array2(String[] array) {
        String[] userResponses = new String[20];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            String collection = inputCollector.next();
            userResponses[i] = collection;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(userResponses[i]);

        }
        for (int i = 0; i < array.length; i = i + 4) {
            String value = "A";
            String value2 = "B";
            int total = 0;
            int total2 = 0;
            if (Objects.equals(userResponses[i],value)) {
                total++;
            }
            else if (Objects.equals(userResponses[i],value2)){
                total2++;
            }
            if (total < total2) {
                System.out.println("Extrovert");
            }
                else
                    System.out.println("Introvert");


        }


    }
}
