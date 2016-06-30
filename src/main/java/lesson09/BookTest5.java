package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by lapte on 21.05.2016.
 */
public class BookTest5 {
    static final int[] ID = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static final String[] TITLES = {"Горе от ума", "Остров сокровищ", "Война и мир",
            "Три товарища", "Тихий дон", "Преступление и наказание", "Отцы и дети",
            "Герой нашего времени", "Обломов", "Капитанская дочка", "Евгений Онегин",
            "Дубровский", "Айвенго", "Одиссея", "Анна Каренина"};
    static final String[] AUTHORS = {"Толстой", "Пушкин", "Лермонтов", "Достоевский",
            "Пупкин", "Ньютон", "Эйнштейн", "Максвел", "Хокинг", "Галилей", "Ампер",
            "Ом", "Вольт", "Ватт", "Эдисон"};
    static final String[] PUBLISHING_OFFICES = {"Мосвка", "Мир", "Научная мысль",
            "Новое издательство"};
    static final int[] YEARS_OF_PUBLISHING = {2000, 2001, 2002, 2003, 2004, 2005,
            2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016};
    static final int[] NUMBERS_OF_PAGES = {100, 200, 300, 400, 500, 600};
    static final int[] PRICES = {1000, 2000, 3000, 4000, 5000, 6000, 7000,
            8000, 9000, 1000, 1100, 1200};
    static final boolean[] IS_HARD_COVER = {true, false};


    static Book5[] books;


    static {

        System.out.println("Введите число книг.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfBooks = 0;
        try {
            numberOfBooks = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        books = new Book5[numberOfBooks];


        int id;
        String title;
        String author;
        String publishingOffice;
        int yearOfPublishing;
        int numberOfPages;
        int price;
        boolean hardCover;


        Random r = new Random();
        for (int i = 0; i < books.length; i++) {
            id = ID[r.nextInt(ID.length )];
            title = TITLES[r.nextInt(TITLES.length )];
            author = AUTHORS[r.nextInt(AUTHORS.length )];
            publishingOffice = PUBLISHING_OFFICES[r.nextInt(PUBLISHING_OFFICES.length )];
            yearOfPublishing = YEARS_OF_PUBLISHING[r.nextInt(YEARS_OF_PUBLISHING.length )];
            numberOfPages = NUMBERS_OF_PAGES[r.nextInt(NUMBERS_OF_PAGES.length )];
            price = PRICES[r.nextInt(PRICES.length )];
            hardCover = r.nextBoolean();


            books[i] = new Book5(id, title, author, publishingOffice,
                    yearOfPublishing, numberOfPages, price, hardCover);

        }

    }


    public static void main(String[] args) {
        //Список всех книг.
        System.out.println("Список всех книг:");
        for(Book5 t : books) {
            System.out.println(t);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //Список книг заданного автора ("Пушкин").
        System.out.println("Список книг заданного автора (\"Пушкин\"):");
        for(Book5 t : books) {
            if(t.getAuthor() == "Пушкин") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список книг, выпущенных заданным издательством ("Научная мысль").
        System.out.println("Список книг, выпущенных " +
                "заданным издательством (\"Научная мысль\"):");
        for(Book5 t : books) {
            if(t.getAuthor() == "Научная мысль") {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");



        //Список книг, выпущенных после заданного года ("2005").
        System.out.println("Список книг, выпущенных после заданного года (\"2005\"):");
        for(Book5 t : books) {
            if(t.getYearOfPublishing() > 2005) {
                System.out.println(t);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");





    }
}
