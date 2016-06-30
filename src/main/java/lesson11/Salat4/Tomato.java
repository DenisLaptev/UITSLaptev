package lesson11.Salat4;

/**
 * Created by lapte on 01.06.2016.
 */
public class Tomato extends ParentVegetable{
    private final String NAME = "Tomato";

    public Tomato(int calories, int price, String color) {
        super(calories, price, color);
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        String vegetablesTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(vegetablesTableFormat, getNAME(), getCalories(), getPrice(), getColor(),"no item");
        return  s;

    }
}
