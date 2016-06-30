package lesson11.Flowers1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lapte on 31.05.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {

        ParentFlower[] flowers = new ParentFlower[5];
        flowers[0] = new Rose(5, 50, 200, "Red");
        flowers[1] = new Rose(2, 53, 100, "Orange");
        flowers[2] = new BeautifulFlower(3, 56, 500, "White");
        flowers[3] = new BeautifulFlower(1, 48, 400, "Blue");
        flowers[4] = new ParentFlower(5, 59, 400);

        int buketPrice = 0;
        for (int i = 0; i < 5; i++) {
            buketPrice += flowers[i].getPrice();
        }


        Buket buket = new Buket(flowers, buketPrice);

        System.out.println("Несортированный букет: ");
        System.out.println(buket);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Стоимость букета: " + buketPrice + " грн.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
// Сортировка цветов в букете по свежести.
        Arrays.sort(flowers, new FreshnessComparator());

        System.out.println("Букет, отсортированный по свежести (Freshness): ");
        System.out.println(buket.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Найдём цветки в букете, соответствующие заданному" +
                " диапазону длин стеблей (Length) [50, 57]: ");
        ArrayList<Integer> listOfTheFlowersIndexesWithDefiniteLength = buket.findAFlower(flowers, 50, 57);

    }

    private static class FreshnessComparator implements java.util.Comparator<ParentFlower> {

        @Override
        public int compare(ParentFlower o1, ParentFlower o2) {
            return o1.getFreshness() - o2.getFreshness();
        }
    }
}
