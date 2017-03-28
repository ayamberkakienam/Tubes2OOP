package animal.real;

import animal.classification.water.finned.meat.FinnedMeat;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**@class Hiu
 * @brief Hewan yang hidup di laut dan memakan daging
 */
public class Hiu extends FinnedMeat {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas
     */
    public Hiu(int i, int j) {
        super(100,i,j,true);
        SetName("Hiu");
        SetContent('H');
        consumerate += GetFodder();
    }
    /** @brief Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Shush shush";
    }
}
