package animal.animal_classification;
import animal.type.*;

import animal.type.Herbivore;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */

/**
 * Menangani kelas hewan dengan atribut habitat = "Land" dan legs = 2
 */
public abstract class Primata extends Biped implements Herbivore {
  /** Constructor
   * Melakukan inisialisasi kelas Primata
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public Primata(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetDiet("Fruit");
  }
}
