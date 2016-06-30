package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by lapte on 23.05.2016.
 */
public class PhoneTest7 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] LAST_NAMES = {"Иванов", "Петров", "Сидоров",
            "Кузнецов", "Пупкин", "Ньютон", "Эйнштейн", "Максвел", "Хокинг",
            "Галилей", "Ампер", "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] FIRST_NAMES = {"Иван", "Пётр", "Сидор", "Анатолий",
            "Альберт", "Георгий", "Григорий", "Александр", "Константин", "Денис",
            "Андрей", "Павел", "Антон", "Стас", "Евгений"};
    static final String[] OTCHESTVA = {"Иванович", "Петрович", "Сидорович",
            "Анатолиевич", "Альбертович", "Георгиевич", "Григориевич",
            "Александрович", "Константинович", "Денисович", "Андреевич",
            "Павлович", "Антонович", "Станиславович", "Евгениевич"};

    static final String[] ADDRESS = {"Харьков", "Киев", "Москва", "Ленинград",
            "Минск", "Днепропетровск", "Суммы", "Полтава", "Чернигов", "Донецк",
            "Запорожье"};
    static final int[] CREDIT_CARD_NUMBERS = {100, 101, 102, 103, 104, 105, 106,
            107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};

    static final int[] DEBITS = {1001, 1011, 1021, 1031, 1041, 1051, 1061,
            1071, 1081, 1091, 1101, 1111, 1121, 1131, 1141, 1151, 1161, 1171,
            1181, 1119, 1120};

    static final int[] CREDITS = {2100, 2101, 2102, 2103, 2104, 2105, 2106,
            2107, 2108, 2109, 2110, 2111, 2112, 2113, 2114, 2115, 2116, 2217,
            2118, 2119, 2120};

    static final int[] TIMES_OF_THE_CITY_CALLS = {3000, 3101, 3102, 3103,
            3104, 3105, 3106,
            3107, 3108, 3109, 3110, 3111, 3112, 3113, 3114, 3115, 3116,
            3117, 3118, 3119, 3120};

    static final int[] TIMES_OF_THE_INTERCITY_CALLS = {0, 1, 2};

    static Phone7[] abonents;

    static {

        System.out.println("Введите число абонентов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfAbonents = 0;
        try {
            numberOfAbonents = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        abonents = new Phone7[numberOfAbonents];


        int id;
        String lastName;
        String firstName;
        String otchestvo;
        String address;
        int creditCardNumber;
        int debit;
        int credit;
        int timeOfTheCityCalls;
        int timeOfTheIntercityCalls;


        Random r = new Random();
        for (int i = 0; i < abonents.length; i++) {
            id = ID[r.nextInt(ID.length )];
            lastName = LAST_NAMES[r.nextInt(LAST_NAMES.length )];
            firstName = FIRST_NAMES[r.nextInt(LAST_NAMES.length )];
            otchestvo = OTCHESTVA[r.nextInt(OTCHESTVA.length )];
            address = ADDRESS[r.nextInt(ADDRESS.length )];
            creditCardNumber = CREDIT_CARD_NUMBERS[r.nextInt(CREDIT_CARD_NUMBERS.length )];
            debit = DEBITS[r.nextInt(DEBITS.length )];
            credit = CREDITS[r.nextInt(CREDITS.length )];
            timeOfTheCityCalls = TIMES_OF_THE_CITY_CALLS[r.nextInt(TIMES_OF_THE_CITY_CALLS.length )];
            timeOfTheIntercityCalls = TIMES_OF_THE_INTERCITY_CALLS[r.nextInt(TIMES_OF_THE_INTERCITY_CALLS.length )];


            abonents[i] = new Phone7(id, lastName, firstName, otchestvo, 1, 1,
                    2000, address, "111", creditCardNumber, debit, credit,
                    timeOfTheCityCalls, timeOfTheIntercityCalls);

        }

    }

    public static void main(String[] args) {
        //Список всех абонентов.
        System.out.println("Список всех абонентов:");
        for(Phone7 t : abonents) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список абонентов, у которых время внутригородских
        // разговоров превышает заданное (3110).
        System.out.println("Список абонентов, у которых время внутригородских " +
                "разговоров превышает заданное (3110):");
        for(Phone7 t : abonents) {
            if(t.getTimeOfTheCityCalls() > 3110) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список абонентов, которые пользовались междугородней связью.
        System.out.println("Список абонентов, которые пользовались междугородней связью:");
        for(Phone7 t : abonents) {
            if(t.getTimeOfTheIntercityCalls() != 0 ) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список всех абонентов в алфавитном порядке.
        System.out.println("Список всех абонентов в алфавитном " +
                "порядке (после сортировки с использованием компаратора):");
        Arrays.sort(abonents, abonents[0].new AbonentComparator());

        for(Phone7 t : abonents) {
            System.out.println(t);
        }
    }

}
