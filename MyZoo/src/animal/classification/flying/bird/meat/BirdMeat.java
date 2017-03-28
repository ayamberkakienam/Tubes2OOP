package animal.classification.flying.bird.meat;

import animal.classification.flying.bird.Bird;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Air", legs = 2,
 * dan diet = "Meat"
 */
public abstract class BirdMeat extends Bird {
  /**
   * Constructor
   *
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */
  public BirdMeat(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Carnivore");
    setDiet("Meat");
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  public abstract String interact();
}