package Renderable.Cell.Facility.Road;

import Renderable.Cell.Facility.Facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
public class Road extends Facility {

    protected boolean exit;
    protected boolean entrance;

    public Road(int i, int j) {
        super(i, j);
        setContent('+');
        setEntrance(false);
        setExit(false);
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public boolean isEntrance() {
        return entrance;
    }

    public void setEntrance(boolean entrance) {
        this.entrance = entrance;
    }
}
