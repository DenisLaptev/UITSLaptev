package lesson11.Flowers1;

/**
 * Created by lapte on 31.05.2016.
 */
public class ParentFlower {
    private int freshness;
    private int length;
    private int price;


    public ParentFlower(int freshness, int length, int price) {
        setFreshness(freshness);
        setLength(length);
        setPrice(price);
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        String flowersTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(flowersTableFormat, "ParentFlower", getFreshness(), getLength(), getPrice(), "?Color?");
        return  s;

    }


}
