package lesson11.SoundRecord5;

/**
 * Created by lapte on 01.06.2016.
 */
public class JazzSong2 extends JazzStyle {
    private final String NAME = "JazzSong2";

    public JazzSong2(int positionInTheCategory, String name, int duration) {
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
