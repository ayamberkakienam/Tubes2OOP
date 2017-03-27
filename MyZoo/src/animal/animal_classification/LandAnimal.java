package animal.animal_classification;

/**
 * Created by root on 3/27/17.
 */

/**LandAnimal
 * Kelas yang menangani hewan dengan habitat = "Land"
 */
public abstract class LandAnimal extends Animal {
  /** Constructor
   * Melakukan inisialisasi kelas LandAnimal
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public LandAnimal(float w,int x,int y,boolean tame) {
    super(w, x, y, tame, 'Z');
    SetHabitat("Land");
  }
}