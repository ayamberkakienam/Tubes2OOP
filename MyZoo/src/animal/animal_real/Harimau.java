package animal.animal_real;

import animal.animal_classification.QuadrupedMeat;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Harimau
 * Hewan kucing-kucingan yang memiliki tubuh besar dan memakan daging
 */
public class Harimau  extends QuadrupedMeat {
  /**  Constructor.
   * Melakukan inisialisasi kelas Harimau dengan parameter absis dan ordinat lokasi
   */
  public Harimau(int i, int j) {
    super(450, i, j, false);
    SetName("Harimau");
    SetContent('G');
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Roarrrr";
  }
  /**  Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo();
  }
}
