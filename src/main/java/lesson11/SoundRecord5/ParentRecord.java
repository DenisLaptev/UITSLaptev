package lesson11.SoundRecord5;

/**
 * Created by lapte on 01.06.2016.
 */
public class ParentRecord {
    private int positionInTheCategory;
    private String name;
    private int duration;

    public ParentRecord(int positionInTheCategory, String name, int duration) {
        setPositionInTheCategory(positionInTheCategory);
        setName(name);
        setDuration(duration);
    }

    public int getPositionInTheCategory() {
        return positionInTheCategory;
    }

    public void setPositionInTheCategory(int positionInTheCategory) {
        this.positionInTheCategory = positionInTheCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {

        String musicalCompositionsTableFormat = "%-30s%-30s%-30s%n";
        String s = String.format(musicalCompositionsTableFormat, getPositionInTheCategory(), getName(), getDuration());
        return  s;

    }
}
