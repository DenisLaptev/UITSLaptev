package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 23.05.2016.
 */
public class TrainTest10 {
    static final String[] DESTINATIONS = {"Moskow", "Kyiv", "Minsk",
            "Astana", "Leningrad", "Sumy", "Poltava", "Dnepropetrovsk"};
    static final int[] NUMBERS_OF_TRAIN = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final int[] TIMES_OF_LEAVING = {1, 2, 3, 4, 5, 6};
    static final int[] NUMBERS_OF_ALL_SEATS = {100, 200, 300, 400, 500, 600, 700};
    static final int[] NUMBERS_OF_CUPE_SEATS = {10, 20, 30, 40, 50, 60};
    static final int[] NUMBERS_OF_PLATZCART_SEATS = {10, 20, 30, 40, 50, 60};
    static final int[] NUMBERS_OF_LUX_SEATS = {10, 20, 30};

    static Train10[] trains;

    static {

        System.out.println("Введите число поездов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTrains = 0;
        try {
            numberOfTrains = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        trains = new Train10[numberOfTrains];


        String destination;
        int numberOfTheTrain;
        int timeOfLeaving;
        int numberOfAllSeats;
        int numberOfCupeSeats;
        int numberOfPltzcartSeats;
        int numberOfLuxSeats;

        Random r = new Random();
        for (int i = 0; i < trains.length; i++) {
            destination = DESTINATIONS[r.nextInt(DESTINATIONS.length)];
            numberOfTheTrain = NUMBERS_OF_TRAIN[r.nextInt(NUMBERS_OF_TRAIN.length )];
            timeOfLeaving = TIMES_OF_LEAVING[r.nextInt(TIMES_OF_LEAVING.length )];
            numberOfAllSeats = NUMBERS_OF_ALL_SEATS[r.nextInt(NUMBERS_OF_ALL_SEATS.length)];
            numberOfCupeSeats = NUMBERS_OF_CUPE_SEATS[r.nextInt(NUMBERS_OF_CUPE_SEATS.length)];
            numberOfPltzcartSeats = NUMBERS_OF_PLATZCART_SEATS[r.nextInt(NUMBERS_OF_PLATZCART_SEATS.length)];
            numberOfLuxSeats = NUMBERS_OF_LUX_SEATS[r.nextInt(NUMBERS_OF_LUX_SEATS.length )];


            trains[i] = new Train10(destination, numberOfTheTrain, timeOfLeaving,
                    numberOfAllSeats, numberOfCupeSeats, numberOfPltzcartSeats,
                    numberOfLuxSeats);

        }
    }

    public static void main(String[] args) {
        //Список всех поездов.
        System.out.println("Список всех поездов:");
        for(Train10 t : trains) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список, следующих до заданного пункта назначения ("Minsk").
        System.out.println("Список, следующих до заданного пункта назначения (\"Minsk\"):");
        for(Train10 t : trains) {
            if(t.getDestination() == "Minsk") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список, следующих до заданного пункта назначения ("Minsk") и отправляющихся
        // после заданного часа (3).
        System.out.println("Список, следующих до заданного пункта назначения (\"Minsk\") " +
                "и отправляющихся после заданного часа (3):");
        for(Train10 t : trains) {
            if(t.getDestination() == "Minsk" && t.getTimeOfLeaving() > 3) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список, следующих до заданного пункта назначения ("Minsk") и имеющих
        // одинаковое число люкс-мест.
        System.out.println("Список, следующих до заданного пункта назначения (\"Minsk\") " +
                "и имеющих одинаковое число люкс-мест:");
        for(Train10 t : trains) {
            if(t.getDestination() == "Minsk" && t.getNumberOfLuxSeats() == 10) {
                System.out.println(t + ". numberOfLuxSeats = 10");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        for(Train10 t : trains) {
            if(t.getDestination() == "Minsk" && t.getNumberOfLuxSeats() == 20) {
                System.out.println(t + ". numberOfLuxSeats = 20");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        for(Train10 t : trains) {
            if(t.getDestination() == "Minsk" && t.getNumberOfLuxSeats() == 30) {
                System.out.println(t + ". numberOfLuxSeats = 30");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");




    }

}
