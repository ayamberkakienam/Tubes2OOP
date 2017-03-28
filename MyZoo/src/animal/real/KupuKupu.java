package animal.real;

import animal.classification.flying.insect.nectar.InsectNectar;

/**
 * KupuKupu.
 * Serangga yang memiliki warna sayap berwarna-warni
 */
public class KupuKupu extends InsectNectar {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public KupuKupu(int i, int j) {
    super((float) 0.03, i, j, true);
    setName("Kupu-kupu");
    setContent('O');
    consumerate += getFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas.
   *
   * @return string suara hewan.
   */
  public String interact() {
    return "Wir wir";
  }
}
