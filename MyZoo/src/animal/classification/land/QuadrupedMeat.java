package animal.classification.land;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
public abstract class QuadrupedMeat extends Quadruped {
  /** Constructor
 * Melakukan inisialisasi kelas QuadrupedMeat
 * @param w untuk weight
 * @param x untuk koordinat x pada map
 * @param y untuk koordinat y pada map
 * @param tame true jika jinak, false jika tidak jinak
 */
  public QuadrupedMeat(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetType("Carnivore");
    SetDiet("Meat");
  }
}
