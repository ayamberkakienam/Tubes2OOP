package animal.animal_classification;

import animal.type.Herbivore;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
public abstract class QuadrupedLeaf extends Quadruped implements Herbivore {
  /** Constructor
   * Melakukan inisialisasi kelas QuadrupedLeaf
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public QuadrupedLeaf(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetDiet("Leaf");
  }
  /** Mengembalikan string yang menggambarkan interaksi
   * user dengan hewan
   * @return suara hewan
   */
  public String Interact() {
    return "No Interact";
  }
  /** Menamplkan informasi tentang hewan
   */
  public void GetInfo() {

  }
}
