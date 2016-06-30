package lesson17;

/*
 * Created by lapte on 03.06.2016.
 */


public class Fruit extends Plant{

    public Fruit(String name, double mass, String color,
                 int ripeness, String condition,
                 boolean peelledPlantFeature) {
        super(name, mass, color, ripeness, condition, peelledPlantFeature);
    }


    @Override
    public String peell() {
        double newMass = getMass()- 0.02 * getMass();
        setMass(newMass);
        setPeelledPlantFeature(true);
        return "Фрукт очищен";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
