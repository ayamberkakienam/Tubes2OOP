package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/**
 * RoadExit
 * Menangani objek exit  yang merupakan pintu keluar kebun binatang
 */
public class RoadExit extends Road {
  /**
   * Melakukan inisialisasi kelas RoadExit dengan parameter absis dan ordinat lokasi facility
   *
   * @param i Absis
   * @param j Ordinat
   */
  public RoadExit(int i, int j) {
    super(i, j);
    setContent('!');
    setExit(true);
  }
}
