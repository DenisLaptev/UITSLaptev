package lesson09;

/**
 * Created by lapte on 23.05.2016.
 */
public class Car8 {
    private int id;
    private String marka;
    private String model;
    private int yearOfProduction;
    private String color;
    private int price;
    private int registrationNumber;

    public Car8(int id, String marka, String model,
                int yearOfProduction, String color,
                int price, int registrationNumber) {
        setId(id);
        setMarka(marka);
        setModel(model);
        setYearOfProduction(yearOfProduction);
        setColor(color);
        setPrice(price);
        setRegistrationNumber(registrationNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    @Override
    public String toString() {
        return "Car8{" +
                " id= " + getId() +
                ", marka= " + getMarka() +
                ", model= " + getModel() +
                ", yearOfProduction= " + getYearOfProduction() +
                ", color= " + getColor() +
                ", price= " + getPrice() +
                ", registrationNumber= " + getRegistrationNumber() +
                '}';
    }
}
