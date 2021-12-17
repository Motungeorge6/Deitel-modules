import chapterFour.Cata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CataTest {

    @Test
    public void aGradeCanBeCalculatedTest(){
        Cata grade = new Cata();
        char result = grade.calcualateGradeFor(90);
               assertEquals('A', result);
    }
    @Test
    public void bGradeCanBeCalculatedTest(){
        Cata grade = new Cata();
        char result = grade.calcualateGradeFor(89);
        assertEquals('B', result);
    }
    @Test
    public void cGradeCanBeCalculatedTest(){
        Cata grade = new Cata();
        char result = grade.calcualateGradeFor(79);
        assertEquals('C', result);
    }
    @Test
    public void dGradeCanBeCalculatedTest(){
        Cata grade = new Cata();
        char result = grade.calcualateGradeFor(69);
        assertEquals('D', result);
    }
    @Test
    public void fGradeCanBeCalculatedTest(){
        Cata grade = new Cata();
        char result = grade.calcualateGradeFor(59);
        assertEquals('F', result);
    }
    }


