package animal.real;

import animal.classification.water.finned.plankton.FinnedPlankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**
 * PausSperma.
 * Hewan yang hidup di laut dan berukuran sangat besar
 */
public class PausSperma extends FinnedPlankton {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public PausSperma(int i, int j) {
    super(7000, i, j, true);
    setName("Paus Sperma");
    setContent('T');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Srosh srosh";
  }
}
