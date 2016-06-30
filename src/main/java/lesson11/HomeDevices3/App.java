package lesson11.HomeDevices3;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lapte on 01.06.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {
//ParentDevice(boolean isTurnOn, int power, int price)
//KitchenDevice(boolean isTurnOn, int power, int price)

        ParentDevice[] devices = new ParentDevice[5];
        devices[0] = new CookDevice(true, 50, 200);
        devices[1] = new KitchenDevice(false, 53, 100);
        devices[2] = new ParentDevice(true, 56, 500);
        devices[3] = new RoomDevice(true, 48, 400);
        devices[4] = new KitchenDevice(true, 59, 450);

        int devicesPower = 0;
        for (int i = 0; i < 5; i++) {
            devicesPower += devices[i].getPower();
        }


        System.out.println("Несортированный список приборов: ");


        printDevices(devices);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Суммарная потребляемая мощьность приборов: " +
                calculateDevicesPower(devices) + " Вт.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
// Сортировка цветов в букете по свежести.
        Arrays.sort(devices, new PowerComparator());

        System.out.println("Приборы, отсортированные по потребляемой мощьности (Power): ");
        printDevices(devices);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Найдём приборы, соответствующие заданному" +
                " диапазону цены (Price) [200, 400]: ");
        ArrayList<Integer> listOfTheDevicesIndexesWithDefinitePrice = findADevice(devices, 200, 400);

    }


    public static double calculateDevicesPower(ParentDevice[] devices) {
        double devicesPower = 0;
        for (int i = 0; i < 5; i++) {
            devicesPower += devices[i].getPower();
        }
        return devicesPower;
    }


    public static void printDevices(ParentDevice[] devices) {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += devices[i].toString() + "\n";
        }
        String devicesTableFormat = "%-20s%-15s%-15s%-15s%n";
        String s1 = String.format(devicesTableFormat, "Name", "isTurnOn?", "Power", "Price");
        String s2 = "-----------------------------------------------------------------------------";

        String s3 = "DevicesPower: " + calculateDevicesPower(devices) + " Вт.";
        System.out.println(s1 + "\n" + s2 + "\n" + str + "\n" + s3);
    }

    private static class PowerComparator implements java.util.Comparator<ParentDevice> {

        @Override
        public int compare(ParentDevice o1, ParentDevice o2) {
            return o1.getPower() - o2.getPower();
        }
    }


    // Метод ищет приборы, соответствующие заданному
    //диапазону цены (Price) в интервале [minPrice,maxPrice].
    // Метод возвращает список, содержащий индексы искомых приборов.

    public static ArrayList<Integer> findADevice(ParentDevice[] devices, int minPrice, int maxPrice) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getPrice() >= minPrice &&
                    devices[i].getPrice() <= maxPrice) {
                al.add(i);
            }
        }
        if (al.size() != 0) {
            System.out.println("Искомые приборы: ");

            String devicesTableFormat = "%-20s%-15s%-15s%-15s%n";
            String s1 = String.format(devicesTableFormat, "Name", "isTurnOn?", "Power", "Price");
            String s2 = "-----------------------------------------------------------------------------";
            System.out.println(s1 + "\n" + s2 + "\n");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(devices[al.get(i)]);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        } else {
            System.out.println("Приборов с ценой (Price) " +
                    "от " + minPrice + " до " + maxPrice + " нет.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        return al;
    }
}
