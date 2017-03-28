package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
public class Road extends Facility {

    private boolean exit;
    private boolean entrance;

    public Road(int i, int j) {
        super(i, j);
        setContent('+');
        setEntrance(false);
        setExit(false);
    }

    public boolean isExit() {
        return exit;
    }

    protected void setExit(boolean exit) {
        this.exit = exit;
    }

    public boolean isEntrance() {
        return entrance;
    }

    protected void setEntrance(boolean entrance) {
        this.entrance = entrance;
    }
}
