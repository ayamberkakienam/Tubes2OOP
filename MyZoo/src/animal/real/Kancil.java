package animal.real;

import animal.classification.land.quadruped.leaf.QuadrupedLeaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Kancil
 * Hewan yang bertubuh kecil dan suka mencuri mentimun
 */
public class Kancil extends QuadrupedLeaf {
  /**
   * Melakukan inisialisasi kelas Kancil dengan parameter absis dan ordinat lokasi
   * @param i Absis
   * @param j Ordinat
   */
  public Kancil(int i, int j) {
    super(60, i, j, true);
    setContent('K');
    setName("Kancil");
    consumerate += getFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String interact() {
    return "Ngik ngik ngik";
  }
}