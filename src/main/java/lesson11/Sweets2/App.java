package lesson11.Sweets2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lapte on 01.06.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {

        //public ParentSweet(int weight, int size, double sugar)
        //ChocolateSweet(int weight, int size, double sugar, String color)
        //BigChocolateSweet(int weight, int size, double sugar, String color)
        //NewSweet(int weight, int size, double sugar) {


        ParentSweet[] sweets = new ParentSweet[5];

        sweets[0] = new ChocolateSweet(15, 14, 20.5, "Red");
        sweets[1] = new BigChocolateSweet(50, 20, 25, "Orange");
        sweets[2] = new NewSweet(10, 5, 2);
        sweets[3] = new BigChocolateSweet(45, 19, 22, "Blue");
        sweets[4] = new ParentSweet(25, 15, 10);

        int presentMass = 0;
        for (int i = 0; i < 5; i++) {
            presentMass += sweets[i].getMass();
        }


        NewYearPresent newYearPresent = new NewYearPresent(sweets, presentMass);
        //NewYearPresent(ParentSweet[] sweets, int presentWeight)

        System.out.println("Несортированный подарок: ");
        System.out.println(newYearPresent);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Масса подарка: " + presentMass + " г.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
// Сортировка конфет в подарке по размеру.
        Arrays.sort(sweets, new SizeComparator());

        System.out.println("Подарок с конфетами, отсортированными по размеру (Size): ");
        System.out.println(newYearPresent.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Найдём конфеты в подарке, соответствующие заданному" +
                " диапазону содержания сахара (Sugar) [10, 21]: ");
        ArrayList<Integer> listOfTheSweetsIndexesWithDefiniteSugarContaining = newYearPresent.findASweet(sweets, 10, 21);

    }

    private static class SizeComparator implements java.util.Comparator<ParentSweet> {

        @Override
        public int compare(ParentSweet o1, ParentSweet o2) {
            return o1.getSize() - o2.getSize();
        }
    }
}
