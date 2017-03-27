package animal.animal_classification;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */
public abstract class Quadruped extends LandAnimal {
  /** Constructor
   * Melakukan inisialisasi kelas Quadruped
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public Quadruped(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetLeg(4);
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
  public void GetInfo(){

  }
}
