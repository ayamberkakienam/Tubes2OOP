package animal.animal_real;

import animal.animal_classification.QuadrupedLeaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/**  Jerapah
 * Hewan yang memiliki leher panjang dan memakan dedaunan
 */
public class Jerapah extends QuadrupedLeaf {
  /**  Constructor.
   * Melakukan inisialisasi kelas Jerapah dengan parameter absis dan ordinat lokasi
   */
  public Jerapah(int i, int j) {
    super(500, i, j, true);
    SetName("Jerapah");
    SetContent('J');
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Ngoet ngoet";
  }
}
