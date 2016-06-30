package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 23.05.2016.
 */
public class ProductTest9 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] NAMES = {"Snikers", "Mars", "Bounty",
            "Twix", "Milky way", "Piknick", "Nuts", "Lion"};
    static final String[] UPCS = {"UPC1", "UPC2", "UPC3", "UPC4", "UPC5"};
    static final String[] PRODUCERS = {"Nestle", "Roshen", "producer3",
            "producer4", "producer5"};
    static final int[] PRICES = {10, 20, 30, 40, 50, 60};
    static final int[] TIMES_OF_STORAGE = {1, 2, 3, 4, 5, 6, 7};
    static final int[] NUMBERS = {100, 200, 300, 400, 500, 600};

    static Product9[] products;

    static {

        System.out.println("Введите число товаров.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfProducts = 0;
        try {
            numberOfProducts = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        products = new Product9[numberOfProducts];


        int id;
        String name;
        String UPC;
        String producer;
        int price;
        int timeOfStorage;
        int number;

        Random r = new Random();
        for (int i = 0; i < products.length; i++) {
            id = ID[r.nextInt(ID.length )];
            name = NAMES[r.nextInt(NAMES.length )];
            UPC = UPCS[r.nextInt(UPCS.length )];
            producer = PRODUCERS[r.nextInt(PRODUCERS.length )];
            price = PRICES[r.nextInt(PRICES.length )];
            timeOfStorage = TIMES_OF_STORAGE[r.nextInt(TIMES_OF_STORAGE.length )];
            number = NUMBERS[r.nextInt(NUMBERS.length )];


            products[i] = new Product9(id, name, UPC, producer, price,
                    timeOfStorage, number);

        }
    }

    public static void main(String[] args) {
        //Список всех товаров.
        System.out.println("Список всех товаров:");
        for(Product9 t : products) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список товаров заданного наименования("Snikers").
        System.out.println("Список товаров заданного наименования(\"Snikers\"):");
        for(Product9 t : products) {
            if(t.getName() == "Snikers") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список товаров заданного наименования("Snikers"),
        // цена которых не превосходит заданную (40).
        System.out.println("Список товаров заданного наименования(\"Snikers\")," +
                " цена которых не превосходит заданную (40):");
        for(Product9 t : products) {
            if(t.getName() == "Snikers" && t.getPrice() <= 40) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список товаров, срок хранения которых больше заданного (4).
        System.out.println("Список товаров, срок хранения которых больше заданного (4):");
        for(Product9 t : products) {
            if(t.getTimeOfStorage() > 4) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



    }
}
