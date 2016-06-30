package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 27.05.2016.
 */
public class BusTest11 {
    static final String[] LAST_NAMES_OF_DRIVER = {"Иванов", "Петров", "Сидоров",
            "Кузнецов", "Пупкин", "Ньютон", "Эйнштейн", "Максвел",
            "Хокинг", "Галилей", "Ампер", "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] FIRST_NAMES_OF_DRIVER = {"Иван", "Пётр", "Сидор",
            "Анатолий", "Альберт", "Георгий", "Григорий", "Александр",
            "Константин", "Денис", "Андрей", "Павел", "Антон", "Стас", "Евгений"};
    static final String[] OTCHESTVA_OF_DRIVER = {"Иванович", "Петрович",
            "Сидорович", "Анатолиевич", "Альбертович", "Георгиевич",
            "Григориевич", "Александрович", "Константинович",
            "Денисович", "Андреевич", "Павлович", "Антонович",
            "Станиславович", "Евгениевич"};
    static final int[] NUMBERS_OF_THE_BUS = {100, 101, 102, 103, 104, 105, 106, 107,
            108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
    static final int[] NUMBERS_OF_TRAVEL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    static final String[] MARKAS = {"Mersedes", "BMW", "FIAT", "WV", "Икарус",
            "Интурист", "ГАЗель", "Богдан", "Иван", "ЛАЗ"};
    static final int[] YEARS_OF_USAGE_BEGGINNING = {2000, 2001, 2002, 2003, 2004,
            2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016};
    static final int[] KILOMETERS = {200, 201, 202, 203, 204,
            205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216};


    static Bus11[] buses;

    static {

        System.out.println("Введите число автобусов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfBuses = 0;
        try {
            numberOfBuses = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        buses = new Bus11[numberOfBuses];


        String lastNameOfDriver;
        String firstNameOfDriver;
        String otchestvoOfDriver;
        int numberOfTheBus;
        int numberOfTheTravel;
        String marka;
        int yearOfUsageBegginning;
        int timeOfUsage;
        int kilometers;

        Random r = new Random();
        for (int i = 0; i < buses.length; i++) {
            lastNameOfDriver = LAST_NAMES_OF_DRIVER[r.nextInt(LAST_NAMES_OF_DRIVER.length)];
            firstNameOfDriver = FIRST_NAMES_OF_DRIVER[r.nextInt(FIRST_NAMES_OF_DRIVER.length )];
            otchestvoOfDriver = OTCHESTVA_OF_DRIVER[r.nextInt(OTCHESTVA_OF_DRIVER.length )];
            numberOfTheBus = NUMBERS_OF_THE_BUS[r.nextInt(NUMBERS_OF_THE_BUS.length)];
            numberOfTheTravel = NUMBERS_OF_TRAVEL[r.nextInt(NUMBERS_OF_TRAVEL.length)];
            marka = MARKAS[r.nextInt(MARKAS.length)];
            yearOfUsageBegginning = YEARS_OF_USAGE_BEGGINNING[r.nextInt(YEARS_OF_USAGE_BEGGINNING.length )];
            kilometers = KILOMETERS[r.nextInt(KILOMETERS.length)];

            buses[i] = new Bus11(lastNameOfDriver, firstNameOfDriver,
                    otchestvoOfDriver, numberOfTheBus, numberOfTheTravel,
                    marka, yearOfUsageBegginning, kilometers);

        }
    }

    public static void main(String[] args) {

        //Список всех автобусов.
        System.out.println("Список всех автобусов:");
        for (Bus11 t : buses) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список автобусов заданного номера маршрута (1).
        System.out.println("Список автобусов заданного номера маршрута (1):");
        for (Bus11 t : buses) {
            if (t.getNumberOfTheTravel() == 1) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список автобусов, которые эксплуатируются больше заданного срока (3).
        System.out.println("Список автобусов, которые " +
                "эксплуатируются больше заданного срока (3):");
        for (Bus11 t : buses) {
            if (t.getTimeOfUsage() > 3) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список автобусов, пробег которых больше заданного расстояния (210).
        System.out.println("Список автобусов, пробег которых " +
                "больше заданного расстояния (210):");
        for (Bus11 t : buses) {
            if (t.getKilometers() > 210) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");





    }

}
