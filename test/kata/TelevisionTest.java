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


        sony.turnOff();
        assertFalse(sony.isOn());
    }

    @Test
    public void televisionCanIncreaseVolume() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        assertTrue(sony.isOn());

        sony.increaseVolume();
        int increase = sony.getVolume();
        assertEquals(1, increase);
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
        for (int i = 1; i < 9; i++) {
            sony.increaseVolume();
        }
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
        for (int i = 100; i > 1; i--) {
            sony.decreaseVolume();
        }
        assertEquals(1, sony.getVolume());
        sony.turnOff();
        sony.decreaseVolume();
        assertEquals(1, sony.getVolume());

    }

    @Test
    public void televisionCanIncreaseChannel() {
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

        sony.turnOn();
        for (int i = 20; i < 2; i++) {
            sony.IncreaseChannel();
        }
    }
    @Test
    public void televisionCanDecreaseChannel(){
        Television sony = new Television("sony");
        assertFalse(sony.isOn());

    }
}

