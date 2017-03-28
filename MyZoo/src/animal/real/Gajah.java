package animal.real;

import animal.classification.land.quadruped.leaf.QuadrupedLeaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Gajah
 * Hewan yang berukuran besar dan memiliki belalai
 */
public class Gajah extends QuadrupedLeaf {
  /**
   * Melakukan inisialisasi kelas Gajah dengan parameter absis dan ordinat lokasi
   * @param i Absis
   * @param j Ordinat
   */
  public Gajah(int i, int j) {
    super(3500, i, j, true);
    setContent('E');
    setName("Gajah");
    consumerate += getFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Ngoett";
  }
}
