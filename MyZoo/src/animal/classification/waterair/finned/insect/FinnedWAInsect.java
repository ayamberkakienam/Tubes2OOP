package animal.classification.waterair.finned.insect;

import animal.classification.waterair.finned.FinnedWA;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Water, Air",
 * legs = 0, dan diet = "Insect"
 */
public abstract class FinnedWAInsect extends FinnedWA {
  /**
   * Constructor
   *
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */
  public FinnedWAInsect(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Carnivore");
    setDiet("Insect");
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  public abstract String interact();
}
