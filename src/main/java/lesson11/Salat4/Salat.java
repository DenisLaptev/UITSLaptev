package lesson11.Salat4;


import java.util.ArrayList;

/**
 * Created by lapte on 01.06.2016.
 */
public class Salat {
    private ParentVegetable[] vegetables;
    private int calories;

    public Salat(ParentVegetable[] vegetables, int calories) {
        setVegetables(vegetables);
        setCalories(calories);
    }

    public ParentVegetable[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(ParentVegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    // Метод ищет овощи из салата, соответствующие заданному
    // диапазону калорийности [minCalories,maxCalories].
// Метод возвращает список, содержащий индексы искомых овощей.

    public ArrayList<Integer> findAVegetable(ParentVegetable[] vegetables, int minCalories, int maxCalories) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].getCalories() >= minCalories &&
                    vegetables[i].getCalories() <= maxCalories) {
                al.add(i);
            }
        }
        if (al.size() != 0) {
            System.out.println("Искомые овощи: ");

            String vegetablesTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
            String s1 = String.format(vegetablesTableFormat, "Name", "Calories", "Price", "Color", "Special item");
            String s2 = "-----------------------------------------------------------------------------";
            System.out.println(s1 + "\n" + s2 + "\n");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(vegetables[al.get(i)]);
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        } else {
            System.out.println("Овощей с калорийностью (Calories) " +
                    "от " + minCalories + " до " + maxCalories + " нет.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        }
        return al;
    }


    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += vegetables[i].toString() + "\n";

        }


        String vegetablesTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s1 = String.format(vegetablesTableFormat, "Name", "Calories", "Price", "Color", "Special item");
        String s2 = "-----------------------------------------------------------------------------";


        String s3 = "Calories: " + getCalories() + " k.";
        return s1 + "\n" + s2 + "\n" + str + "\n" + s3;


    }

}
