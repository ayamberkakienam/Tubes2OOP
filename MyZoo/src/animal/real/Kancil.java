package animal.real;

import animal.classification.land.QuadrupedLeaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Kancil
 * Hewan yang bertubuh kecil dan suka mencuri mentimun
 */
public class Kancil extends QuadrupedLeaf {
  /**  Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Kancil(int i, int j) {
    super(60, i, j, true);
    SetContent('K');
    SetName("Kancil");
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Ngik ngik ngik";
  }
}