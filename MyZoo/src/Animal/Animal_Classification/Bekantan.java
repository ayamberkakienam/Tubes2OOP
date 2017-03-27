package Animal.Animal_Classification;

/**
 * Created by root on 3/27/17.
 */
public class Bekantan extends Primata {
  /** @brief Constructor.
   * Melakukan inisialisasi kelas Bekantan dengan parameter absis dan ordinat lokasi
   */
  public Bekantan(int i, int j) {
    super(50, i, j, true);
    SetName("Bekantan");
    SetContent('A');
  }
  /** @brief Menghasilkan suara hewan yang khas
   * @return string suara hewan.
   */
  public String Interact() {
    return "Uuuuuuu";
  }
  /** @brief Mencetak informasi spesifik hewan
   */
  public void GetInfo() {
    PrintInfo(habitat, "Wawu");
  }
}
