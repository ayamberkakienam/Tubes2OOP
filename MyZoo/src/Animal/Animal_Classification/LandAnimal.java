package Animal.Animal_Classification;

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
    habitat = "Land";
  }
  /**Getter untuk habitat
   * @return habitat dari Kelas Habitat
   */
  public String GetHabitat() {
    return habitat;
  }
  /**Mengembalikan String yang menggambarkan interaksi
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
  /** Habitat dari hewan
   */
  protected String habitat;
}