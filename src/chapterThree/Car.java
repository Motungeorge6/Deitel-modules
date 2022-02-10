package chapterThree;

public class Car {
           private String model;
           private String year;
           private double price;
public Car(String model,String year,double price)    {
    this.model = model;
    this.year = year;
    validate(price);

}
public void validate(double price){
    if(price < 0 ) System.out.println("invalid price");
    else this.price = price;
}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        validate(price);
    }

    @Override
    public String toString() {
        return "Car= {" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }
}

