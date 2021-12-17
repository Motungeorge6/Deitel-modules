package kata;


public class Kata {

    private int score;
    private String grade;

    public void changeMyScoreToGrade(int score){
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

    public String getGrade(){
        return grade;
    }



                  }








