package animal.real;

import animal.classification.flying.insect.nectar.InsectNectar;

/**
 * KumbangHutan
 * Serangga yang bercula
 */
public class KumbangHutan extends InsectNectar {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public KumbangHutan(int i, int j) {
      super((float) 0.05, i, j, true);
      setName("Kumbang Hutan");
      setContent('N');
      consumerate += getFodder();
    }

  /**
   * Mencetak informasi spesifik hewan
   */
  public String Interact() {
        return "Kruk kruk kruk";
    }
}
