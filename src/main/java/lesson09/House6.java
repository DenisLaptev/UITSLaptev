package lesson09;

/**
 * Created by lapte on 23.05.2016.
 */
public class House6 {
    private int id;
    private int numberOfFlat;
    private int area;
    private int flour;
    private int numberOfRooms;
    private String street;
    private String typeOfTheBuilding;
    private int timeOfUsage;


    public House6(int id, int numberOfFlat,
                  int area, int flour,
                  int numberOfRooms, String street,
                  String typeOfTheBuilding, int timeOfUsage) {
        setId(id);
        setNumberOfFlat(numberOfFlat);
        setArea(area);
        setFlour(flour);
        setNumberOfRooms(numberOfRooms);
        setStreet(street);
        setTypeOfTheBuilding(typeOfTheBuilding);
        setTimeOfUsage(timeOfUsage);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFlour() {
        return flour;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfTheBuilding() {
        return typeOfTheBuilding;
    }

    public void setTypeOfTheBuilding(String typeOfTheBuilding) {
        this.typeOfTheBuilding = typeOfTheBuilding;
    }

    public int getTimeOfUsage() {
        return timeOfUsage;
    }

    public void setTimeOfUsage(int timeOfUsage) {
        this.timeOfUsage = timeOfUsage;
    }


    @Override
    public String toString() {
        return "House6{" +
                " id= " + id +
                ", numberOfFlat= " + numberOfFlat +
                ", area= " + area +
                ", flour= " + flour +
                ", numberOfRooms= " + numberOfRooms +
                ", street= " + street +
                ", typeOfTheBuilding= " + typeOfTheBuilding +
                ", timeOfUsage= " + timeOfUsage +
                '}';
    }
}
