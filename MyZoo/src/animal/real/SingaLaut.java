package animal.real;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

import animal.classification.water.finned.meat.FinnedMeat;

/** SingaLaut
 *  Hewan yang pandai berenang dan memakan ikan
 */
public class SingaLaut extends FinnedMeat {
    /**  Constructor.
     * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
     */
    public SingaLaut(int i, int j) {
        super(70, i, j, false);
        setName("Singa Laut");
        setContent('Y');
        consumerate += getFodder();
    }
    /**  Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String interact() {
        return "Ou Ou Ou";
    }
}
