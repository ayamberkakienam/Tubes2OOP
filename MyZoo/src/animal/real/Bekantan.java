package animal.real;

import animal.classification.land.biped.fruit.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */

/**
 * Bekantan.
 * Hewan primata yang memiliki hidung panjang dan besar
 */
public class Bekantan extends Primata {
  /**
   * Melakukan inisialisasi kelas Bekantan dengan parameter absis dan ordinat lokasi.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public Bekantan(int i, int j) {
    super(50, i, j, true);
    setName("Bekantan");
    setContent('A');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Uuuuuuu";
  }
}
