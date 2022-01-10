package kata;

import chapterSix.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void televisionCanBeTurnOnTest() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        assertTrue(sony.isOn());
    }

    @Test
    public void televisionCanBeTurnOffTest() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());
        sony.turnOn();
        assertTrue(sony.isOn());

        sony.turnOff();
        assertFalse(sony.isOn());
    }

    @Test
    public void televisionCanIncreaseVolume() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        assertTrue(sony.isOn());

        for (int i  = 1; i < 10; i++){
            sony.increaseVolume();
        }

        int increase = sony.getVolume();
        assertEquals(9, increase);
    }

    @Test
    public void televisionCanDecreaseVolume() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        assertTrue(sony.isOn());
        for (int number = 1; number <= 4; number++) {
            sony.increaseVolume();
        }
        int increase = sony.getVolume();
        assertEquals(4, increase);

        sony.decreaseVolume();
        int decrease = sony.getVolume();
        assertEquals(3, decrease);
    }

    @Test
    public void iCantIncreaseTelevisionWhenOffTest() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        assertTrue(sony.isOn());
        for (int i = 1; i < 9; i++) {
            sony.increaseVolume();
        }
        assertEquals(8,sony.getVolume());
        sony.turnOff();
        sony.increaseVolume();
        assertEquals(8, sony.getVolume());
    }

    @Test
    public void iCantIncreaseVolumeBeyond100Test() {

        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        for (int i = 1; i <= 100; i++) {
            sony.increaseVolume();
        }
        sony.increaseVolume();
        assertEquals(100, sony.getVolume());
    }

    @Test
    public void iCantDecreaseTelevisionWhenOff() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        for (int i = 1; i < 9; i++) {
            sony.increaseVolume();
        }
        assertEquals(8, sony.getVolume());
        for (int i = 6; i > 1; i--) {
            sony.decreaseVolume();
        }
        assertEquals(3, sony.getVolume());
        sony.turnOff();
        sony.decreaseVolume();
        assertEquals(3, sony.getVolume());
    }

    @Test
    public void iCantDecreaseVolumeBeyond0() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        for (int i = 1; i <= 100; i++) {
            sony.increaseVolume();
        }
        assertEquals(100, sony.getVolume());
        for (int i = 1; i <= 100; i++) {
            sony.decreaseVolume();
        }
        assertEquals(0, sony.getVolume());

    }

    @Test
    public void televisionCanIncreaseChannelTest() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        for (int  i= 10 ; i <10 ; i++) {
            assertEquals(10, sony.getChannel());
            sony.IncreaseChannel();

        }
    }

    @Test
     public void televisionCanDecreaseChannelTest() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());
        sony.turnOn();
        for (int i = 10; i < 10; i++) {
            assertEquals(10, sony.getChannel());
            sony.IncreaseChannel();
        }

        sony.turnOn();
            assertEquals(0,sony.getChannel());
            sony.decreaseChannel();

        }




    }


