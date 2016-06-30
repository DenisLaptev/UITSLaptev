package lesson11.Flowers1;

import java.util.ArrayList;

/**
 * Created by lapte on 31.05.2016.
 */
public class Buket {
    private ParentFlower[] flowers;
    private int buketPrice;


    public Buket(ParentFlower[] flowers, int buketPrice) {
        setFlower(flowers);
        setBuketPrice(buketPrice);
    }

    public ParentFlower[] getFlower() {
        return flowers;
    }

    public void setFlower(ParentFlower[] flowers) {
        this.flowers = flowers;
    }

    public int getBuketPrice() {
        return buketPrice;
    }

    public void setBuketPrice(int buketPrice) {
        this.buketPrice = buketPrice;
    }

// Метод ищет цветы из букета, длинна которых находится
// в интервале [minLength,maxLength].
// Метод возвращает список, содержащий индексы искомых цветов.

    public ArrayList<Integer> findAFlower(ParentFlower[] flovers, int minLength, int maxLength) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < flovers.length; i++) {
            if (flovers[i].getLength() >= minLength &&
                    flovers[i].getLength() <= maxLength) {
                al.add(i);
            }
        }
        if (al.size() != 0) {
            System.out.println("Искомые цветы: ");

            String flowersTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
            String s1 = String.format(flowersTableFormat, "Name", "Freshness", "Length", "Price", "Color");
            String s2 = "-----------------------------------------------------------------------------";
            System.out.println(s1 + "\n" + s2 + "\n");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(flovers[al.get(i)]);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        } else {
            System.out.println("Цветов со стеблями длиной " +
                    "от " + minLength + " до " + maxLength + " нет.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        return al;
    }


    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += flowers[i].toString() + "\n";

        }


        String flowersTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s1 = String.format(flowersTableFormat, "Name", "Freshness", "Length", "Price", "Color");
        String s2 = "-----------------------------------------------------------------------------";


        String s3 = "BuketPrice: " + getBuketPrice() + " грн.";
        return s1 + "\n" + s2 + "\n" + str + "\n" + s3;


    }

}
