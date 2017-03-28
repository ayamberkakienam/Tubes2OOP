package animal.classification.flying.insect.nectar;

import animal.classification.flying.insect.Insect;

/**
 * Insect
 * Kelas yang menangani hewan dengan habitat = "Air"
 * legs = 6 dan diet = "Nectar"
 */
public abstract class InsectNectar extends Insect {
  /**
   * Constructor
   * Melakukan inisialisasi kelas InsectNectar
   *
   * @param w    untuk weight
   * @param x    untuk koordinat x pada map
   * @param y    untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public InsectNectar(float w, int x, int y, boolean tame) {
        super(w, x, y, tame);
        setType("Herbivore");
        setDiet("Nectar");
    }
  /**
   * mengembalikan string yang menggambarkan interaksi
   * user dengan hewan
   *
   * @return suara hewan
   */
  abstract public String Interact();
}
