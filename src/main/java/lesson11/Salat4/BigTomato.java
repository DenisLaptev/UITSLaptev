package lesson11.Salat4;

/**
 * Created by lapte on 01.06.2016.
 */
public class BigTomato extends Tomato {
    private final String NAME = "BigTomato";
    private String speciality;

    public BigTomato(int calories, int price, String color, String speciality) {
        super(calories, price, color);
        setSpeciality(speciality);
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        String vegetablesTableFormat = "%-20s%-15s%-15s%-15s%-15s%n";
        String s = String.format(vegetablesTableFormat, getNAME(), getCalories(), getPrice(), getColor(), getSpeciality());
        return  s;

    }
}
