package lesson11.Sweets2;

import java.util.ArrayList;

/**
 * Created by lapte on 01.06.2016.
 */
public class NewYearPresent {
    private ParentSweet[] sweets;
    private int presentMass;


    public NewYearPresent(ParentSweet[] sweets, int presentMass) {
        setSweets(sweets);
        setPresentMass(presentMass);
    }

    public ParentSweet[] getSweets() {
        return sweets;
    }

    public void setSweets(ParentSweet[] sweets) {
        this.sweets = sweets;
    }

    public int getPresentMass() {
        return presentMass;
    }

    public void setPresentMass(int presentMass) {
        this.presentMass = presentMass;
    }

    // Метод ищет конфеты из подарка, соответствующие заданному
    // диапазону содержания сахара [minSugar,maxSugar].
// Метод возвращает список, содержащий индексы искомых конфет.

    public ArrayList<Integer> findASweet(ParentSweet[] sweets, int minSugar, int maxSugar) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < sweets.length; i++) {
            if (sweets[i].getSugar() >= minSugar &&
                    sweets[i].getSugar() <= maxSugar) {
                al.add(i);
            }
        }
        if (al.size() != 0) {
            System.out.println("Искомые конфеты: ");

            String sweetsTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
            String s1 = String.format(sweetsTableFormat, "Name", "Mass", "Size", "Sugar", "Color");
            String s2 = "-----------------------------------------------------------------------------";
            System.out.println(s1 + "\n" + s2 + "\n");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(sweets[al.get(i)]);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        } else {
            System.out.println("Конфет  с содержанием сахара " +
                    "от " + minSugar + " до " + maxSugar + " нет.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        return al;
    }


    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += sweets[i].toString() + "\n";

        }


        String sweetsTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s1 = String.format(sweetsTableFormat, "Name", "Mass", "Size", "Sugar", "Color");

        String s2 = "-----------------------------------------------------------------------------";


        String s3 = "PresentMass: " + getPresentMass() + " г.";
        return s1 + "\n" + s2 + "\n" + str + "\n" + s3;


    }

}
