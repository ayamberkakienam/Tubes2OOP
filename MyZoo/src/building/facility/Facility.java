package building.facility;

import building.Cell;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/**
 * Facility.
 * Menangani objek facility yang merupakan fasilitas yang tersedia pada kebun binatang
 */
public class Facility extends Cell {
  /**
   * Melakukan inisialisasi kelas facility dengan parameter absis dan ordinat lokasi facility.
   *
   * @param i Absis
   * @param j Ordinat
   */
  protected Facility(int i, int j) {
    super(i, j);
  }
}
