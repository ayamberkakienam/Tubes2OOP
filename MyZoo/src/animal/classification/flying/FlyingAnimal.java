package animal.classification.flying;

import animal.Animal;

/**
 * Menangani kelas hewan dengan atrbut habitat = "Air".
 */
public abstract class FlyingAnimal extends Animal {
  /**
   * Constructor.
   *
   * @param w    Berat hewan
   * @param x    Letak hewan berdasarkan indeks baris map zoo
   * @param y    Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */
  public FlyingAnimal(float w, int x, int y, boolean tame) {
    super(w, x, y, tame, 'Z');
    setHabitat("Air");
  }
}