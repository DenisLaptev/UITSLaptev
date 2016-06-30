package lesson11.HomeDevices3;

/**
 * Created by lapte on 01.06.2016.
 */
public class CookDevice extends KitchenDevice{
    private final String NAME = "CookDevice";

    public CookDevice(boolean isTurnOn, int power, int price) {
        super(isTurnOn, power, price);
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
