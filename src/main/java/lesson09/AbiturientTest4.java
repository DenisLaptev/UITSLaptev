package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by lapte on 21.05.2016.
 */
public class AbiturientTest4 {

    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] LAST_NAMES = {"Иванов", "Петров", "Сидоров",
            "Кузнецов", "Пупкин", "Ньютон", "Эйнштейн", "Максвел",
            "Хокинг", "Галилей", "Ампер", "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] FIRST_NAMES = {"Иван", "Пётр", "Сидор",
            "Анатолий", "Альберт", "Георгий", "Григорий", "Александр",
            "Константин", "Денис", "Андрей", "Павел", "Антон", "Стас", "Евгений"};
    static final String[] OTCHESTVA = {"Иванович", "Петрович", "Сидорович",
            "Анатолиевич", "Альбертович", "Георгиевич", "Григориевич",
            "Александрович", "Константинович", "Денисович", "Андреевич",
            "Павлович", "Антонович", "Станиславович", "Евгениевич"};

    static final String[] ADDRESS = {"Харьков", "Киев", "Москва",
            "Ленинград", "Минск", "Днепропетровск", "Суммы", "Полтава",
            "Чернигов", "Донецк", "Запорожье"};
    static final String[] TELEPHONE = {"111", "222", "333", "444",
            "555", "666", "777", "888", "999", "101010"};

    static final int[] MARKS = {0, 1, 2, 3, 4, 5};

    static Abiturient4[] abiturients;

    static {

        System.out.println("Введите число студентов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfAbiturients = 0; //преобразовываем строку в число.
        try {
            numberOfAbiturients = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        abiturients = new Abiturient4[numberOfAbiturients];


        int id;
        String lastName;
        String firstName;
        String otchestvo;
        String address;
        String telephone;
        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int mark5;

        Random r = new Random();
        for (int i = 0; i < abiturients.length; i++) {
            id = ID[r.nextInt(ID.length )];
            lastName = LAST_NAMES[r.nextInt(LAST_NAMES.length )];
            firstName = FIRST_NAMES[r.nextInt(LAST_NAMES.length )];
            otchestvo = OTCHESTVA[r.nextInt(OTCHESTVA.length )];

            address = ADDRESS[r.nextInt(ADDRESS.length )];
            telephone = TELEPHONE[r.nextInt(TELEPHONE.length)];

            mark1 = MARKS[r.nextInt(MARKS.length )];
            mark2 = MARKS[r.nextInt(MARKS.length )];
            mark3 = MARKS[r.nextInt(MARKS.length )];
            mark4 = MARKS[r.nextInt(MARKS.length )];
            mark5 = MARKS[r.nextInt(MARKS.length )];



            abiturients[i] = new Abiturient4(id, lastName, firstName,
                    otchestvo, 1, 1, 2000, address, telephone,
                    mark1, mark2, mark3, mark4, mark5);

        }

    }

    public static void main(String[] args) {
        //Список всех абитуриентов.
        System.out.println("Список всех абитуриентов:");
        for(Abiturient4 t : abiturients) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список абитуриентов, имеющих неудовлетворительные оценки 2.
        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки 2:");
        for(Abiturient4 t : abiturients) {
            if(t.getMark1() == 2||t.getMark2() == 2||
                    t.getMark3() == 2||t.getMark4() == 2||
                    t.getMark5() == 2) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список абитуриентов, у которых сумма оценок
        // выше заданного числа 20 (полупроходная сумма).
        System.out.println("Список абитуриентов, " +
                "у которых сумма оценок выше заданного числа 20 (полупроходная сумма):");
        for(Abiturient4 t : abiturients) {
            int sum = t.getMark1()+t.getMark2()+t.getMark3()+t.getMark4()+t.getMark5();
            if(sum > 20) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список заданного числа (5) абитуриентов, имеющих самую высокую сумму баллов.
        System.out.println("Список заданного числа (5) абитуриентов, имеющих самую высокую сумму баллов:");
        Arrays.sort(abiturients, abiturients[0].new AbiturientComparator());

        final int NUMBER_OF_GOOD_ABITURIENTS =5;
        int [] s = new int [NUMBER_OF_GOOD_ABITURIENTS];
        for (int i = 0; i < NUMBER_OF_GOOD_ABITURIENTS; i++) {
            s[i]=abiturients[i].getMark1()+abiturients[i].getMark2()+abiturients[i].getMark3()+abiturients[i].getMark4()+abiturients[i].getMark5();
            System.out.println(abiturients[i] + ".  Сумма баллов равна = " + s[i]);
        }
    }


}
