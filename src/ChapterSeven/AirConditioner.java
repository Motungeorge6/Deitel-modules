package ChapterSeven;

public class AirConditioner {
    private boolean isOn;
    private int Temperature;

    public AirConditioner(String aCName){

    }

    public boolean isOn() {return isOn;

    }

    public void turnOn() {isOn = true;

    }

    public void turnOff() {isOn= false;

    }

    public void increaseTemperature(){if(isOn && Temperature < 27) Temperature++;
    }




    public int getTemperature() {return Temperature;}


    public void decreaseTemperature() {if (isOn && Temperature > 0)  Temperature--;
    }
}
