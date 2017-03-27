package animal.animal_real;

import animal.animal_classification.QuadrupedMeat;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Singa
 * Hewan kucing-kucingan yang memiliki rambut lebat di kepala dan memakan daging
 */
public class Singa  extends QuadrupedMeat {
  /**  Constructor.
   * Melakukan inisialisasi kelas Singa dengan parameter absis dan ordinat lokasi
   */
  public Singa(int i, int j) {
    super(400, i, j, false);
    SetName("Singa");
    SetContent('W');
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Groarrr";
  }
  /**  Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo();
  }
}
