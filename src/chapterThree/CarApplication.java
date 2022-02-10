package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
    Car carFord = new Car("Ford2010","2020",200000.00);
    carFord.setPrice(0.05* carFord.getPrice());
        System.out.println(carFord);

        Car rangeRover = new Car("RangeRover","2021",130000.00);
        rangeRover.setPrice(0.07 * rangeRover.getPrice());
        System.out.println(rangeRover);
        System.out.println("The year is "+rangeRover.getYear()+ " " + "The model is "+ rangeRover.getModel());

    }


}
