package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 21.05.2016.
 */
public class StudentTest1 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] LAST_NAMES = {"Иванов", "Петров", "Сидоров",
            "Кузнецов", "Пупкин", "Ньютон", "Эйнштейн", "Максвел",
            "Хокинг", "Галилей", "Ампер", "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] FIRST_NAMES = {"Иван", "Пётр", "Сидор",
            "Анатолий", "Альберт", "Георгий", "Григорий", "Александр",
            "Константин", "Денис", "Андрей", "Павел", "Антон", "Стас", "Евгений"};
    static final String[] OTCHESTVA = {"Иванович", "Петрович",
            "Сидорович", "Анатолиевич", "Альбертович", "Георгиевич",
            "Григориевич", "Александрович", "Константинович",
            "Денисович", "Андреевич", "Павлович", "Антонович",
            "Станиславович", "Евгениевич"};
    static final int[] DAY_OF_BIRTH = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
    static final int[] MONTH_OF_BIRTH = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    static final int[] YEAR_OF_BIRTH = {2000, 2001, 2002, 2003, 2004,
            2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016};
    static final String[] ADDRESS = {"Харьков", "Киев", "Москва",
            "Ленинград", "Минск", "Днепропетровск", "Суммы", "Полтава",
            "Чернигов", "Донецк", "Запорожье"};
    static final String[] TELEPHONE = {"111", "222", "333", "444", "555",
            "666", "777", "888", "999", "101010"};
    static final String[] FACULTY = {"Физический", "Математический", "Химический"};
    static final int[] COURCE = {1, 2, 3, 4, 5, 6};
    static final String[] GROUP = {"A1", "A2", "A3", "A4", "A5", "A6",
            "A7", "A8", "A9", "A10"};

    static Student1[] students;

    static {

        System.out.println("Введите число студентов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = 0;
        try {
            numberOfStudents = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        students = new Student1[numberOfStudents];


        int id;
        String lastName;
        String firstName;
        String otchestvo;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        String address;
        String telephone;
        String faculty;
        int course;
        String group;


        Random r = new Random();
        for (int i = 0; i < students.length; i++) {
            id = ID[r.nextInt(ID.length)];
            lastName = LAST_NAMES[r.nextInt(LAST_NAMES.length)];
            firstName = FIRST_NAMES[r.nextInt(LAST_NAMES.length)];
            otchestvo = OTCHESTVA[r.nextInt(OTCHESTVA.length)];
            dayOfBirth = DAY_OF_BIRTH[r.nextInt(DAY_OF_BIRTH.length)];
            monthOfBirth = MONTH_OF_BIRTH[r.nextInt(MONTH_OF_BIRTH.length)];
            yearOfBirth = YEAR_OF_BIRTH[r.nextInt(YEAR_OF_BIRTH.length)];
            address = ADDRESS[r.nextInt(ADDRESS.length)];
            telephone = TELEPHONE[r.nextInt(TELEPHONE.length)];
            faculty = FACULTY[r.nextInt(FACULTY.length)];
            course = COURCE[r.nextInt(COURCE.length)];
            group = GROUP[r.nextInt(GROUP.length)];


            students[i] = new Student1(id, lastName, firstName, otchestvo,
                    dayOfBirth, monthOfBirth, yearOfBirth, address,
                    telephone, faculty, course, group);

        }

    }

    public static void main(String[] args) {

        //Список всех студентов.
        System.out.println("Список всех студентов:");
        for (Student1 t : students) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список студентов физического факультета.
        System.out.println("Физческий факультет:");
        for (Student1 t : students) {
            if (t.getFaculty() == "Физический") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список студентов каждого факультета.
        System.out.println("Физческий факультет:");
        for (Student1 t : students) {
            if (t.getFaculty() == "Физический") {
                System.out.println(t);
            }
        }


        System.out.println("Математический факультет:");
        for (Student1 t : students) {
            if (t.getFaculty() == "Математический") {
                System.out.println(t);
            }
        }


        System.out.println("Химический факультет:");
        for (Student1 t : students) {
            if (t.getFaculty() == "Химический") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список студентов каждого курса.
        System.out.println("1 курс:");
        for (Student1 t : students) {
            if (t.getCourse() == 1) {
                System.out.println(t);
            }
        }

        System.out.println("2 курс:");
        for (Student1 t : students) {
            if (t.getCourse() == 2) {
                System.out.println(t);
            }
        }


        System.out.println("3 курс:");
        for (Student1 t : students) {
            if (t.getCourse() == 3) {
                System.out.println(t);
            }
        }

        System.out.println("4 курс:");
        for (Student1 t : students) {
            if (t.getCourse() == 4) {
                System.out.println(t);
            }
        }

        System.out.println("5 курс:");
        for (Student1 t : students) {
            if (t.getCourse() == 5) {
                System.out.println(t);
            }
        }

        System.out.println("6 курс:");
        for (Student1 t : students) {
            if (t.getCourse() == 6) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список студентов, родившихся после 2005 года.
        System.out.println("Список студентов, родившихся после 2005 года:");
        for (Student1 t : students) {
            if (t.getYearOfBirth() > 2005) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


        //Список студентов группы "A2".
        System.out.println("Список студентов группы \"A2\":");
        for (Student1 t : students) {
            if (t.getGroup() == "A2") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");


    }
}
