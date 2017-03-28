package building;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/**
 * Cage
 * Menangani objek cage yang merupakan area hidup hewan
 */
public class Cage {
  protected Cell[] a_cell;
  protected int size;
  /**
   * Constructor
   */
  public Cage() {
    a_cell = new Cell[300];
  }
  /**
   * getter ukuran cage
   * @return Ukuran cage
   */
  public int getSize() {
    return size;
  }
  /**
   * getter array cell yang merupakan wilayah cage
   * @return Array cell yang menjadi wilayah cage
   */
  public Cell[] getCell() {
    return a_cell;
  }
  /**
   * Memperbesar wilayah cage
   */
  public void incSize() {
    size++;
  }
  /**
   * Memperkecil wilayah cage
   */
  public void decSize() {
    size--;
  }
}
