/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

package animal;

/** Animal
 * Kelas abstract base class(ABC) untuk animal
 */
public abstract class Animal {
  static {
  /**
   * Akumulasi jumlah makanan yang dikonsumsi tiap jenis hewan per hari
   */
    consumerate = 0;
  /**
   * Jumlah hewan yang telah di construct
   */
    n_animal = 0;
  }
  /** Constructor.
   * Melakukan inisialisasi kelas dengan parameter berat,koordinat lokasi x,koordinat lokasi y,dan kejinakan
   * @param w Berat tubuh hewan
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   * @param _content Karakter ASCII yang akan melambangkan hewan pada map zoo
   */
  public Animal(float w, int x, int y,boolean tame, char _content) {
    weight = w;
    loc_x = x;
    loc_y = y;
    tamed = tame;
    content = _content;
    n_animal++;
  }
  /** Menetapkan nama dari sebuah animal
   * @param names Nama hewan
   */
  public void setName(String names) {
    name = names;
  }
  /**
   * setter habitat hidup hewan
   * @param habitat Habitat hidup hewan
   */
  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }
  /** Menetapkan lokasi dari sebuah objek animal
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   */
  public void setLoc(int x, int y) {
    loc_x = x;
    loc_y = y;
  }
  /** Menetapkan makanan dari sebuah objek animal
   * @param food Jenis makanan hewan
   */
  public void setDiet(String food) {
    diet = food;
  }
  /**
   * setter tipe diet hewan
   * @param type Tipe diet hewan
   */
  public void setType(String type) {
    this.type = type;
  }
  /** Menetapkan kejinakan dari sebuah objek animal
   * @param tame True apabila hewan telah dijinakkan
   */
  public void setTamed(boolean tame) {
    tamed = tame;
  }
  /** Menetapkan jumlah kaki dari sebuah objek animal
   * @param nleg Jumlah kaki hewan
   */
  public void setLeg(int nleg) {
    legs = nleg;
  }
  /**
   * setter karakter yang akan mewakili posisi hewan pada Map Zoo
   * @param _content Karakter yang mewakili hewan pada Map Zoo
   */
  public void setContent(char _content) {
    content =  _content;
  }
  /** Menghasilkan nama hewan
   * @return string suara hewan.
   */
  public String getName() {
    return  name;
  }
  /**
   * Mengembalikan letak baris objek pada map zoo
   * @return Indeks baris map zoo dimana objek berada
   */
  public int getLocX() {
    return loc_x;
  }
  /**
   * Mengembalikan letak kolom objek pada map zoo
   * @return Indeks kolom map zoo dimana objek berada
   */
  public int getLocY() {
    return loc_y;
  }
  /**
   * Mengembalikan jumlah makanan yang dikonsumsi hewan per hari
   * @return Berat makanan yang dikonsumsi hewan dalam satu hari
   */
  public double getFodder() {
    return 0.025 * weight;
  }
  /**
   * getter nilai atribut content
   * @return content
   */
  public char getContent() {
    return content;
  }
  /**
   * Mengembalikan berat badan hewan
   * @return Berat badan hewan
   */
  public float getWeight() {
    return weight;
  }
  /**
   * Mengembalikan true jika hewan telah dijinakkan
   * @return True apabila hewan telah dijinakkan
   */
  public boolean IsTamed() {
    return tamed;
  }
  /**
   * Mengembalikan jumlah kaki objek animal
   * @return Jumlah kaki hewan
   */
  public int getLegs() {
    return legs;
  }
  /**
   * Mengembalikan true apabila hewan tidak berada pada cell dengan baris
   * yang sama dengan an
   * @param  an Hewan yang menjadi acuan
   * @return    True apabila objek tidak berada pada cell dengan indeks baris
   * yang sama dengan objek an
   */
  public boolean DistLocX(Animal an) {
    return (loc_x != an.loc_x);
  }
  /**
   * Mengembalikan true apabila hewan tidak berada pada cell dengan kolom
   * yang sama dengan an
   * @param  an Hewan yang menjadi acuan
   * @return    True apabila objek tidak berada pada cell dengan indeks kolom
   * yang sama dengan objek an
   */
  public boolean DistLocY(Animal an) {
    return (loc_y != an.loc_y);
  }
  /**
   * Mengembalikan true apabila hewan tidak berada pada cell yang sama
   * dengan an
   * @param  an Hewan yang menjadi acuan
   * @return    True apabila objek tidak berada pada cell yang sama dengan
   * objek an
   */
  public boolean DistLoc(Animal an) {
    return (DistLocX(an) || DistLocY(an));
  }
  /**
   * Mencetak semua atribut kelas beserta nilainya.
   */
  public void getInfo() {
    System.out.println("Content        : "+content);
    System.out.println("Name           : "+name);
    System.out.println("Location       : ("+loc_x+","+loc_y+")");
    System.out.println("Weight         : "+String.format("%.5f",weight)+" kg/day");
    System.out.println("Habitat        : "+habitat);
    System.out.println("Type           : "+type);
    System.out.println("Diet           : "+diet);
    System.out.println("Fodder         : "+String.format("%.5f",getFodder())+" kg");
    System.out.println(tamed ? "Tame           : Yes " : "Tame           : No ");
    System.out.println("Number of Legs : "+legs);
  }
  /**
   * Fungsi abstrak, mengembalikan string yang menggambarkan
   * interaksi user dengan hewan
   * @return String sesuai implementasi pada kelas riil turunan
   */
  abstract public String Interact();
  /**
   * Mengembalikan berat total makanan yang dikonsumsi semua hewan per hari
   * @return Berat makanan yang dikonsumsi semua jenis hewan pada map zoo per hari
   */
  static public float getConsumeRate() {
    return consumerate;
  }
  /**
   * getter nilai data n_animal
   * @return n_animal
   */
  static public int getNAnimal() {
    return  n_animal;
  }
  /**
   * Nama jenis hewan
   */
  protected String name;
  /**
   * Habitat hidup hewan
   */
  protected String habitat;
  /**
   * Berat tubuh hewan
   */
  protected float weight;
  /**
   * Jumlah makan yang dikonsumsi hewan per hari
   */
  protected float fodder;
  /**
   * Tipe diet hewan
   */
  protected String type;
  /**
   * True apabila hewan telah dijinakkan
   */
  protected boolean tamed;
  /**
   * Jenis makanan hewan
   */
  protected String diet;
  /**
   * Indeks baris pada map zoo tempat hewan berada
   */
  protected int loc_x;
  /**
   * Indeks kolom pada map zoo tempat hewan berada
   */
  protected int loc_y;
  /**
   * Jumlah kaki hewan
   */
  protected int legs;
  /**
   * Karakter yang melambangkan hewan apabila map zoo dicetak
   */
  protected char content;
  /**
   * Jumlah hewan yang telah di construct
   */
  static public int n_animal;
  /**
   * Akumulasi jumlah makanan yang dikonsumsi tiap jenis hewan per hari
   */
  static public float consumerate;
}
