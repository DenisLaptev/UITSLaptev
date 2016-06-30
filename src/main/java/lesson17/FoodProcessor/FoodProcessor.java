package lesson17.FoodProcessor;

import IdeaHomeWork.uits.jv1604.laptevhomework.lesson17.Plant;
import IdeaHomeWork.uits.jv1604.laptevhomework.lesson17.Vegetable;

import java.util.ArrayList;

/**
 * Created by lapte on 03.06.2016.
 */
public class FoodProcessor implements Peeller, Cutter, Slicer {

    @Override
    public double cut(Vegetable vegetable) {
        double newMass = vegetable.getMass();
        try {
            if (vegetable.isPeelledPlantFeature() == false) {
                throw new IllegalArgumentException();
            } else {
                newMass = vegetable.getMass() - 0.02 * vegetable.getMass();
                System.out.println("Комбайн пошинковал " + vegetable.getName() + " (-2%)" + "\n");
            }

        } catch (IllegalArgumentException iae) {
            System.out.println(vegetable.getName() + " не очищен!" + "\n");
            System.out.println(iae + "\n");
        }
        vegetable.setMass(newMass);
        return newMass;
    }

    @Override
    public double cutAll(ArrayList<Vegetable> vegetables) {
        double allVegetablesMass = 0;

        for (Vegetable vegetable : vegetables) {
            double newMass = vegetable.getMass();
            try {
                if (vegetable.isPeelledPlantFeature() == false) {
                    throw new IllegalArgumentException();

                } else {
                    newMass = vegetable.getMass() - 0.02 * vegetable.getMass();
                    System.out.println("Комбайн пошинковал " + vegetable.getName() + " (-2%)" + "\n");

                }

            } catch (IllegalArgumentException iae) {
                System.out.println(vegetable.getName() + " не очищен!" + "\n");
                System.out.println(iae + "\n");
            }
            vegetable.setMass(newMass);
            allVegetablesMass = newMass;
        }
        return allVegetablesMass;
    }

    @Override
    public double slice(Plant plant) {
        double newMass = plant.getMass();
        try {
            if (plant.isPeelledPlantFeature() == false) {
                throw new IllegalArgumentException();
            } else {
                newMass = plant.getMass() - 0.01 * plant.getMass();
                System.out.println("Комбайн порезал " + plant.getName() + " (-1%)" + "\n");

            }

        } catch (IllegalArgumentException iae) {
            System.out.println(plant.getName() + " не очищен!" + "\n");
            System.out.println(iae + "\n");
        }
        plant.setMass(newMass);
        return newMass;
    }

    @Override
    public double sliceAll(ArrayList<Plant> plants) {
        double allItemsMass = 0;

        for (Plant plant : plants) {
            double newMass = plant.getMass();
            try {
                if (plant.isPeelledPlantFeature() == false) {
                    throw new IllegalArgumentException();
                } else {
                    newMass = plant.getMass() - 0.01 * plant.getMass();
                    System.out.println("Комбайн порезал " + plant.getName() + " (-1%)" + "\n");

                }

            } catch (IllegalArgumentException iae) {
                System.out.println(plant.getName() + " не очищен!" + "\n");
                System.out.println(iae + "\n");
            }
            plant.setMass(newMass);
            allItemsMass = newMass;
        }
        return allItemsMass;
    }

    @Override
    public double peellItem(Plant plant) {
        double newMass = plant.getMass();
        if (plant.isPeelledPlantFeature() == false) {
            plant.setPeelledPlantFeature(true);
            newMass = plant.getMass() - 0.03 * plant.getMass();
            System.out.println("Комбайн почистил " + plant.getName() + " (-3%)." + "\n");
        } else {
            System.out.println("Продукт: " + plant.getName() + " уже почищен, его чистить не надо!" + "\n");
        }
        plant.setMass(newMass);
        return newMass;
    }

    @Override
    public double peellItems(ArrayList<Plant> plants) {
        double allItemsMass = 0;
        for (Plant plant : plants) {
            double newMass = plant.getMass();
            if (plant.isPeelledPlantFeature() == false) {
                plant.setPeelledPlantFeature(true);
                newMass = plant.getMass() - 0.03 * plant.getMass();
                System.out.println("Комбайн почистил " + plant.getName() + " (-3%)." + "\n");
            } else {
                System.out.println("Продукт: " + plant.getName() + " уже почищен, его чистить не надо!" + "\n");
            }
            plant.setMass(newMass);
        }
        return allItemsMass;
    }
}
