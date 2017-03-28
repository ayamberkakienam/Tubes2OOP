package animal.classification.landwater;

import animal.Animal;

/**
 * AmphibiLw.
 * Kelas hewan yang dapat tinggal di habitat tanah dan air
 */

public abstract class AmphibiLw extends Animal {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas AmphibiLw dengan parameter berat,
   * koordinat lokasi x, koordinat lokasi y, dan kejinakan
   */

  public AmphibiLw(float w, int x, int y, boolean tame) {
    super(w, x, y, tame, 'Z');
    setHabitat("Land,Water");
  }
}
