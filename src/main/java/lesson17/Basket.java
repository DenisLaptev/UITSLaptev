package lesson17;

import java.util.ArrayList;

/**
 * Created by lapte on 03.06.2016.
 */
public class Basket {

    ArrayList<Fruit> fruitsInTheBasket;
    ArrayList<Vegetable> vegetablesInTheBasket;
    double massOfTheBasket;

    public Basket(ArrayList<Fruit> fruitsInTheBasket,
                  ArrayList<Vegetable> vegetablesInTheBasket) {
        setFruitsInTheBasket(fruitsInTheBasket);
        setVegetablesInTheBasket(vegetablesInTheBasket);

    }

    public ArrayList<Fruit> getFruitsInTheBasket() {
        return fruitsInTheBasket;
    }

    public void setFruitsInTheBasket(ArrayList<Fruit> fruitsInTheBasket) {
        this.fruitsInTheBasket = fruitsInTheBasket;
    }

    public ArrayList<Vegetable> getVegetablesInTheBasket() {
        return vegetablesInTheBasket;
    }

    public void setVegetablesInTheBasket(ArrayList<Vegetable> vegetablesInTheBasket) {
        this.vegetablesInTheBasket = vegetablesInTheBasket;
    }

/*****************************************************************/
    /*********
     * Перегруженный метод put
     *********************/

    public void put(Fruit fruit) {
        fruitsInTheBasket.add(fruit);
    }

    public void put(Fruit[] fruitArray) {
        for (int i = 0; i < fruitArray.length; i++) {
            fruitsInTheBasket.add(fruitArray[i]);
        }
    }


    public void put(Vegetable vegetable) {
        vegetablesInTheBasket.add(vegetable);
    }

    public void put(Vegetable[] vegetableArray) {
        for (int i = 0; i < vegetableArray.length; i++) {
            vegetablesInTheBasket.add(vegetableArray[i]);
        }
    }

    // Метод перекладывает овощи и фрукты из старой корзины в новую.
    public Basket put(Basket oldBasket) {
        Basket newBasket = new Basket(fruitsInTheBasket, vegetablesInTheBasket);
        for (int i = 0; i < oldBasket.vegetablesInTheBasket.size(); i++) {
            newBasket.vegetablesInTheBasket.add(oldBasket.vegetablesInTheBasket.get(i));
            oldBasket.vegetablesInTheBasket.remove(i);
        }

        for (int i = 0; i < oldBasket.fruitsInTheBasket.size(); i++) {
            newBasket.fruitsInTheBasket.add(oldBasket.fruitsInTheBasket.get(i));
            oldBasket.fruitsInTheBasket.remove(i);
        }
        System.out.println("Old basket = " + oldBasket);
        System.out.println("New basket = " + newBasket);
        return newBasket;
    }


    public String extractFruit(int indexOfElement) {
        String str = "Не корректный ввод данных";
        if (indexOfElement >= 0 && indexOfElement <= fruitsInTheBasket.size()) {
            Fruit myFruit = fruitsInTheBasket.get(indexOfElement);
            str = myFruit.toString();
        }
        return str;
    }

    public String extractVegetable(int indexOfElement) {
        String str = "Не корректный ввод данных";
        if (indexOfElement >= 0 && indexOfElement <= vegetablesInTheBasket.size()) {
            Vegetable myVegetable = vegetablesInTheBasket.get(indexOfElement);
            str = myVegetable.toString();
        }
        return str;
    }

    public String extractAll() {
        final int MAX = fruitsInTheBasket.size();

        for (int i = 0; i < MAX; i++) {

            //fruitsInTheBasket.remove(i);
            System.out.println(i);
        }

        for (int i = 0; i < vegetablesInTheBasket.size(); i++) {

            vegetablesInTheBasket.remove(0);
        }

        String str = "Корзина теперь пустая" + "\n";
        return str;
    }

    public String extractAllFruits() {
        String str = "ФРУКТЫ: " + "\n";
        for (int i = 0; i < fruitsInTheBasket.size(); i++) {
            str += fruitsInTheBasket.get(i).toString() + "\n";
            fruitsInTheBasket.remove(i);
        }
        str += "Все фрукты извлечены" + "\n";
        return str;
    }

    public String extractAllVegetables() {
        String str = "ОВОЩИ: " + "\n";
        for (int i = 0; i < vegetablesInTheBasket.size(); i++) {
            str += vegetablesInTheBasket.get(i).toString() + "\n";
            vegetablesInTheBasket.remove(i);
        }
        str += "Все овощи извлечены" + "\n";
        return str;
    }


    public double getMassOfTheBasket() {
        double massOfTheBasket = 0;
        for (Fruit fruit : fruitsInTheBasket) {
            massOfTheBasket += fruit.getMass();
        }
        for (Vegetable vegetable : vegetablesInTheBasket) {
            massOfTheBasket += vegetable.getMass();
        }
        return massOfTheBasket;
    }


    @Override
    public String toString() {
        String plantTableFormat = "%-20s%-20s%-20s%-20s%-20s%-20s%n";
        String sCategories = String.format(plantTableFormat, "Наименование", "Масса", "Цвет", "Зрелость", "Состояние", "Очищен?");
        String sLine = "--------------------------------------------------------------------------------------------------------------";
        String sEnter = "\n";
        String sF = "ФРУКТЫ:";
        String sf = "";
        for (Fruit fruit : fruitsInTheBasket) {
            sf += String.format(plantTableFormat, fruit.getName(), fruit.getMass(), fruit.getColor(), fruit.getRipeness(), fruit.getCondition(), fruit.isPeelledPlantFeature()) + "\n";

        }
        String sV = "ОВОЩИ:";
        String sv = "";
        for (Vegetable vegetable : vegetablesInTheBasket) {
            sv += String.format(plantTableFormat, vegetable.getName(), vegetable.getMass(), vegetable.getColor(), vegetable.getRipeness(), vegetable.getCondition(), vegetable.isPeelledPlantFeature()) + "\n";

        }

        return sCategories + sLine + sEnter + sF + sEnter + sf + sLine + sEnter + sV + sEnter + sv;
    }
}
