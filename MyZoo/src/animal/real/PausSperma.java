package animal.real;

import animal.classification.water.finned.plankton.FinnedPlankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/** @class PausSperma
 * @brief Hewan yang hidup di laut dan berukuran sangat besar
 */
public class PausSperma extends FinnedPlankton {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
     */
    public PausSperma(int i, int j) {
        super(7000, i, j, true);
        SetName("Paus Sperma");
        SetContent('T');
        consumerate += GetFodder();
    }
    /** @brief Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Srosh srosh";
    }
}
