package animal.real;

import animal.classification.land.quadruped.meat.QuadrupedMeat;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**
 * Singa.
 * Hewan kucing-kucingan yang memiliki rambut lebat di kepala dan memakan daging
 */
public class Singa extends QuadrupedMeat {
  /**
   * Melakukan inisialisasi kelas Singa dengan parameter absis dan ordinat lokasi.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public Singa(int i, int j) {
    super(400, i, j, false);
    setName("Singa");
    setContent('W');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Groarrr";
  }
}
