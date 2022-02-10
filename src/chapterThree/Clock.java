package chapterThree;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        validateMinute(minutes);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public Clock(int hour, int minutes, int seconds) {
        validate(hour, minutes, seconds);
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        }

        public void validate(int hours,int minute,int second){
            if (hours > 23 || minute > 59 || second > 59) System.out.println("Time not correct");
    }
      public void validateHour(int hours){
        if (hours > 23) System.out.println("Hour is out of range");
}
      public void validateMinute(int minutes){
        if (minutes > 59) System.out.println("Minute is out of range");

}
public void validateSeconds(int seconds){
        if (seconds > 59) System.out.println("Seconds is out range");
}
    }
