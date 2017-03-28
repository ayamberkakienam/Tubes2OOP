package building;

/**
 * Created by um-13515026
 * on 27/03/17.
 */
public class Cage {

    protected Cell[] a_cell;
    protected int size;

    public Cage() {
        a_cell = new Cell[300];
    }

    public int getSize() {
        return size;
    }

    public Cell[] getCell() {
        return a_cell;
    }

    public void incSize() {
        size++;
    }

    public void decSize() {
        size--;
    }


}
