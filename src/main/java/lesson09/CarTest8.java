package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 23.05.2016.
 */
public class CarTest8 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] MARKS = {"Mersedes", "BMW", "Porshe",
            "Alfa Romeo", "Opel", "Ford", "WV", "Mitsubishi"};
    static final String[] MODELS = {"model1", "model2", "model3", "model4", "model5"};
    static final int[] YEARS_OF_PRODUCTION = {2000, 2001, 2002, 2003,
            2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013
            , 2014, 2015, 2016};

    static final int CURRENT_YEAR = 2016;
    static final String[] COLORS = {"RED", "BLACK", "SILVER", "GREEN", "BLUE",
            "YELLOW", "WHITE", "GREY"};
    static final int[] PRICES = {1000000, 2000000, 3000000, 4000000, 5000000, 6000000};
    static final int[] REGISTRATION_NUMBERS = {100, 200, 300, 400, 500, 600};

    static Car8[] cars;

    static {

        System.out.println("Введите число машин.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCars = 0;
        try {
            numberOfCars = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        cars = new Car8[numberOfCars];


        int id;
        String marka;
        String model;
        int yearOfProduction;
        String color;
        int price;
        int registrationNumber;


        Random r = new Random();
        for (int i = 0; i < cars.length; i++) {
            id = ID[r.nextInt(ID.length )];
            marka = MARKS[r.nextInt(MARKS.length )];
            model = MODELS[r.nextInt(MODELS.length )];
            yearOfProduction = YEARS_OF_PRODUCTION[r.nextInt(YEARS_OF_PRODUCTION.length )];
            color = COLORS[r.nextInt(COLORS.length )];
            price = PRICES[r.nextInt(PRICES.length )];
            registrationNumber = REGISTRATION_NUMBERS[r.nextInt(REGISTRATION_NUMBERS.length )];


            cars[i] = new Car8(id, marka, model, yearOfProduction,
                    color, price, registrationNumber);

        }
    }

    public static void main(String[] args) {
        //Список всех автомобилей.
        System.out.println("Список всех машин:");
        for(Car8 t : cars) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список автомобилей заданной марки ("Mersedes").
        System.out.println("Список автомобилей заданной марки (\"Mersedes\"):");
        for(Car8 t : cars) {
            if(t.getMarka() == "Mersedes") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список автомобилей заданной модели ("model2"),
        // которые эксплуатируются больше 5 лет.
        System.out.println("Список автомобилей заданной модели (\"model2\"), " +
                "которые эксплуатируются больше 5 лет.:");
        for(Car8 t : cars) {
            if(t.getModel() == "model2" && (CURRENT_YEAR - t.getYearOfProduction()) > 5) {
                System.out.println(t + ". Expluatation= " +
                        (CURRENT_YEAR - t.getYearOfProduction()) + " years.");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список автомобилей заданного года выпуска (2008),
        // цена которых больше указанной (3000000).
        System.out.println("Список автомобилей заданного года выпуска (2008)," +
                " цена которых больше указанной (3000000):");
        for(Car8 t : cars) {
            if(t.getYearOfProduction() == 2008 && t.getPrice() > 3000000) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");





    }

}
