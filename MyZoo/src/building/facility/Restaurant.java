package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/**
 * Restaurant.
 * Menangani objek restaurant yang merupakan fasilitas umum kebun binatang
 */
public class Restaurant extends Facility {
  /**
   * Melakukan inisialisasi kelas restaurant dengan parameter absis dan ordinat lokasi facility.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public Restaurant(int i, int j) {
    super(i, j);
    setContent('$');
  }
}
