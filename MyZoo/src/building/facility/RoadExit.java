package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
public class RoadExit extends Road {
    public RoadExit(int i, int j) {
        super(i, j);
        setContent('!');
        setExit(true);
    }
}
