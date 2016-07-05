package lesson17;

import lesson17.FoodProcessor.*;
import lesson17.Fruits.*;
import lesson17.Vegetables.*;

import java.util.ArrayList;

/**
 * Created by lapte on 03.06.2016.
 */
public class Application {

    public static void main(String[] args) {

        ArrayList<Fruit> f = new ArrayList<>();
        ArrayList<Vegetable> v = new ArrayList<>();

        Apple apple1 = new Apple("Apple1", 23.4, "Red", 2, "good condition", false);
        Apple apple2 = new Apple("Apple2", 20.4, "Green", 1, "bad condition", false);
        Banana banana = new Banana("Banana", 5.1, "Yellow", 3, "normal condition", false);
        Orange orange1 = new Orange("Orange1", 3.4, "Red", 5, "good condition", true);
        Orange orange2 = new Orange("Orange2", 6.4, "Orange", 5, "good condition", true);
        Apple apple3 = new Apple("Apple3", 30.4, "Green", 1, "normal condition", true);
        Carrot carrot1 = new Carrot("Carrot1", 10.1, "Orange", 5, "normal condition", true);
        Apple apple4 = new Apple("Apple4", 23.4, "Red", 2, "good condition", false);
        Apple apple5 = new Apple("Apple5", 20.4, "Green", 1, "bad condition", false);
        Carrot carrot2 = new Carrot("Carrot2", 4.1, "Orange", 1, "bad condition", true);
        Apple apple6 = new Apple("Apple6", 23.4, "Red", 2, "good condition", false);
        Apple apple7 = new Apple("Apple7", 20.4, "Green", 7, "normal condition", false);
        Carrot carrot3 = new Carrot("Carrot3", 10.1, "Black", 10, "very bad condition", true);
        Apple apple8 = new Apple("Apple8", 23.4, "Red", 2, "good condition", false);
        Apple apple9 = new Apple("Apple9", 20.4, "Green", 1, "bad condition", false);
        Carrot carrot4 = new Carrot("Carrot4", 12.1, "Yellow", 5, "normal condition", false);

//        f.add(apple1);
//        f.add(apple2);
//        v.add(carrot3);

        Basket myBasket = new Basket(f, v);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Пустая корзина:" + "\n");
        System.out.println(myBasket);
        System.out.println("Масса корзины равна: " + myBasket.getMassOfTheBasket());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Корзина после добавления овощей и фруктов:" + "\n");

        myBasket.put(apple1);
        myBasket.put(apple2);
        myBasket.put(apple3);
        myBasket.put(apple4);
        myBasket.put(apple5);
        myBasket.put(apple6);
        myBasket.put(apple7);
        myBasket.put(apple8);
        myBasket.put(apple9);
        myBasket.put(orange1);
        myBasket.put(orange2);
        myBasket.put(banana);

        myBasket.put(carrot1);
        myBasket.put(carrot2);
        myBasket.put(carrot3);
        myBasket.put(carrot4);

        System.out.println(myBasket);
        System.out.println("Масса корзины равна: " + myBasket.getMassOfTheBasket());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Работа комбайна: ");

        FoodProcessor fp = new FoodProcessor();
        fp.cutAll(v);
        fp.slice(apple2);
        fp.peellItem(apple1);
        fp.peellItem(carrot1);
        fp.cut(carrot2);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("После работы комбайна.");
        System.out.println(myBasket);
        System.out.println("Масса корзины равна: " + myBasket.getMassOfTheBasket());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Извлекаем всё из корзины.");
        myBasket.extractAll();
        System.out.println(myBasket);
        System.out.println("Масса корзины равна: " + myBasket.getMassOfTheBasket());

    }
}