package animal.classification.water.legged.plankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.legged.Legged;

/**@class LeggedPlankton
 * Kelas yang menangani hewan dengan habitat = "Water"
 * leg = 10, type = "Omnivore" dan diet = "Plankton"
 */
public abstract class LeggedPlankton extends Legged {
    /**@brief Constructor
     * Melakukan inisialisasi kelas LeggedPlankton
     * @param w untuk weight
     * @param x untuk koordinat x pada map
     * @param y untuk koordinat y pada map
     * @param tame true jika jinak, false jika tidak jinak
     */
    public LeggedPlankton(float w, int x, int y, boolean tame) {
        super(w, x, y, tame);
        SetType("Omnivore");
        SetDiet("Plankton");
    }
}
