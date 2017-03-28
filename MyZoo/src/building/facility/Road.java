package building.facility;

/**
 * Created by um-13515026
 * on 27/03/17.
 */

/** Road
 * Menangani objek road yang merupakan fasilitas umum kebun binatang
 */
public class Road extends Facility {

  private boolean exit;
  private boolean entrance;
  /**
   * Melakukan inisialisasi kelas road dengan parameter absis dan ordinat lokasi facility
   * @param i Absis
   * @param j Ordinat
   */
  public Road(int i, int j) {
    super(i, j);
    setContent('+');
    setEntrance(false);
    setExit(false);
  }
  /** Mengembalikan nilai boolean jika sebuah road merupakan jalan keluar
   * @return boolean exit.
   */
  public boolean isExit() {
    return exit;
  }
  /** Memberikan atau mengubah nilai boolean dari exit
   *
   */
  protected void setExit(boolean exit) {
    this.exit = exit;
  }
  /** Mengembalikan nilai boolean jika sebuah road merupakan jalan masuk
   * @return boolean entrance.
   */
  public boolean isEntrance() {
    return entrance;
  }
  /** Memberikan atau mengubah nilai boolean dari entrance
   *
   */
  protected void setEntrance(boolean entrance) {
    this.entrance = entrance;
  }
}
