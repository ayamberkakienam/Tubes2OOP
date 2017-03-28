package animal.classification.water;

/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

import animal.Animal;

/**WaterAnimal
 * Kelas yang menangani hewan dengan habitat = "Water"
 */
public abstract class WaterAnimal extends Animal {
    /** Constructor
     * Melakukan inisialisasi kelas WaterAnimal
     * @param w untuk weight
     * @param x untuk koordinat x pada map
     * @param y untuk koordinat y pada map
     * @param tame true jika jinak, false jika tidak jinak
     */
    public WaterAnimal(float w,int x,int y, boolean tame) {
        super (w, x, y, tame, 'Z');
        setHabitat("Water");
    }
}
