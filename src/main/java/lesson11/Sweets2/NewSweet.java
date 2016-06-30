package lesson11.Sweets2;

/**
 * Created by lapte on 01.06.2016.
 */
public class NewSweet extends ParentSweet {
    private final String NAME = "NewSweet";

    public NewSweet(int mass, int size, double sugar) {
        super(mass, size, sugar);
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
