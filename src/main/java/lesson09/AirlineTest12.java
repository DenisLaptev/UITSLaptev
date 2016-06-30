package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 27.05.2016.
 */
public class AirlineTest12 {
    private String destination;
    private int numberOfTheFlight;
    private String typeOfTheAirplane;
    private int timeOfLeaving;
    private String dayOfTheWeek;


    static final String[] DESTINATIONS = {"Киев", "Москва", "Ленинград",
            "Нью Йорк", "Париж", "Лондон", "Лос Анжелес", "Мадрид",
            "Прага", "Минск"};

    static final int[] NUMBERS_OF_THE_FLIGHT = {100, 101, 102, 103, 104, 105, 106, 107,
            108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};

    static final String[] TYPES_OF_THE_AIRPLANE = {"Ту", "Ан", "Боинг",
            "Инстребитель", "Штурмовик", "Конкорд", "Буран", "Шатл",
            "Дельтаплан", "Стелс"};
    static final int[] TIMES_OF_LEAVING = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    static final String[] DAYS_OF_THE_WEEK = {"Пн", "Вт", "Ср", "Чт", "Пт",
            "Сбб", "Вс"};

    static Airline12[] airplanes;


    static {

        System.out.println("Введите число самолётов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfAirplanes = 0;
        try {
            numberOfAirplanes = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        airplanes = new Airline12[numberOfAirplanes];


        String destination;
        int numberOfTheFlight;
        String typeOfTheAirplane;
        int timeOfLeaving;
        String dayOfTheWeek;

        Random r = new Random();
        for (int i = 0; i < airplanes.length; i++) {
            destination = DESTINATIONS[r.nextInt(DESTINATIONS.length)];
            numberOfTheFlight = NUMBERS_OF_THE_FLIGHT[r.nextInt(NUMBERS_OF_THE_FLIGHT.length )];
            typeOfTheAirplane = TYPES_OF_THE_AIRPLANE[r.nextInt(TYPES_OF_THE_AIRPLANE.length )];
            timeOfLeaving = TIMES_OF_LEAVING[r.nextInt(TIMES_OF_LEAVING.length)];
            dayOfTheWeek = DAYS_OF_THE_WEEK[r.nextInt(DAYS_OF_THE_WEEK.length)];


            airplanes[i] = new Airline12(destination, numberOfTheFlight,
            typeOfTheAirplane, timeOfLeaving, dayOfTheWeek);

        }
    }

    public static void main(String[] args) {

        //Список всех рейсов.
        System.out.println("Список всех рейсов:");
        for (Airline12 t : airplanes) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список рейсов для заданного пункта назначения ("Киев").
        System.out.println("Список рейсов для заданного пункта назначения(\"Киев\"):");
        for (Airline12 t : airplanes) {
            if (t.getDestination() == "Киев") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список рейсов для заданного дня недели ("Чт").
        System.out.println("Список рейсов для заданного дня недели (\"Чт\"):");
        for (Airline12 t : airplanes) {
            if (t.getDayOfTheWeek() == "Чт") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список рейсов для заданного дня недели ("Чт"), время вылета для которых
        // больше заданного (15).
        System.out.println("Список рейсов для заданного дня недели (\"Чт\"), " +
                "время вылета для которых больше заданного (15):");
        for (Airline12 t : airplanes) {
            if (t.getDayOfTheWeek() == "Чт" && t.getTimeOfLeaving() > 15) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



    }


}
