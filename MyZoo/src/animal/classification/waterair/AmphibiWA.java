package animal.classification.waterair;

import animal.Animal;

/**
 * AmphibiWA
 * Kelas hewan yang dapat tinggal di habitat air dan udara
 */
public abstract class AmphibiWA extends Animal {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter berat,koordinat lokasi x,koordinat lokasi y,dan kejinakan
   */
  public AmphibiWA(float w, int x, int y, boolean tame) {
    super(w, x, y, tame, 'Z');
    SetHabitat("Water,Air");
  }

  /**
   * Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  abstract public String Interact();
}
