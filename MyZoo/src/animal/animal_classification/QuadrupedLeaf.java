package animal.animal_classification;

import animal.type.Herbivore;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** QuadrupedLeaf
 * Kelas yang menangani hewan dengan habitat = "Land"
 * leg = 4 dan diet = "Plant"
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
    SetType("Herbivore");
    SetDiet("Leaf");
  }
}
