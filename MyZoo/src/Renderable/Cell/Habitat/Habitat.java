package Renderable.Cell.Habitat;

import Renderable.Cell.Cell;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
public class Habitat extends Cell {

    private boolean caged;

    protected Habitat(boolean caged, int i, int j) {
        super(i,j);
        this.caged = caged;
    }

    public boolean isCaged() {
        return caged;
    }

    public void setCaged(boolean caged) {
        this.caged = caged;
    }
}
