package lesson11.SoundRecord5;

/**
 * Created by lapte on 01.06.2016.
 */
public class JazzSong extends JazzStyle{

    private final String NAME = "JazzSong";

    public JazzSong(int positionInTheCategory, String name, int duration) {
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
