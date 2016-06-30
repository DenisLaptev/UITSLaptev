package lesson11.Sweets2;

/**
 * Created by lapte on 01.06.2016.
 */
public class ChocolateSweet extends ParentSweet {
    private final String NAME = "ChocolateSweet";
    private String color;

    public ChocolateSweet(int mass, int size, double sugar, String color) {
        super(mass, size, sugar);
        setColor(color);
    }

    public String getNAME() {
        return NAME;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String sweetsTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(sweetsTableFormat, getNAME(), getMass(), getSize(), getSugar(), getColor());
        return  s;

    }

}
