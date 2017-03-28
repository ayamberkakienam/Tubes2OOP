package animal.real;

import animal.classification.water.finned.plankton.FinnedPlankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**
 * LumbaLumba.
 * Hewan yang hidup di laut dan intelegensi yang tinggi
 */
public class LumbaLumba extends FinnedPlankton {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas
   */
  public LumbaLumba(int i, int j) {
    super(100, i, j, true);
    setName("Lumba lumba");
    setContent('Q');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Cet cet cet";
  }
}
