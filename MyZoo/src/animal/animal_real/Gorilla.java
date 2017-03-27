package animal.animal_real;

import animal.animal_classification.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Gorilla
 *  Hewan primata yang berukuran besar
 */
public class Gorilla extends Primata {
  /**  Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Gorilla(int i, int j) {
    super(200, i, j, false);
    SetContent('C');
    SetName("Gorilla");
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Huhahuha";
  }
  /**  Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo();
  }
}
