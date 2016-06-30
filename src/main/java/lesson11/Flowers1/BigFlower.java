package lesson11.Flowers1;

/**
 * Created by lapte on 31.05.2016.
 */
public class BigFlower extends BeautifulFlower {
    private final String NAME = "BigFlower";

    public BigFlower(int freshness, int length, int price, String color) {
        super(freshness, length, price, color);
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
