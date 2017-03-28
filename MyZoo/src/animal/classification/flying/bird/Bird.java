package animal.classification.flying.bird;

import animal.classification.flying.FlyingAnimal;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Air"
 * dan legs = 2
 */
public abstract class Bird extends FlyingAnimal {
  /**
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   * Constructor
   */
  public Bird(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetLeg(2);
  }

  /**
   * @return String sesuai implementasi pada kelas riil turunan
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan
   */
  abstract public String Interact();
}
