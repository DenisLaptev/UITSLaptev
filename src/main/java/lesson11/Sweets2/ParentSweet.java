package lesson11.Sweets2;

/**
 * Created by lapte on 01.06.2016.
 */
public class ParentSweet {
    private int mass;
    private int size;
    private double sugar;


    public ParentSweet(int mass, int size, double sugar) {
        setMass(mass);
        setSize(size);
        setSugar(sugar);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        String sweetsTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(sweetsTableFormat, "ParentSweet", getMass(), getSize(), getSugar(), "?Color?");
        return  s;

    }

}
