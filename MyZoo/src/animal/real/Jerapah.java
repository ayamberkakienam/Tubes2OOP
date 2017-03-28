package animal.real;

import animal.classification.land.quadruped.leaf.QuadrupedLeaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**
 * Jerapah.
 * Hewan yang memiliki leher panjang dan memakan dedaunan
 */
public class Jerapah extends QuadrupedLeaf {
  /**
   * Melakukan inisialisasi kelas Jerapah dengan parameter absis dan ordinat lokasi.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public Jerapah(int i, int j) {
    super(500, i, j, true);
    setName("Jerapah");
    setContent('J');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Ngoet ngoet";
  }
}
