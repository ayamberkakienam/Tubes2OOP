package animal.animal_real;

import animal.animal_classification.QuadrupedLeaf;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Gajah
 * Hewan yang berukuran besar dan memiliki belalai
 */
public class Gajah extends QuadrupedLeaf {
  /**  Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Gajah(int i, int j) {
    super(3500, i, j, true);
    SetContent('E');
    SetName("Gajah");
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Ngoett";
  }
  /**  Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo();
  }
}
