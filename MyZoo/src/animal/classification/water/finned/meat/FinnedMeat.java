package animal.classification.water.finned.meat;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.finned.Finned;

/**
 * @class FinnedMeat
 * Menangani kelas hewan dengan atrbut habitat = "Water",
 * legs = 0, type = "Carnivore" dan diet = "Meat"
 */
public abstract class FinnedMeat extends Finned {
    /**
     * @brief Constructor
     * @param w Berat hewan
     * @param x Letak hewan berdasarkan indeks baris map zoo
     * @param y Letak hewan berdasarkan indeks kolom map zoo
     * @param tame true apabila hewan telah dijinakkan
     */
    public FinnedMeat(float w, int x, int y, boolean tame) {
        super(w, x, y, tame);
        SetType("Carnivore");
        SetDiet("Meat");
    }
}
