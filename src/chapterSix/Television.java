package chapterSix;

public class Television {


    private int Channel;
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

    public void IncreaseChannel() {if(isOn && Channel < 10) Channel++; }

    public void decreaseChannel() {if (isOn && Channel > 1) Channel--;}

public int getChannel(){return Channel; }





        }





