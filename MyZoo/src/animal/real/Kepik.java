package animal.real;

import animal.classification.flying.insect.nectar.InsectNectar;

/**
 * Kepik
 * Serangga berukuran kecil dan memiliki tubuhnya berwarna-warni
 */
public class Kepik extends InsectNectar {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public Kepik(int i, int j) {
    super((float) 0.01, i, j, true);
    setName("Kepik");
    setContent('L');
    consumerate += getFodder();
  }

  /**
   * @return string suara hewan.
   * Menghasilkan suara hewan yang khas
   */
  public String interact() {
    return "Krik krik krik";
  }
}
