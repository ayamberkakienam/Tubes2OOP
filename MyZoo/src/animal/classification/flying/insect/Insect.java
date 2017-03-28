package animal.classification.flying.insect;

import animal.classification.flying.FlyingAnimal;

/**
 * Insect
 * Kelas yang menangani hewan dengan habitat = "Air"
 * dan Legs = 6
 */
public abstract class Insect extends FlyingAnimal {
  /**
   * Constructor
   * Melakukan inisialisasi kelas Insect
   *
   * @param w    untuk weight
   * @param x    untuk koordinat x pada map
   * @param y    untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public Insect(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setLeg(6);
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi
   * user dengan hewan
   *
   * @return suara hewan
   */
  public abstract String interact();
}
