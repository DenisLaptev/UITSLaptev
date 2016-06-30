package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by lapte on 21.05.2016.
 */
public class CustomerTest2 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
            13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] LAST_NAMES = {"Иванов", "Петров", "Сидоров",
            "Кузнецов", "Пупкин", "Ньютон", "Эйнштейн", "Максвел",
            "Хокинг", "Галилей", "Ампер", "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] FIRST_NAMES = {"Иван", "Пётр", "Сидор",
            "Анатолий", "Альберт", "Георгий", "Григорий", "Александр",
            "Константин", "Денис", "Андрей", "Павел", "Антон", "Стас", "Евгений"};
    static final String[] OTCHESTVA = {"Иванович", "Петрович",
            "Сидорович", "Анатолиевич", "Альбертович", "Георгиевич",
            "Григориевич", "Александрович", "Константинович", "Денисович",
            "Андреевич", "Павлович", "Антонович", "Станиславович", "Евгениевич"};
    static final String[] ADDRESS = {"Харьков", "Киев", "Москва", "Ленинград",
            "Минск", "Днепропетровск", "Суммы", "Полтава", "Чернигов", "Донецк",
            "Запорожье"};
    static final int[] CARD_NUMBER = {100, 200, 300, 400, 500, 600};
    static final String[] BANK_ACCOUNT = {"Ac1", "Ac2", "Ac3", "Ac4", "Ac5",
            "Ac6", "Ac7", "Ac8", "Ac9", "Ac10"};

    static Customer2[] customers;

    static {

        System.out.println("Введите число клиентов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCustomers = 0; //преобразовываем строку в число.
        try {
            numberOfCustomers = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        customers = new Customer2[numberOfCustomers];


        int id;
        String lastName;
        String firstName;
        String otchestvo;
        String address;
        int cardNumber;
        String bankAccount;


        Random r = new Random();
        for (int i = 0; i < customers.length; i++) {
            id = ID[r.nextInt(ID.length )];
            lastName = LAST_NAMES[r.nextInt(LAST_NAMES.length )];
            firstName = FIRST_NAMES[r.nextInt(LAST_NAMES.length )];
            otchestvo = OTCHESTVA[r.nextInt(OTCHESTVA.length )];
            address = ADDRESS[r.nextInt(ADDRESS.length )];
            cardNumber = CARD_NUMBER[r.nextInt(CARD_NUMBER.length )];
            bankAccount = BANK_ACCOUNT[r.nextInt(BANK_ACCOUNT.length )];


            customers[i] = new Customer2(id, lastName, firstName,
                    otchestvo, 1, 1, 2000, address, "111", cardNumber, bankAccount);

        }

    }

    public static void main(String[] args) {
        //Список всех клиентов.
        System.out.println("Список всех клиентов:");
        for(Customer2 t : customers) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список всех клиентов в алфавитном порядке.
        System.out.println("Список всех клиентов в алфавитном " +
                "порядке (после сортировки с использованием компаратора):");
        Arrays.sort(customers, customers[0].new CustomerComparator());

        for(Customer2 t : customers) {
            System.out.println(t);
        }


        //Список клиентов, у которых номер кредитной карточки находится
        // в заданном интервале [250,450].
        System.out.println("Список клиентов, у которых номер кредитной " +
                "карточки находится в заданном интервале [250,450]:");
        for(Customer2 t : customers) {
            if(t.getCardNumber() >= 250 && t.getCardNumber() <= 450) {
                System.out.println(t);
            }
        }





    }


}
