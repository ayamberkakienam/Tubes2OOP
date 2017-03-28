package animal.classification.water.finned.plankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.finned.Finned;

/**
 * FinnedPlankton.
 * Menangani kelas hewan dengan atrbut habitat = "Water",
 * legs = 0, type = "Omnivore" dan diet = "Plankton"
 */
public abstract class FinnedPlankton extends Finned {
  /**
   * Constructor.
   * @param w Berat hewan
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */
  public FinnedPlankton(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    setType("Omnivore");
    setDiet("Plankton");
  }
}
