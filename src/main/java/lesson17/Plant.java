package lesson17;

/**
 * Created by lapte on 03.06.2016.
 */
public abstract class Plant implements Peellable {


    private String name;
    private double mass;
    private String color;
    private int ripeness;                   // ripeness - зрелость.
    private String condition;               // condition - состояние.
    private boolean peelledPlantFeature;    // peelledPlantFeature - признак,
    // очищен ли овощ/фрукт


    public Plant(String name, double mass, String color, int ripeness,
                 String condition, boolean peelledPlantFeature) {
        setName(name);
        setMass(mass);
        setColor(color);
        setRipeness(ripeness);
        setCondition(condition);
        setPeelledPlantFeature(peelledPlantFeature);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass () {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRipeness() {
        return ripeness;
    }

    public void setRipeness(int ripeness) {
        this.ripeness = ripeness;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isPeelledPlantFeature() {
        return peelledPlantFeature;
    }

    public void setPeelledPlantFeature(boolean peelledPlantFeature) {
        this.peelledPlantFeature = peelledPlantFeature;
    }




    //Абстрактный метод
   public abstract String peell();




    @Override
    public String toString() {
        String plantTableFormat = "%-20s%-20s%-20s%-20s%-20s%-20s%n";
        String s = String.format(plantTableFormat, getName(), getMass(), getColor(), getRipeness(), getCondition(), isPeelledPlantFeature());
        return s;

    }
}
