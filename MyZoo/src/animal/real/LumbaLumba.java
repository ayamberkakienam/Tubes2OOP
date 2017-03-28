package animal.real;

import animal.classification.water.finned.plankton.FinnedPlankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/** @class LumbaLumba
 * @brief Hewan yang hidup di laut dan intelegensi yang tinggi
 */
public class LumbaLumba extends FinnedPlankton {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas
     */
    public LumbaLumba(int i, int j) {
        super(100, i, j, true);
        SetName("Lumba lumba");
        SetContent('Q');
        consumerate += GetFodder();
    }
    /** @brief Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Cet cet cet";
    }
}
