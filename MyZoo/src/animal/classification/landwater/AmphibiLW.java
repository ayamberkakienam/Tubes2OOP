package animal.classification.landwater;

import animal.Animal;

/**
 * AmphibiLW
 * Kelas hewan yang dapat tinggal di habitat tanah dan air
 */
public abstract class AmphibiLW extends Animal {
  /** Constructor.
   * Melakukan inisialisasi kelas AmphibiLW dengan parameter berat,koordinat lokasi x,koordinat lokasi y,dan kejinakan
   */
  public AmphibiLW(float w, int x, int y, boolean tame) {
    super(w, x, y, tame, 'Z');
    setHabitat("Land,Water");
  }

  /** Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  abstract public String Interact();
}
