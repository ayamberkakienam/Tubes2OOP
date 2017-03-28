package animal.classification.water.finned;

/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

import animal.classification.water.WaterAnimal;

/** Finned
 * Menangani kelas hewan dengan atrbut habitat = "Water"
 * dan legs = 0
 */
public abstract class Finned extends WaterAnimal {
    /**
     * Constructor
     * @param w Berat hewan
     * @param x Letak hewan berdasarkan indeks baris map zoo
     * @param y Letak hewan berdasarkan indeks kolom map zoo
     * @param tame true apabila hewan telah dijinakkan
     */
    public Finned(float w, int x, int y, boolean tame) {
        super(w, x, y, tame);
        setLeg(0);
    }
}
