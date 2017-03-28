package animal.real;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.legged.plankton.LeggedPlankton;

/** @class Kepiting
 * @brief Hewan yang bercapit dan berjalan miring
 */
public class Kepiting extends LeggedPlankton {
    /** @brief Constructor.
     * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
     */
    public Kepiting(int i, int j) {
        super(1, i, j, true);
        SetName("Kepiting");
        SetContent('M');
        consumerate += GetFodder();
    }
    /** @brief Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Kuikk kuikk";
    }
}
