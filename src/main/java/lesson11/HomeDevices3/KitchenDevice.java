package lesson11.HomeDevices3;

/**
 * Created by lapte on 01.06.2016.
 */
public class KitchenDevice extends ParentDevice {
    private final String NAME = "KitchenDevice";

    public KitchenDevice(boolean isTurnOn, int power, int price) {
        super(isTurnOn, power, price);
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        //KitchenDevice(boolean isTurnOn, int power, int price)

        String deviceTableFormat = "%-20s%-15s%-15s%-15s%n";
        String s = String.format(deviceTableFormat, getNAME(), isTurnOn(), getPower(), getPrice());
        return s;

    }
}
