package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 23.05.2016.
 */
public class HouseTest6 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final int[] NUMBERS_OF_FLATS = {100, 101, 102, 103, 104,
            105, 106, 107, 108, 109,
            110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
    static final int[] AREAS = {1000, 1010, 1020, 1030, 1040, 1050,
            1060, 1070, 1080, 1090,
            1100, 1110, 1120, 1130, 1140, 1150, 1160, 1170, 1180, 1190, 1200};
    static final int[] FLOURS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16};
    static final int[] NUMBERS_OF_ROOMS = {1, 2, 3, 4, 5, 100};
    static final String[] STREETS = {"ул. Сумская", "ул. Советской армии",
            "ул. Пролетарская", "ул. Красной звезды", "ул. Гарибальди",
            "ул. Блюхера", "просп. Ленина", "ул. 50 лет СССР"};
    static final String[] TYPES_OF_BUILDING = {"16-этажка", "10-этажка", "частный дом",
            "коттедж", "вилла", "замок", "крепость", "бункер"};
    static final int[] TIMES_OF_USAGE = {10, 20, 30, 40, 50};



    static House6[] flats;


    static {

        System.out.println("Введите число квартир.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfFlats = 0;
        try {
            numberOfFlats = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        flats = new House6[numberOfFlats];


        int id;
        int numberOfFlat;
        int area;
        int flour;
        int numberOfRooms;
        String street;
        String typeOfTheBuilding;
        int timeOfUsage;


        Random r = new Random();
        for (int i = 0; i < flats.length; i++) {
            id = ID[r.nextInt(ID.length )];
            numberOfFlat = NUMBERS_OF_FLATS[r.nextInt(NUMBERS_OF_FLATS.length )];
            area = AREAS[r.nextInt(AREAS.length )];
            flour = FLOURS[r.nextInt(FLOURS.length )];
            numberOfRooms = NUMBERS_OF_ROOMS[r.nextInt(NUMBERS_OF_ROOMS.length )];
            street = STREETS[r.nextInt(STREETS.length )];
            typeOfTheBuilding = TYPES_OF_BUILDING[r.nextInt(TYPES_OF_BUILDING.length )];
            timeOfUsage = TIMES_OF_USAGE[r.nextInt(TIMES_OF_USAGE.length )];


            flats[i] = new House6(id, numberOfFlat, area, flour,
                    numberOfRooms, street, typeOfTheBuilding, timeOfUsage);

        }

    }

    public static void main(String[] args) {
        //Список всех квартир.
        System.out.println("Список всех квартир:");
        for(House6 t : flats) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список квартир, имеющих заданное число комнат (3).
        System.out.println("Список квартир, имеющих заданное число комнат (3):");
        for(House6 t : flats) {
            if(t.getNumberOfRooms() == 3) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список квартир, имеющих заданное число комнат (3) и расположенных на этаже,
        // который находится в заданном промежутке [2,5].
        System.out.println("Список квартир, имеющих заданное число комнат (3) " +
                "и расположенных на этаже, который находится в заданном промежутке [2,5]:");
        for(House6 t : flats) {
            if(t.getNumberOfRooms() == 3 && (t.getFlour() >= 2&&t.getFlour() <= 5)) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список квартир, имеющих площадь, превосходящую заданную (1100).
        System.out.println("Список квартир, имеющих площадь, превосходящую заданную (1100):");
        for(House6 t : flats) {
            if(t.getArea() > 1100) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

    }


}
