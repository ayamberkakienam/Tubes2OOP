package building;

/**
 * Class Building.Building.Cell.
 * Merepresentasikan petak yang ada pada Virtual Zoo.
 * <p></p>
 * Created by um on 27/03/17.
 */
public abstract class Cell implements Renderable {

  private final int locX;
  private final int locY;
  private char content;
  private boolean caged;

  /**
   * Default class constructor.
   */
  public Cell() {
    this.locX = 0;
    this.locY = 0;
    this.content = '-';
    this.caged = false;
  }

  /**
   * Class constructor dengan parameter absis dan ordinat
   * dari lokasi cell.
   *
   * @param i absis lokasi cell
   * @param j ordinat lokasi cell
   */
  public Cell(int i, int j) {
    this.locX = i;
    this.locY = j;
    this.content = '-';
    this.caged = false;
  }

  /**
   * Mendapatkan content.
   *
   * @return content cell
   */
  public char getContent() {
    return this.content;
  }

  /**
   * Mengubah content.
   *
   * @param content content merupakan satu karakter unik.
   */
  protected void setContent(char content) {
    this.content = content;
  }

  /**
   * Mendapatkan lokasi absis.
   *
   * @return lokasi absis cell
   */
  public int getX() {
    return this.locX;
  }

  /**
   * Mendapatkan lokasi ordinat.
   *
   * @return lokasi ordinat cell
   */
  public int getY() {
    return this.locY;
  }

  /**
   * Mengembalikan nilai boolean jika habitat terletak dalam kandang atau tidak.
   *
   * @return boolean caged.
   */
  public boolean isCaged() {
    return caged;
  }

  /**
   * Memberikan atau mengubah nilai boolean dari caged.
   */
  public void setCaged() {
    this.caged = true;
  }

  /**
   * Menampilkan informasi lokasi dan content cell.
   */
  private void display() {
    System.out.println("x : " + getX());
    System.out.println("y : " + getY());
    System.out.println("content : " + getContent());
  }

  /**
   * Mengembalikan content dari cell.
   *
   * @return karakter content pada cell
   */
  @Override
  public char render() {
    return getContent();
  }
}
