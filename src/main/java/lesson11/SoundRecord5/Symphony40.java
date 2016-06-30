package lesson11.SoundRecord5;

/**
 * Created by lapte on 01.06.2016.
 */
public class Symphony40 extends ClassicStyle {
    private final String NAME = "Symphony40";

    public Symphony40(int positionInTheCategory, String name, int duration) {
        super(positionInTheCategory, name, duration);
    }

    @Override
    public void setName(String name) {
        name = NAME;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
