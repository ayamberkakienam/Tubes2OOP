package animal.classification.flying;

import animal.Animal;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Air"
 */
public abstract class FlyingAnimal extends Animal {
  /**
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   *             Constructor
   */
  public FlyingAnimal(float w, int x, int y, boolean tame) {
    super(w, x, y, tame, 'Z');
    SetHabitat("Air");
  }
  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  abstract public String Interact();
}