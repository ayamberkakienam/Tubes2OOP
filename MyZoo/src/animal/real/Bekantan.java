package animal.real;

import animal.classification.land.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */

/** Bekantan
 * Hewan primata yang memiliki hidung panjang dan besar
 */
public class Bekantan extends Primata {
  /**  Constructor.
   * Melakukan inisialisasi kelas Bekantan dengan parameter absis dan ordinat lokasi
   */
  public Bekantan(int i, int j) {
    super(50, i, j, true);
    SetName("Bekantan");
    SetContent('A');
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Uuuuuuu";
  }
}
