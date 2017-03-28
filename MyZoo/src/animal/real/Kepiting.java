package animal.real;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.legged.plankton.LeggedPlankton;

/** Kepiting
 * Hewan yang bercapit dan berjalan miring
 */
public class Kepiting extends LeggedPlankton {
    /** Constructor.
     * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
     */
    public Kepiting(int i, int j) {
        super(1, i, j, true);
        setName("Kepiting");
        setContent('M');
        consumerate += getFodder();
    }
    /**  Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Kuikk kuikk";
    }
}
