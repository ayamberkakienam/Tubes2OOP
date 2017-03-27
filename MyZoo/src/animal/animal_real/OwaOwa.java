package animal.animal_real;

import animal.animal_classification.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */
public class OwaOwa extends Primata {
  /**  Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public OwaOwa(int i, int j) {
    super(70, i, j, true);
    SetName("OwaOwa");
    SetContent('S');
    consumerate++;
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Huhuhuhu";
  }
  /**  Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo(habitat, type);
  }
}
