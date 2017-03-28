package building;

import animal.Animal;
import animal.real.Bekantan;
import animal.real.BurungHantu;
import animal.real.Codot;
import animal.real.Elang;
import animal.real.Gajah;
import animal.real.Gorilla;
import animal.real.Harimau;
import animal.real.Hiu;
import animal.real.IkanTerbang;
import animal.real.Jerapah;
import animal.real.Kancil;
import animal.real.Kepik;
import animal.real.Kepiting;
import animal.real.KumbangHutan;
import animal.real.KupuKupu;
import animal.real.Lobster;
import animal.real.LumbaLumba;
import animal.real.MacanTutul;
import animal.real.OwaOwa;
import animal.real.PausSperma;
import animal.real.Piranha;
import animal.real.Platypus;
import animal.real.Singa;
import animal.real.SingaLaut;
import building.facility.Park;
import building.facility.Restaurant;
import building.facility.Road;
import building.facility.RoadEntrance;
import building.facility.RoadExit;
import building.habitat.real.AirHabitat;
import building.habitat.real.LandHabitat;
import building.habitat.real.WaterHabitat;

import java.util.Random;


/**
 * Created by um-13515026
 * on 28/03/17.
 */
public class Zoo {

  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_WHITE = "\u001B[37m";

  private int sizeBrs;
  private int sizeKol;
  private int numCage;
  private Cell[][] matCell;
  private Cage[] listCage;
  private Animal[] listAnimal;

  /**
   * Constructor.
   * Melakukan inisialisasi kelas Zoo
   *
   * @param sizeBrs ukuran baris (lebar) Zoo
   * @param sizeKol ukuran kolom (panjang) Zoo
   * @param numCage banyaknya kandang pada Zoo
   */
  public Zoo(int sizeBrs, int sizeKol, int numCage) {
    this.sizeBrs = sizeBrs;
    this.sizeKol = sizeKol;
    this.numCage = numCage;

    matCell = new Cell[sizeBrs][sizeKol];
    listCage = new Cage[numCage];
    listAnimal = new Animal[300];
  }

  /**
   * Getter untuk lebar Zoo.
   *
   * @return lebar Zoo
   */
  public int getSizeBrs() {
    return sizeBrs;
  }

  /**
   * Getter untuk panjang Zoo.
   *
   * @return panjang Zoo
   */
  public int getSizeKol() {
    return sizeKol;
  }

  /**
   * Getter untuk banyaknya Cage.
   *
   * @return banyaknya Cage
   */
  public int getNumCage() {
    return numCage;
  }

  /**
   * Getter untuk matrix Cell.
   *
   * @return matrix Cell
   */
  public Cell[][] getCell() {
    return matCell;
  }

  /**
   * Getter untuk array Cage.
   *
   * @return array Cage
   */
  public Cage[] getCage() {
    return listCage;
  }

  /**
   * Getter untuk array Animal.
   *
   * @return array Animal
   */
  public Animal[] getAnimal() {
    return listAnimal;
  }

