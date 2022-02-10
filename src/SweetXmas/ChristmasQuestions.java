//package SweetXmas;
//
//import java.util.Scanner;
//
//public class ChristmasQuestions {
//    private static int correctOnes;
//    private static String questionsAnswered;
//
//    public static <Question> void main(String[] args) {
//
////        SecureRandom question = new SecureRandom();
////        int userQuestions;
////        userQuestions = question.nextInt (5);
//
//        String q1 = "When is christmas celebrated?\n (a) January 1\n (b) May 3\n (c) December 25";
//        String q2 = "The traditional christmas tree originated from which country?\n (a) Indian\n (b) Germany\n (c) Cotonou";
//        String q3 = "Name the first US president who decorated the Christmas tree at the White House?\n (a) Olalekan Ibidapo\n (b) Franklin Leo\n (c) Franklin Pierce";
//        String q4 = "What does the red color of christmas symbolize?\n (a)The blood of christ\n (b) The blood of the ram\n (c) The blood of the chicken";
//        String q5 = "What is the use of a tree skirt?\n (a) To wear them\n (b)Gift are placed there\n (c)All of the above";
//        String q6 = "Where did the word Christmas originate?\n (a) From the latin word\n (b)From the words Cristes Maesse 'Meaning the mass of Christ\n (c)From the greek word";
//        String q7 = "Why is Christmas celebrated?\n (a)To celebrate the president\n(b)To celebate the birth of christ\n(c)To kill fowl";
//        String q8 = "The short version of Christmas is also known as what?\n (a)Xmes\n (b)Cmas\n (c)Xmas";
//        String q9 ="What is frankincense?\n (a)A plant resin with healing properties\n (b)A plant use to cure malaria\n (c)A fine robe";
//        String q10 ="What did the three wise men gift baby jesus?\n (a)Money silver and gold\n (b)Myrhh,gold and diamond\n (c)Myrhh,gold and frankincense";
//        String q11 ="What is Christmas originally known as?\n (a)Yale\n (b)Yule\n (c)Love";
//        String q12 ="What does mistletoe symbolize?\n (a)Love,joy and happiness\n (b)Love joy and compassion\n (c)All of the above";
//        String q13="Christmas was once banned in Boston,True or False?\n (a)False\n (b)Maybe\n (c)True";
//        String q14 ="What is santa's postal code?\n(a)H02\n (b)HOH OHO\n (c)Ks04";
//        String q15 = "Name the kings who visited baby jesus?\n (a)Shola,Lekan,Tunji\n (b)Segun,Sege,Increase\n (c)Casper,Melchior and Balthazar";
//        String q16 = "What is the duration between Christmas and Epiphany?\n (a)12 days\n(b)9 days\n (c)7 days";
//        String q17 = "Which country sends a huge christmas tree to London,every year?\n (a)Nigeria\n (b)Argentina\n(c)Norway";
//        String q18 = "When is Christmas celebrated in Russia?\n (a)Janaury 7\n (b)June 25\n (c)December 25";
//        String q19 = "Which famous scientist was born on 25 December?\n (a)Sir Chibuzo\n (b)Sir Isaac Newton\n (c)Sir Seyi Majek";
//        String q20 ="How many packages are shipped every year?\n (a)850 million\n (b)1 million\n (c)950 million";
//
//                SweetXmas.Question[] questions = {
//                new Question(q1, "c"),
//                new Question(q2, "b"),
//                new Question(q3, "c"),
//                new Question(q4, "a"),
//                new Question(q5, "b"),
//                new Question(q6, "b"),
//                        new Question(q7,"b"),
//                        new Question(q8,"c"),
//                        new Question(q9,"a"),
//                        new Question(q10,"c"),
//                        new Question(q11,"b"),
//                        new Question(q12, "b"),
//                        new Question(q13,"c"),
//                        new Question(q14,"b"),
//                        new Question(q15,"c"),
//                        new Question(q16,"a"),
//                        new Question(q17,"c"),
//                        new Question(q18,"a"),
//                        new Question(q19,"b"),
//                        new Question(q20,"a")};
//
//        takeTest(questions);
//
//    }
//
//
//
//
//    public static  void takeTest(Question[] questions) {
//        int score = 0;
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i].prompt);
//            String answer = input.nextLine();
//            if (answer.equals(questions[i].answer)){
//
//                score++;
//            }
//
//        }
//
//        System.out.println("You got "+ score + "/" + questions.length);
//    }
//}