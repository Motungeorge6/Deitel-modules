package chapterEight;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HusbandTest {
    @Test
    public void iyawoSnatchingTest(){
        Wife petersWife = new Wife();
        Husband peter = new Husband(new Wife());
        peter.askWifeToCook("Indomie");
        BigDecimal bigDecimal = new BigDecimal("1234");
        BigDecimal bigNumber = BigDecimal.valueOf(Long.parseLong("1234"));
//        assertEquals(petersWife,peter.getIyawo());
//        Wife folaWife = new Wife();
//        Husband fola = new Husband(folaWife);
//        peter.setIyawo(folaWife,peter.getIyawo());
//        Wife personWife = peter.getIyawo();
    }
}
