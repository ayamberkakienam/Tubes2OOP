package animal.classification.land.biped.fruit;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */

import animal.classification.land.biped.Biped;

/**
 * Menangani kelas hewan dengan atribut habitat = "Land" dan legs = 2
 */
public abstract class Primata extends Biped {
  /** Constructor
   * Melakukan inisialisasi kelas Primata
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public Primata(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetType("Herbivore");
    SetDiet("Fruit");
  }
}
