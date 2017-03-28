package animal.classification.landwater.quadrupped;

import animal.classification.landwater.AmphibiLW;
/** QuadrupedLW
 * Kelas yang menangani hewan dengan habitat = "Land" dan "Water"
 * dengan leg = 4
 */
public abstract class QuadruppedLW extends AmphibiLW {
  /** Constructor
   * Melakukan inisialisasi kelas QuadrupedLW
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public QuadruppedLW(float w, int x, int y, boolean tame) {
        super(w, x, y, tame);
        SetLeg(4);
  }
  /**mengembalikan string yang menggambarkan interaksi
   * user dengan hewan
   * @return suara hewan
   */
  abstract public String Interact();
}
