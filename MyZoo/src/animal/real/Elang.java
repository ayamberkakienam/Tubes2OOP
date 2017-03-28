package animal.real;

import animal.classification.flying.bird.meat.BirdMeat;

/**
 * Elang
 * Hewan yang memiliki cakar yang kuat dan memakan daging
 */
public class Elang extends BirdMeat {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Elang(int i, int j) {
    super(3, i, j, false);
    SetName("Elang");
    SetContent('D');
    consumerate += GetFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas
   *
   * @return string suara hewan.
   */
  public String Interact() {
    return "Koak koakk koakk";
  }
}