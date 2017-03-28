package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/** Park
 * Menangani objek park yang merupakan fasilitas umum kebun binatang
 */
public class Park extends Facility {
  /**
   * Melakukan inisialisasi kelas park dengan parameter absis dan ordinat lokasi facility
   * @param i Absis
   * @param j Ordinat
   */
  public Park(int i, int j) {
    super(i, j);
    setContent('.');
  }
}