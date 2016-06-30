package lesson11.Sweets2;

/**
 * Created by lapte on 01.06.2016.
 */
public class BigChocolateSweet extends ChocolateSweet {
    private final String NAME = "BigChocolateSweet";

    public BigChocolateSweet(int mass, int size, double sugar, String color) {
        super(mass, size, sugar, color);
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
