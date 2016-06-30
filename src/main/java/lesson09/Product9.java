package lesson09;

/**
 * Created by lapte on 23.05.2016.
 */
public class Product9 {
    private int id;
    private String name;
    private String UPC;
    private String producer;
    private int price;
    private int timeOfStorage;
    private int number;

    public Product9(int id, String name, String UPC,
                    String producer, int price,
                    int timeOfStorage, int number) {
        setId(id);
        setName(name);
        setUPC(UPC);
        setProducer(producer);
        setPrice(price);
        setTimeOfStorage(timeOfStorage);
        setNumber(number);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTimeOfStorage() {
        return timeOfStorage;
    }

    public void setTimeOfStorage(int timeOfStorage) {
        this.timeOfStorage = timeOfStorage;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Product9{" +
                " id=" + getId() +
                ", name= " + getName() +
                ", UPC= " + getUPC() +
                ", producer= " + getProducer() +
                ", price= " + getPrice() +
                ", timeOfStorage= " + getTimeOfStorage() +
                ", number= " + getNumber() +
                '}';
    }
}
