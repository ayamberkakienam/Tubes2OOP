package animal.real;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.finned.meat.FinnedMeat;

/** @class SingaLaut
 * @brief Hewan yang pandai berenang dan memakan ikan
 */
public class SingaLaut extends FinnedMeat {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
     */
    public SingaLaut(int i, int j) {
        super(70, i, j, false);
        SetName("Singa Laut");
        SetContent('Y');
        consumerate += GetFodder();
    }
    /** @brief Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Ou Ou Ou";
    }
}
