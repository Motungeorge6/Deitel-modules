package chapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public HeartRate(String firstName, String lastName, int day, int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public int displayYear(){
        int year = 2020;
        return year - getYear();
    }
    public int maximumHeartRate(){
        int rate = 220 - displayYear();
        return rate;
    }
    public double heartRate(){
        return 0.70 * maximumHeartRate();
    }
}
