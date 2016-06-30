package lesson11.Salat4;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lapte on 01.06.2016.
 */
public class App {
    public static void main(String[] args) throws IOException {

        //ParentVegetable(int calories, int price, String color)
        //Tomato(int calories, int price, String color)
        //BigTomato(int calories, int price, String color, String speciality)
        //Onion(int calories, int price, String color)
        //Cabage(int calories, int price, String color)



        ParentVegetable[] vegetables = new ParentVegetable[5];

        vegetables[0] = new ParentVegetable(15, 40, "Green");
        vegetables[1] = new Tomato(50, 20, "Orange");
        vegetables[2] = new BigTomato(10, 50, "Red", "Tasty vegetable");
        vegetables[3] = new Onion(45, 35, "Green");
        vegetables[4] = new Cabage(25, 15, "White");

        int salatCalories = 0;
        for (int i = 0; i < 5; i++) {
            salatCalories += vegetables[i].getCalories();
        }


        Salat salat = new Salat(vegetables, salatCalories);
        //Salat(ParentVegetable[] vegetables, int calories)

        System.out.println("Несортированный салат: ");
        System.out.println(salat);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Калорийность салата: " + salatCalories + " к.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");
// Сортировка овощей в салате по цене.
        Arrays.sort(vegetables, new PriceComparator());

        System.out.println("Салат с овощами, отсортированными по цене (Price): ");
        System.out.println(salat.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Найдём овощи в салате, соответствующие заданному" +
                " диапазону калорийности (Calories) [15, 45]: ");
        ArrayList<Integer> listOfTheVegetablesIndexesWithDefiniteCalories = salat.findAVegetable(vegetables, 15, 45);

    }

    private static class PriceComparator implements java.util.Comparator<ParentVegetable> {

        @Override
        public int compare(ParentVegetable o1, ParentVegetable o2) {
            return o1.getPrice() - o2.getPrice();
        }
    }
}
