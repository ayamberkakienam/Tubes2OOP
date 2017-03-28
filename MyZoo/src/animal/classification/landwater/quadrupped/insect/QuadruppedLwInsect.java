package animal.classification.landwater.quadrupped.insect;

import animal.classification.landwater.quadrupped.QuadruppedLw;

/** QuadrupedLWInsect.
 * Kelas yang menangani hewan dengan habitat = "Land" dan "Water"
 * leg = 4 dan diet = "Insect"
 */

public abstract class QuadruppedLwInsect extends QuadruppedLw {
  /** Constructor.
   * Melakukan inisialisasi kelas QuadrupedLWInsect
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public QuadruppedLwInsect(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Carnivore");
    setDiet("Insect");
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan.
   * @return suara hewan
   */

  public abstract String interact();
}
