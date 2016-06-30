package lesson11.Flowers1;

/**
 * Created by lapte on 31.05.2016.
 */
public class BeautifulFlower extends ParentFlower{
    private final String NAME = "BeautifulFlower";
    private String color;


    public BeautifulFlower(int freshness, int length, int price, String color) {
        super(freshness, length, price);
        this.color = color;
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
        String flowersTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(flowersTableFormat, getNAME(), getFreshness(), getLength(), getPrice(), getColor());
        return  s;

    }
}
