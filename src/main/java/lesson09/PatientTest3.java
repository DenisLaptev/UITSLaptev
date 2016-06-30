package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 21.05.2016.
 */
public class PatientTest3 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] LAST_NAMES = {"Иванов", "Петров",
            "Сидоров", "Кузнецов", "Пупкин", "Ньютон", "Эйнштейн",
            "Максвел", "Хокинг", "Галилей", "Ампер", "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] FIRST_NAMES = {"Иван", "Пётр", "Сидор",
            "Анатолий", "Альберт", "Георгий", "Григорий", "Александр",
            "Константин", "Денис", "Андрей", "Павел", "Антон", "Стас", "Евгений"};
    static final String[] OTCHESTVA = {"Иванович", "Петрович",
            "Сидорович", "Анатолиевич", "Альбертович", "Георгиевич",
            "Григориевич", "Александрович", "Константинович", "Денисович",
            "Андреевич", "Павлович", "Антонович", "Станиславович", "Евгениевич"};

    static final String[] ADDRESS = {"Харьков", "Киев", "Москва", "Ленинград",
            "Минск", "Днепропетровск", "Суммы", "Полтава", "Чернигов",
            "Донецк", "Запорожье"};
    static final String[] TELEPHONE = {"111", "222", "333", "444", "555",
            "666", "777", "888", "999", "101010"};
    static final int[] MEDICAL_CARD_NUMBER = {100, 200, 300, 400, 500, 600};
    static final String[] DIAGNOZ = {"b1", "b2", "b3", "b4", "b5"};

    static Patient3[] patients;

    static {

        System.out.println("Введите число пациентов.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPatients = 0;
        try {
            numberOfPatients = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        patients = new Patient3[numberOfPatients];


        int id;
        String lastName;
        String firstName;
        String otchestvo;

        String address;
        String telephone;

        int medicalCardNumber;
        String diagnoz;


        Random r = new Random();
        for (int i = 0; i < patients.length; i++) {
            id = ID[r.nextInt(ID.length )];
            lastName = LAST_NAMES[r.nextInt(LAST_NAMES.length )];
            firstName = FIRST_NAMES[r.nextInt(LAST_NAMES.length )];
            otchestvo = OTCHESTVA[r.nextInt(OTCHESTVA.length )];

            address = ADDRESS[r.nextInt(ADDRESS.length )];
            telephone = TELEPHONE[r.nextInt(TELEPHONE.length )];

            medicalCardNumber = MEDICAL_CARD_NUMBER[r.nextInt(MEDICAL_CARD_NUMBER.length )];
            diagnoz = DIAGNOZ[r.nextInt(DIAGNOZ.length )];



            patients[i] = new Patient3(id, lastName, firstName, otchestvo,
                    1, 1, 2000, address, telephone, medicalCardNumber, diagnoz);

        }

    }

    public static void main(String[] args) {
        //Список всех пациентов.
        System.out.println("Список всех пациентов:");
        for(Patient3 t : patients) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список пациентов с диагнозом "b1".
        System.out.println("Список пациентов с диагнозом \"b1\":");
        for(Patient3 t : patients) {
            if(t.getDiagnoz() == "b1") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");




        //Список пациентов, у которых номер медицинской карточки находится
        // в заданном интервале [250,450].
        System.out.println("Список пациентов, у которых номер медицинской " +
                "карточки находится в заданном интервале [250,450]:");
        for(Patient3 t : patients) {
            if(t.getMedicalCardNumber() >= 250 && t.getMedicalCardNumber() <= 450) {
                System.out.println(t);
            }
        }
    }

}
