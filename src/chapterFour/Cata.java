package chapterFour;

public class Cata {

    public char calcualateGradeFor(int score) {
        if (score>=90){return 'A';}
        if (score>79 && score < 90){return 'B';}
        if (score>69 && score < 80){return 'C';}
        if (score>59 && score < 70){return 'D';}
        return 'F';
    }

}
