package animal.classification.waterair.finned;

import animal.classification.waterair.AmphibiWa;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Water, Air"
 * dan legs = 0.
 */
public abstract class FinnedWa extends AmphibiWa {
  /**
   * Constructor.
   *
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */
  public FinnedWa(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setLeg(0);
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan.
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  public abstract String interact();
}
