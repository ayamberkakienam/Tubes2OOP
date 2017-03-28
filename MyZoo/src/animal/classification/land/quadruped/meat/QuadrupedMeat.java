package animal.classification.land.quadruped.meat;

import animal.classification.land.quadruped.Quadruped;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */

/** QuadrupedMeat.
 * Kelas yang menangani hewan dengan habitat = "Land"
 * leg = 4 dan diet = "Meat"
 */

public abstract class QuadrupedMeat extends Quadruped {

  /** Constructor.
 * Melakukan inisialisasi kelas QuadrupedMeat
 * @param w untuk weight
 * @param x untuk koordinat x pada map
 * @param y untuk koordinat y pada map
 * @param tame true jika jinak, false jika tidak jinak
 */

  public QuadrupedMeat(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Carnivore");
    setDiet("Meat");
  }
}
