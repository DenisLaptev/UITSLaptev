package lesson17.FoodProcessor;

import lesson17.Vegetable;

import java.util.ArrayList;

/**
 * Created by lapte on 03.06.2016.
 */
public interface Cutter {
    double cut(Vegetable vegetable);
    double cutAll(ArrayList<Vegetable> vegetables);
    // cut - шинковать
}
