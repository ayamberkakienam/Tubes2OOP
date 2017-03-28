package animal.real;

import animal.classification.land.quadruped.meat.QuadrupedMeat;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**
 * Macan Tutul.
 * Hewan kucing-kucingan yang memiliki tubuh bertutul
 */
public class MacanTutul extends QuadrupedMeat {
  /**
   * Melakukan inisialisasi kelas MacanTutul dengan parameter absis dan ordinat lokasi.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public MacanTutul(int i, int j) {
    super(350, i, j, true);
    setName("Macan Tutul");
    setContent('R');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Aummmm";
  }
}
