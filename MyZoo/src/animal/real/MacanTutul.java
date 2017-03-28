package animal.real;

import animal.classification.land.quadruped.meat.QuadrupedMeat;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Bekantan
 * Hewan kucing-kucingan yang memiliki tubuh bertutul
 */
public class MacanTutul extends QuadrupedMeat {
  /**
   * Melakukan inisialisasi kelas MacanTutul dengan parameter absis dan ordinat lokasi
   * @param i Absis
   * @param j Ordinat
   */
  public MacanTutul(int i, int j) {
    super(350, i, j, true);
    SetName("Macan Tutul");
    SetContent('R');
    consumerate += GetFodder();
  }
  /**  Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Aummmm";
  }
}
