package animal.animal_real;

import animal.animal_classification.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */
public class Bekantan extends Primata {
  /**  Constructor.
   * Melakukan inisialisasi kelas Bekantan dengan parameter absis dan ordinat lokasi
   */
  public Bekantan(int i, int j) {
    super(50, i, j, true);
    SetName("Bekantan");
    SetContent('A');
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Uuuuuuu";
  }
  /**  Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo(habitat, type);
  }
}
