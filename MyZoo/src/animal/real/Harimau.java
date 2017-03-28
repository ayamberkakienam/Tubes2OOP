package animal.real;

import animal.classification.land.quadruped.meat.QuadrupedMeat;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** Harimau
 * Hewan kucing-kucingan yang memiliki tubuh besar dan memakan daging
 */
public class Harimau  extends QuadrupedMeat {
  /**
   * Melakukan inisialisasi kelas Harimau dengan parameter absis dan ordinat lokasi
   * @param i Absis
   * @param j Ordinat
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
}
