package lesson11.Trips17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by lapte on 11.05.2016.
 */
public class App17 {
    static Scanner sc;

    static final String[] tripType = {"отдых", "экскурсия", "лечение", "шопинг", "круиз"};
    static final String[] transportType = {"морской", "автомобильный", "железнодорожный", "авиа", "пешком"};
    static final String[] destinations = {"hawai", "brazil", "kenia", "korea", "taivan", "china"};
    static final int maxDays = 14;
    static final int minDays = 1;

    static Trip17[] trips;

    // random generator
    static {
        sc = new Scanner(System.in);
        int len;
        do {
            len = readConsoleInt("Введите размерность массива путёвок");
            if (len < 10) {
                System.out.println("Количество путёвок не может быть меньше 10. \n"
                        + "Повторите ввод данных.");
            }
        } while (len < 10);
        trips = new Trip17[len];
        String type;
        boolean food;
        int days;
        String transport;
        String destination;
        Random r = new Random();
        for (int i =0; i < trips.length; i++) {
            type = tripType[r.nextInt(tripType.length-1)];
            food = r.nextBoolean();
            days = (minDays + maxDays) - r.nextInt(maxDays);
            transport = transportType[r.nextInt(transportType.length-1)];
            destination = destinations[r.nextInt(destinations.length-1)];
            trips[i] = new Trip17(type, food, days, transport, destination);

        }
    }

    public static void main(String[] args) {
        for(Trip17 t : trips) {
            System.out.println(t);
        }

        System.out.println("Выбор по типу транспорта.");
        getByTransportType();
        Arrays.sort(trips, trips[0].new TripTypeComparator());

        System.out.println("After sorting with comparator");
        for(Trip17 t : trips) {
            System.out.println(t);
        }
    }

    static int readConsoleInt(String message) {
        System.out.println(message);
        int choise;
        while(true) {
            try{
                choise = Integer.parseInt(sc.next());
                break;
            }catch(NumberFormatException ex){
                System.out.println("Ошибка ввода. Повторите операцию.");
            }
        }

        return choise;
    }

    static void getByTransportType() {
        System.out.println("Введите тип транспорта");
        for (int i =0; i < transportType.length; i++) {
            System.out.println(i + " . " + transportType[i]);
        }
        int choise;
        do {
            choise = readConsoleInt("Введите номер типа");
            if(choise < 0 || choise >= transportType.length) {
                System.out.println("Ошибка ввода. Повторите операцию.");
            }

        } while (choise < 0 || choise >= transportType.length);
        for(Trip17 t : trips) {
            if(t.getTransport().equals(transportType[choise])) {
                System.out.println(t);
            }
        }
    }

}
