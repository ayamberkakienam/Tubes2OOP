package animal.classification.landwater.quadrupped.insect;
import animal.classification.landwater.quadrupped.QuadruppedLW;

/** QuadrupedLWInsect
 * Kelas yang menangani hewan dengan habitat = "Land" dan "Water"
 * leg = 4 dan diet = "Insect"
 */
public abstract class QuadruppedLWInsect extends QuadruppedLW {
  /* Constructor
   * Melakukan inisialisasi kelas QuadrupedLWInsect
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public QuadruppedLWInsect(float w, int x, int y, boolean tame) {
      super(w, x, y, tame);
      SetType("Carnivore");
      SetDiet("Insect");
  }
  /**mengembalikan string yang menggambarkan interaksi
   * user dengan hewan
   * @return suara hewan
   */
  abstract public String Interact();
}
