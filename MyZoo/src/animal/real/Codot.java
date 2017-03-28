package animal.real;

import animal.classification.flying.bird.fruit.BirdFruit;

/**
 * Codot
 * Hewan jenis kelelawar yang memakan buah-buahan
 */
public class Codot extends BirdFruit {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Codot(int i, int j) {
    super((float) 0.5, i, j, false);
    setName("Codot");
    setContent('C');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Cit cit cit";
  }
}