  /**
   * Method untuk membuat Animal bergerak.
   */
  public void moveAnimal() {
    int x;
    int y;
    int move;
    int j;
    boolean moved;
    boolean dist = true;
    for (int i = 0; i < Animal.getNAnimal(); i++) {
      do {
        Random rand = new Random();
        move = rand.nextInt(5) + 1;
        x = listAnimal[i].getLocX();
        y = listAnimal[i].getLocY();
        switch (move) {
          // CHECK CELL APAKAH CAGED
          case 1:
            x--;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].distLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              x++;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          case 2:
            y++;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].distLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              y--;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          case 3:
            x++;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].distLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              x--;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          case 4:
            y--;
            listAnimal[i].setLoc(x, y);
            moved = true;
            j = 0;
            while (j < Animal.getNAnimal() && dist) {
              if (i != j) {
                dist = listAnimal[i].distLoc(listAnimal[j]);
              }
              j++;
            }
            if (!(matCell[x][y].isCaged()) || !dist) {
              y++;
              listAnimal[i].setLoc(x, y);
              moved = false;
            }
            break;
          default:
            moved = true;
            break;
        }
      } while (!moved);
    }
  }

  /**
   * Setter untuk inisialisasi Cell di Cage.
   *
   * @param n  array ke n pada Cage
   * @param nn array ke nn pada Cell di Cage
   * @param i  absis pada Zoo
   * @param j  ordinat pada Zoo
   */
  public void setCellCage(int n, int nn, int i, int j) {
    if (matCell[i][j].render() == '*') {
      listCage[n].getCell()[nn] = new AirHabitat(i, j);
    } else if (matCell[i][j].render() == '#') {
      listCage[n].getCell()[nn] = new LandHabitat(i, j);
    } else if (matCell[i][j].render() == '~') {
      listCage[n].getCell()[nn] = new WaterHabitat(i, j);
    }
    listCage[n].getCell()[nn].setCaged();
    listCage[n].incSize();
    matCell[i][j].setCaged();
  }

  /**
   * Create Cage pada Zoo.
   *
   * @param n array ke n pada Cage
   */
  public void createCage(int n) {
    listCage[n] = new Cage();
  }

  /**
   * Create Cell pada Zoo.
   *
   * @param c content yang ada pada Cell di Zoo
   * @param i absis pada Cell di Zoo
   * @param j ordinat pada Cell di Zoo
   */
  public void createCell(char c, int i, int j) {
    switch (c) {
      case '*':
        matCell[i][j] = new AirHabitat(i, j);
        break;
      case '#':
        matCell[i][j] = new LandHabitat(i, j);
        break;
      case '~':
        matCell[i][j] = new WaterHabitat(i, j);
        break;
      case '+':
        matCell[i][j] = new Road(i, j);
        break;
      case '=':
        matCell[i][j] = new RoadEntrance(i, j);
        break;
      case '!':
        matCell[i][j] = new RoadExit(i, j);
        break;
      case '.':
        matCell[i][j] = new Park(i, j);
        break;
      case '$':
        matCell[i][j] = new Restaurant(i, j);
        break;
      default:
        System.out.println("Gagal create Cell");
        break;
    }
  }

  /**
   * Create Animal pada Zoo.
   *
   * @param c content yang ada pada Animal di Zoo
   * @param i absis pada Animal di Zoo
   * @param j ordinat pada Animal di Zoo
   * @param n jumlah total hewan yang ada pada Zoo
   */
  public void createAnimal(char c, int i, int j, int n) {
    if (matCell[i][j].isCaged()) {
      int k = 0;
      boolean found = false;
      while (k < getNumCage() && !found) {
        int l = 0;
        while (l < listCage[k].getSize() && !found) {
          if (listCage[k].getCell()[l].getX() == i && listCage[k].getCell()[l].getY() == j) {
            found = true;
          } else {
            l++;
          }
        }
        k++;
      }
      k--;
      int area = listCage[k].getSize();
      int maxNAnimal = area * 3 / 10;
      int numAnimal = 0;
      for (int ii = 0; ii < Animal.getNAnimal(); ii++) {
        for (int jj = 0; jj < listCage[k].getSize(); jj++) {
          if (listCage[k].getCell()[jj].getX() == listAnimal[ii].getLocX()
            && listCage[k].getCell()[jj].getY() == listAnimal[ii].getLocY()) {
            numAnimal++;
          }
        }
      }
      if (numAnimal < maxNAnimal) {
        switch (c) {
          case 'A':
            listAnimal[n] = new Bekantan(i, j);
            break;
          case 'B':
            listAnimal[n] = new BurungHantu(i, j);
            break;
          case 'C':
            listAnimal[n] = new Codot(i, j);
            break;
          case 'D':
            listAnimal[n] = new Elang(i, j);
            break;
          case 'E':
            listAnimal[n] = new Gajah(i, j);
            break;
          case 'F':
            listAnimal[n] = new Gorilla(i, j);
            break;
          case 'G':
            listAnimal[n] = new Harimau(i, j);
            break;
          case 'H':
            listAnimal[n] = new Hiu(i, j);
            break;
          case 'I':
            listAnimal[n] = new IkanTerbang(i, j);
            break;
          case 'J':
            listAnimal[n] = new Jerapah(i, j);
            break;
          case 'K':
            listAnimal[n] = new Kancil(i, j);
            break;
          case 'L':
            listAnimal[n] = new Kepik(i, j);
            break;
          case 'M':
            listAnimal[n] = new Kepiting(i, j);
            break;
          case 'N':
            listAnimal[n] = new KumbangHutan(i, j);
            break;
          case 'O':
            listAnimal[n] = new KupuKupu(i, j);
            break;
          case 'P':
            listAnimal[n] = new Lobster(i, j);
            break;
          case 'Q':
            listAnimal[n] = new LumbaLumba(i, j);
            break;
          case 'R':
            listAnimal[n] = new MacanTutul(i, j);
            break;
          case 'S':
            listAnimal[n] = new OwaOwa(i, j);
            break;
          case 'T':
            listAnimal[n] = new PausSperma(i, j);
            break;
          case 'U':
            listAnimal[n] = new Piranha(i, j);
            break;
          case 'V':
            listAnimal[n] = new Platypus(i, j);
            break;
          case 'W':
            listAnimal[n] = new Singa(i, j);
            break;
          case 'X':
            listAnimal[n] = new SingaLaut(i, j);
            break;
          default:
            System.out.println("Hewan tidak ditemukan");
            break;
        }
      }
    }

  }

  /**
   * Melakukan print Zoo pada layar.
   */
  public void printZoo() {
    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {
        System.out.print(matCell[i][j].render());
      }
      System.out.println("");
    }
  }

  /**
   * Melakukan print Cage yang ada di Zoo pada layar.
   */
  public void printZooCage() {
    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {
        char c = matCell[i][j].render();
        if (c == '*' || c == '#' || c == '~') {
          if (matCell[i][j].isCaged()) {
            System.out.print(ANSI_RED + c + ANSI_RESET);
          } else {
            System.out.print(c);
          }
        } else {
          System.out.print(c);
        }
      }
      System.out.println("");
    }
  }

  /**
   * Melakukan print Animal yang ada di Cage yang ada di Zoo pada layar.
   */
  public void printZooCageAnimal(int x1, int y1, int x2, int y2) {

    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {

        char c = matCell[i][j].render();
        if (c == '*' || c == '#' || c == '~') {
          if (matCell[i][j].isCaged()) {
            boolean adaHewan = false;
            int hewanN = 0;
            for (int k = 0; k < Animal.getNAnimal(); k++) {
              if (listAnimal[k].getLocX() == i && listAnimal[k].getLocY() == j) {
                adaHewan = true;
                hewanN = k;
              }
            }
            if (i >= x1 && i <= x2 && j >= y1 && j <= y2) {
              if (adaHewan) {
                System.out.print(ANSI_PURPLE + listAnimal[hewanN].getContent() + ANSI_RESET);
              } else {
                System.out.print(ANSI_RED + c + ANSI_RESET);
              }
            }
          } else {
            if (i >= x1 && i <= x2 && j >= y1 && j <= y2) {
              System.out.print(c);
            }
          }
        } else {
          if (i >= x1 && i <= x2 && j >= y1 && j <= y2) {
            if (c == '+') {
              System.out.print(ANSI_WHITE + c + ANSI_RESET);
            } else if (c == '.') {
              System.out.print(ANSI_GREEN + c + ANSI_RESET);
            } else if (c == '$') {
              System.out.print(ANSI_YELLOW + c + ANSI_RESET);
            } else {
              System.out.print(c);
            }
          }
        }
      }
      System.out.println("");
    }
  }

  /**
   * Melakukan print complete Zoo disertai tour pada layar.
   */
  public void printZooAnimalCageTour(int x, int y) {

    for (int i = 0; i < sizeBrs; i++) {
      for (int j = 0; j < sizeKol; j++) {
        if (i == x && j == y) {
          System.out.print(ANSI_BLUE + 'P' + ANSI_RESET);
        } else {
          char c = matCell[i][j].render();
          if (c == '*' || c == '#' || c == '~') {
            if (matCell[i][j].isCaged()) {
              boolean adaHewan = false;
              int hewanN = 0;
              for (int k = 0; k < Animal.getNAnimal(); k++) {
                if (listAnimal[k].getLocX() == i && listAnimal[k].getLocY() == j) {
                  adaHewan = true;
                  hewanN = k;
                }
              }
              if (adaHewan) {
                System.out.print(ANSI_PURPLE + listAnimal[hewanN].getContent() + ANSI_RESET);
              } else {
                System.out.print(ANSI_RED + c + ANSI_RESET);
              }
            } else {
              System.out.print(c);
            }
          } else {
            if (c == '+') {
              System.out.print(ANSI_WHITE + c + ANSI_RESET);
            } else if (c == '.') {
              System.out.print(ANSI_GREEN + c + ANSI_RESET);
            } else if (c == '$') {
              System.out.print(ANSI_YELLOW + c + ANSI_RESET);
            } else {
              System.out.print(c);
            }
          }
        }
      }
      System.out.println("");
    }
  }
}
