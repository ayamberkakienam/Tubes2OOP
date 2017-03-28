package animal.classification.waterair;

import animal.Animal;

/**
 * AmphibiWa.
 * Kelas hewan yang dapat tinggal di habitat air dan udara.
 */
public abstract class AmphibiWa extends Animal {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter berat,
   * koordinat lokasi x, koordinat lokasi y, dan kejinakan.
   */
  public AmphibiWa(float w, int x, int y, boolean tame) {
    super(w, x, y, tame, 'Z');
    setHabitat("Water,Air");
  }
}
