package animal.classification.landwater.quadrupped;

import animal.classification.landwater.AmphibiLw;

/** QuadrupedLW.
 * Kelas yang menangani hewan dengan habitat = "Land" dan "Water"
 * dengan leg = 4
 */

public abstract class QuadruppedLw extends AmphibiLw {

  /**
   * Constructor.
   * Melakukan inisialisasi kelas QuadrupedLW
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */

  public QuadruppedLw(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setLeg(4);
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan.
   * @return suara hewan
   */

  public abstract String interact();
}
