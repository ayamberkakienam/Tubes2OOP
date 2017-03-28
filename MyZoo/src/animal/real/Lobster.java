package animal.real;

import animal.classification.water.legged.plankton.LeggedPlankton;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/** Lobster
 *  Hewan yang hidup di laut dan memiliki rasa daging yang enak
 */
public class Lobster extends LeggedPlankton {
    /**  Constructor.
     * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
     */
    public Lobster(int i, int j) {
        super((float)0.5, i, j, true);
        setName("Lobster");
        setContent('P');
        consumerate += getFodder();
    }
    /**  Menghasilkan suara hewan yang khas
     * @return string suara hewan.
     */
    public String Interact() {
        return "Crek crek crek";
    }
}
