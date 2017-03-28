package animal.real;

import animal.classification.water.finned.meat.FinnedMeat;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/** @class Piranha
 * @brief Hewan yang hidup di sungai amazon dan dapat memakan daging dengan sangat cepat
 */
public class Piranha extends FinnedMeat {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas
     */
    public Piranha(int i, int j) {
        super((float)0.7, i, j, false);
        SetName("Piranha");
        SetContent('U');
        consumerate += GetFodder();
    }
    /** @brief Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Kraus kraus";
    }
}
