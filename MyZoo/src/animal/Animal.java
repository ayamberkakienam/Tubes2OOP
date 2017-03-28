/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

package animal;

/**
 * Animal.
 * Kelas abstract base class(ABC) untuk animal
 */
public abstract class Animal {
  static {
    /**
     * Akumulasi jumlah makanan yang dikonsumsi tiap jenis hewan per hari.
     */
    consumerate = 0;
    /**
     * Jumlah hewan yang telah di construct.
     */
    numAnimal = 0;
  }

  /**
   * Nama jenis hewan.
   */
  private String name;
  /**
   * Habitat hidup hewan.
   */
  private String habitat;
  /**
   * Berat tubuh hewan.
   */
  private float weight;
  /**
   * Jumlah makan yang dikonsumsi hewan per hari.
   */
  protected float fodder;
  /**
   * Tipe diet hewan.
   */
  private String type;
  /**
   * True apabila hewan telah dijinakkan.
   */
  private boolean tamed;
  /**
   * Jenis makanan hewan.
   */
  private String diet;
  /**
   * Indeks baris pada map zoo tempat hewan berada.
   */
  private int locX;
  /**
   * Indeks kolom pada map zoo tempat hewan berada.
   */
  private int locY;
  /**
   * Jumlah kaki hewan.
   */
  private int legs;
  /**
   * Karakter yang melambangkan hewan apabila map zoo dicetak.
   */
  private char content;
  /**
   * Jumlah hewan yang telah di construct.
   */
  private static int numAnimal;
  /**
   * Akumulasi jumlah makanan yang dikonsumsi tiap jenis hewan per hari.
   */
  public static float consumerate;

  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter berat,
   * koordinat lokasi x, koordinat lokasi y, dan kejinakan
   *
   * @param w        Berat tubuh hewan
   * @param x        Letak hewan berdasarkan indeks baris map zoo
   * @param y        Letak hewan berdasarkan indeks kolom map zoo
   * @param tame     true apabila hewan telah dijinakkan
   * @param content Karakter ASCII yang akan melambangkan hewan pada map zoo
   */
  public Animal(float w, int x, int y, boolean tame, char content) {
    weight = w;
    locX = x;
    locY = y;
    tamed = tame;
    this.content = content;
    numAnimal++;
  }

  /**
   * Menetapkan nama dari sebuah animal.
   *
   * @param names Nama hewan
   */
  public void setName(String names) {
    name = names;
  }

  /**
   * Setter habitat hidup hewan.
   *
   * @param habitat Habitat hidup hewan
   */
  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  /**
   * Menetapkan lokasi dari sebuah objek animal.
   *
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   */
  public void setLoc(int x, int y) {
    locX = x;
    locY = y;
  }

  /**
   * Menetapkan makanan dari sebuah objek animal.
   *
   * @param food Jenis makanan hewan
   */
  public void setDiet(String food) {
    diet = food;
  }

  /**
   * Setter tipe diet hewan.
   *
   * @param type Tipe diet hewan
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Menetapkan kejinakan dari sebuah objek animal.
   *
   * @param tame True apabila hewan telah dijinakkan
   */
  public void setTamed(boolean tame) {
    tamed = tame;
  }

  /**
   * Menetapkan jumlah kaki dari sebuah objek animal.
   *
   * @param nleg Jumlah kaki hewan
   */
  public void setLeg(int nleg) {
    legs = nleg;
  }

  /**
   * Setter karakter yang akan mewakili posisi hewan pada Map Zoo.
   *
   * @param content Karakter yang mewakili hewan pada Map Zoo
   */
  public void setContent(char content) {
    this.content = content;
  }

  /**
   * Menghasilkan nama hewan.
   *
   * @return string suara hewan.
   */
  public String getName() {
    return name;
  }

  /**
   * Mengembalikan letak baris objek pada map zoo.
   *
   * @return Indeks baris map zoo dimana objek berada
   */
  public int getLocX() {
    return locX;
  }

  /**
   * Mengembalikan letak kolom objek pada map zoo.
   *
   * @return Indeks kolom map zoo dimana objek berada
   */
  public int getLocY() {
    return locY;
  }

  /**
   * Mengembalikan jumlah makanan yang dikonsumsi hewan per hari.
   *
   * @return Berat makanan yang dikonsumsi hewan dalam satu hari
   */
  public double getFodder() {
    return 0.025 * weight;
  }

  /**
   * Getter nilai atribut content.
   *
   * @return content
   */
  public char getContent() {
    return content;
  }

  /**
   * Mengembalikan berat badan hewan.
   *
   * @return Berat badan hewan
   */
  public float getWeight() {
    return weight;
  }

  /**
   * Mengembalikan true jika hewan telah dijinakkan.
   *
   * @return True apabila hewan telah dijinakkan
   */
  public boolean isTamed() {
    return tamed;
  }

  /**
   * Mengembalikan jumlah kaki objek animal.
   *
   * @return Jumlah kaki hewan
   */
  public int getLegs() {
    return legs;
  }

  /**
   * Mengembalikan true apabila hewan tidak berada pada cell dengan baris
   * yang sama dengan an.
   *
   * @param an Hewan yang menjadi acuan
   * @return True apabila objek tidak berada pada cell dengan indeks baris
   *         yang sama dengan objek an
   */
  private boolean distLocX(Animal an) {
    return (locX != an.locX);
  }

  /**
   * Mengembalikan true apabila hewan tidak berada pada cell dengan kolom
   * yang sama dengan an.
   *
   * @param an Hewan yang menjadi acuan
   * @return True apabila objek tidak berada pada cell dengan indeks kolom
   *         yang sama dengan objek an
   */
  private boolean distLocY(Animal an) {
    return (locY != an.locY);
  }

  /**
   * Mengembalikan true apabila hewan tidak berada pada cell yang sama
   * dengan an.
   *
   * @param an Hewan yang menjadi acuan
   * @return True apabila objek tidak berada pada cell yang sama dengan objek an
   */
  public boolean distLoc(Animal an) {
    return (distLocX(an) || distLocY(an));
  }

  /**
   * Mencetak semua atribut kelas beserta nilainya.
   */
  public void getInfo() {
    System.out.println("Content        : " + content);
    System.out.println("Name           : " + name);
    System.out.println("Location       : (" + locX + "," + locY + ")");
    System.out.println("Weight         : " + String.format("%.5f", weight) + " kg/day");
    System.out.println("Habitat        : " + habitat);
    System.out.println("Type           : " + type);
    System.out.println("Diet           : " + diet);
    System.out.println("Fodder         : " + String.format("%.5f", getFodder()) + " kg");
    System.out.println(tamed ? "Tame           : Yes " : "Tame           : No ");
    System.out.println("Number of Legs : " + legs);
  }

  /**
   * Fungsi abstrak, mengembalikan string yang menggambarkan
   * interaksi user dengan hewan.
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  public abstract String interact();

  /**
   * Mengembalikan berat total makanan yang dikonsumsi semua hewan per hari.
   *
   * @return Berat makanan yang dikonsumsi semua jenis hewan pada map zoo per hari
   */
  public static float getConsumeRate() {
    return consumerate;
  }

  /**
   * Getter nilai data numAnimal.
   *
   * @return numAnimal
   */
  public static int getNAnimal() {
    return numAnimal;
  }


}
