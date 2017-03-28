package animal.real;

import animal.classification.landwater.quadrupped.insect.QuadruppedLWInsect;

/** Platypus
 * Hewan yang bertelur sekaligus menyusui
 */
public class Platypus extends QuadruppedLWInsect {
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
  public String Interact() {
    return "Krr krr";
  }
}
