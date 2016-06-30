package lesson17.FoodProcessor;

import IdeaHomeWork.uits.jv1604.laptevhomework.lesson17.Plant;

import java.util.ArrayList;

/**
 * Created by lapte on 03.06.2016.
 */
public interface Slicer {
    double slice(Plant plant);
    double sliceAll(ArrayList<Plant> plants);
    // slice - нарезать ломтиками
}
