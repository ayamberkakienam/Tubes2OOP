package animal.classification.water.legged;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.WaterAnimal;

/**@class Legged
 * Kelas yang menangani hewan dengan habitat = "Water"
 * dan leg = 10
 */
public abstract class Legged extends WaterAnimal {
    /**@brief Constructor
     * Melakukan inisialisasi kelas Legged
     * @param w untuk weight
     * @param x untuk koordinat x pada map
     * @param y untuk koordinat y pada map
     * @param tame true jika jinak, false jika tidak jinak
     */
    public Legged(float w, int x, int y, boolean tame) {
        super(w, x, y, tame);
        SetLeg(10);
    }
}
