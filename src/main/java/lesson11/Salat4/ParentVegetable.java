package lesson11.Salat4;

/**
 * Created by lapte on 01.06.2016.
 */
public class ParentVegetable {
    private int calories;
    private int price;
    private String color;

    public ParentVegetable(int calories, int price, String color) {
        setCalories(calories);
        setPrice(price);
        setColor(color);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        String vegetablesTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(vegetablesTableFormat, "ParentVegetable", getCalories(), getPrice(), getColor(),"no item");
        return  s;

    }
}
