package animal.classification.flying.bird.fruit;

import animal.classification.flying.bird.Bird;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Air",
 * legs = 2, dan diet = "Fruit"
 */
public abstract class BirdFruit extends Bird {
  /**
   * Constructor
   *
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */
  public BirdFruit(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Herbivore");
    setDiet("Fruit");
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  abstract public String Interact();
}
