package lesson17.FoodProcessor;

import lesson17.Plant;

import java.util.ArrayList;

/**
 * Created by lapte on 03.06.2016.
 */
public interface Peeller {
    double peellItem(Plant plant);
    double peellItems(ArrayList<Plant> plants);
    // peell - чистить

}
