package chapterEight;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        boolean hourIsNotValid = hour < 0 || hour > 23;
        if (hourIsNotValid) throw new IllegalArgumentException("Hour is not valid");
        boolean minuteIsNotValid = minute < 0 || minute > 59;
        if (minuteIsNotValid) throw new IllegalArgumentException("Minute is not valid");
        boolean secondIsNotValid = second < 0 || second > 59;
        if (secondIsNotValid) throw new IllegalArgumentException("second is not valid");

    }


    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
