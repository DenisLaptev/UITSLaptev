package lesson11.HomeDevices3;

/**
 * Created by lapte on 01.06.2016.
 */
public class ParentDevice {
    private boolean isTurnOn;
    private int power;
    private int price;

    public ParentDevice(boolean isTurnOn, int power, int price) {

        setTurnOn(isTurnOn);
        setPower(power);
        setPrice(price);
    }



    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean isTurnOn) {
        this.isTurnOn = isTurnOn;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        //ParentDevice(boolean isTurnOn, int power, int price)

        String deviceTableFormat = "%-20s%-15s%-15s%-15s%n";
        String s = String.format(deviceTableFormat, "ParentDevice", isTurnOn(), getPower(), getPrice());
        return s;

    }
}
