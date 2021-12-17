package chapterSix;

public class Television {


    private int IncreaseChannel;
    private int volume;
    private  boolean isOn;

    public Television(String tVName) {

    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn=false;
    }

    public void increaseVolume(){
       if(isOn && volume < 100) volume++;
    }

    public void turnOn() { isOn = true;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
      if (isOn && volume > 0)  volume--;
    }

    public void IncreaseChannel() {
        int channel = 0;
        if (isOn && channel > 2) channel++;
    }
}
