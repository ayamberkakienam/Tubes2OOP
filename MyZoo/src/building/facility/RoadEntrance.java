package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/**
 * RoadEntrance.
 * Menangani objek entrance  yang merupakan pintu masuk kebun binatang
 */
public class RoadEntrance extends Road {
  /**
   * Melakukan inisialisasi kelas RoadEntrance dengan parameter absis dan ordinat lokasi facility.
   *
   * @param i Absis
   * @param j Ordinat
   */
  public RoadEntrance(int i, int j) {
    super(i, j);
    setContent('=');
    setEntrance(true);
  }
}
