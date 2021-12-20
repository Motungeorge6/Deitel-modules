package kata;

import ChapterSeven.AirConditioner;
import chapterSix.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void airConditionerCanBeTurnOnTest() {
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOn();
        assertTrue(royal.isOn());

    }

    @Test
    public void airConditionerCanBeTurnOffTest() {
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOff();
        assertFalse(royal.isOn());
    }

    @Test
    public void airConditionerCanIncreaseTemperatureTest() {
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOn();
        assertTrue(royal.isOn());

        royal.increaseTemperature();
        int increase = royal.getTemperature();
        assertEquals(1, increase);
    }

    @Test
    public void airConditionerCanBeDecreaseTemperatureTest() {
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOn();
        assertTrue(royal.isOn());
        for (int number = 1; number <= 4; number++) {
            royal.increaseTemperature();
        }
        int increase = royal.getTemperature();
        assertEquals(4, increase);

        royal.decreaseTemperature();
        int decrease = royal.getTemperature();
        assertEquals(3, decrease);


    }

    @Test
    public void iCantIncreaseTemperatureWhenOffTest() {
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOn();
        for (int i = 1; i < 9; i++) {
            royal.increaseTemperature();
        }
        royal.turnOff();
        royal.increaseTemperature();
        assertEquals(8, royal.getTemperature());
    }
    @Test
    public void iCantIncreaseTemperatureBeyond27Test(){
        AirConditioner royal = new AirConditioner("royal");
                assertFalse(royal.isOn());

                royal.turnOn();
                for (int i = 1; i<=27; i++) {
                    royal.increaseTemperature();
                }
                royal.increaseTemperature();
                assertEquals(27, royal.getTemperature());
    }

    @Test
    public void iCantDecreaseTemperatureWhenOff(){
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOn();
        for (int i = 1; i < 9; i++){
            royal.increaseTemperature();
        }
        assertEquals(8,royal.getTemperature());
        for (int i = 6; i > 1; i--){
            royal.decreaseTemperature();
        }
        assertEquals(3,royal.getTemperature());
        royal.turnOff();
        royal.decreaseTemperature();
        assertEquals(3, royal.getTemperature());
    }
    @Test
    public void iCantDecreaseTemperatureBeyond0(){
        AirConditioner royal = new AirConditioner("royal");
        assertFalse(royal.isOn());

        royal.turnOn();
        for (int i = 1; i <= 27; i++){
            royal.increaseTemperature();
        }
        assertEquals(27,royal.getTemperature());
        for (int i = 27; i > 1; i--){
            royal.decreaseTemperature();
        }
        assertEquals(1,royal.getTemperature());
        royal.turnOff();
        royal.decreaseTemperature();
        assertEquals(1,royal.getTemperature());
    }

}



