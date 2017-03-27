package animal.animal_classification;

import animal.type.Carnivore;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
public class QuadrupedMeat extends Quadruped implements Carnivore {
  /** Constructor
 * Melakukan inisialisasi kelas QuadrupedMeat
 * @param w untuk weight
 * @param x untuk koordinat x pada map
 * @param y untuk koordinat y pada map
 * @param tame true jika jinak, false jika tidak jinak
 */
public QuadrupedMeat(float w, int x, int y, boolean tame) {
  super(w, x, y, tame);
  SetDiet("Meat");
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
