package animal.real;

import animal.classification.landwater.quadrupped.insect.QuadruppedLwInsect;

/** Platypus
 * Hewan yang bertelur sekaligus menyusui
 */
public class Platypus extends QuadruppedLwInsect {
  /** Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Platypus(int i, int j) {
    super(5, i, j, true);
    setName("Platypus");
    setContent('Z');
    consumerate += getFodder();
  }
  /** Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String interact() {
    return "Krr krr";
  }
}
