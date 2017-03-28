package animal.real;

import animal.classification.land.biped.fruit.Primata;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */

/**  OwaOwa
 * Hewan primata yang tidak berekor dan dn bertangan panjang
 */
public class OwaOwa extends Primata {
  /**  Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public OwaOwa(int i, int j) {
    super(70, i, j, true);
    SetName("OwaOwa");
    SetContent('S');
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Huhuhuhu";
  }
}
