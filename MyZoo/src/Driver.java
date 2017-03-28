import animal.Animal;
import building.Zoo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 * Driver.
 * Menangani pembacaan dari file eksternal dan pembuatan map kebun binatang
 * <p></p>
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */
public class Driver {
  private int mapBrs;
  private int mapKol;
  private int numCage;
  private char [][]map;
  private String []strTemp;
  private Zoo myZoo;

  /**
   * Constructor.
   * Membaca file eksternal dan menyimpan informasi jumlah baris dan kolom map
   * @throws FileNotFoundException if file not found
   */
  public Driver() throws FileNotFoundException {
    int brs = 0;
    map = new char[500][500];
    strTemp = new String[500];
    try {
      FileInputStream fstream = new FileInputStream("map.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String strLine;
      while ((strLine = br.readLine()) != null) {
        strTemp[brs] = strLine;
        for (int j = 0; j < strLine.length(); j++) {
          map[brs][j] = strLine.charAt(j);
        }
        brs++;
      }
    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());
    }
    mapBrs = brs - 1;
    numCage = Integer.parseInt(strTemp[brs - 1].substring(5));
    int kol = 0;
    int x = 0;
    while (x < strTemp[0].length()) {
      if ((map[0][x] == 'A')
          || (map[0][x] == 'W')
          || (map[0][x] == 'L')) {
        x = x + 2;
      } else {
        x++;
      }
      kol++;
    }
    mapKol = kol;
    myZoo = new Zoo(mapBrs, mapKol, numCage);
  }

  /**
   * Mengembalikan jumlah baris yang menyusun map
   * I.S : Costructor driver telah dipanggil
   * F.S : Mendapakan jumlah baris map
   * @return jumlah baris map.
   */
  public int getMapBrs() {
    return mapBrs;
  }

  /**
   * Mengembalikan jumlah kolom yang menyusun map
   * I.S : Costructor driver telah dipanggil
   * F.S : Mendapakan jumlah kolom map
   * @return jumlah kolom map.
   */
  public int getMapKol() {
    return mapKol;
  }

  /**
   * Mengembalikan jumlah kandang pada map
   * I.S : Costructor driver telah dipanggil
   * F.S : Mendapakan jumlah kandang map
   * @return jumlah kandang map.
   */
  public int getNumCage() {
    return numCage;
  }

  /** getter untuk atribut myZoo
   * I.S : Costructor driver telah dipanggil
   * F.S : Mendapakan object Zoo yang telah dihidupkan
   * @return Object myZoo.
   */
  public Zoo getZoo() {
    return myZoo;
  }

  /** Menginisiasi semua cell pada map
   *  I.S : myZoo terdefinisi
   *  F.S : Cell pada myZoo terbentuk
   */
  void initCell() {
    int i;
    int jneff;
    int j;
    for (i = 0; i < mapBrs; i++) {
      j = 0;
      jneff = 0;
      while (j < strTemp[i].length()) {
        char c = map[i][j];
        if (c < 48 || c > 57) {
          myZoo.createCell(map[i][j], i, jneff);
          jneff++;
        }
        j++;
      }
    }
  }

  /** Menginisiasi semua kandang pada map
   *  I.S : myZoo terdefinisi
   *  F.S : semua kandang pada myZoo telah diciptakan
   */
  void initCage() {
    int j;
    int count = 0;
    int i;
    int jneff;
    int idx;
    char digit1 = 48;
    char digit2 = 49;
    while (count < numCage) {
      idx = 0;
      for (i = 0; i < mapBrs; i++) {
        j = 0;
        jneff = 0;
        while (j < strTemp[i].length()) {
          if (count < 9) {
            if (map[i][j] == digit2) {
              if ((map[i][j + 1] == '#')
                  || (map[i][j + 1] == '~')
                  || (map[i][j + 1] == '*')) {
                myZoo.setCellCage(count, idx, i, jneff);
                j = j + 2;
                idx++;
                jneff++;
              } else { //angka sama tapi beda belakangnya (dua digit)
                j = j + 3;
                jneff++;
              }
            } else if ((map[i][j] == '#')
                || (map[i][j] == '~')
                || (map[i][j] == '*')
                || (map[i][j] == '.')
                || (map[i][j] == '+')
                || (map[i][j] == '=')
                || (map[i][j] == '$')
                || (map[i][j] == '!')) {
              j++;
              jneff++;
            } else { // angka satu digit beda
              if ((map[i][j + 1] == '#')
                  || (map[i][j + 1] == '~')
                  || (map[i][j + 1] == '*')
                  || (map[i][j + 1] == '.')
                  || (map[i][j + 1] == '+')
                  || (map[i][j + 1] == '=')
                  || (map[i][j + 1] == '$')
                  || (map[i][j + 1] == '!')) {
                j = j + 2;
                jneff++;
              } else { //dua digit
                j = j + 3;
                jneff++;
              }
            }
          } else {
            if (map[i][j] == digit1) {
              if (map[i][j + 1] == digit2) {
                myZoo.setCellCage(count, idx, i, jneff);
                j = j + 3;
                idx++;
                jneff++;
              } else if ((map[i][j + 1] == '#')
                  || (map[i][j + 1] == '~')
                  || (map[i][j + 1] == '*')
                  || (map[i][j + 1] == '.')
                  || (map[i][j + 1] == '+')
                  || (map[i][j + 1] == '=')
                  || (map[i][j + 1] == '$')
                  || (map[i][j + 1] == '!')) {
                j = j + 2;
                jneff++;
              } else { //dua digit beda
                j = j + 3;
                jneff++;
              }
            } else if ((map[i][j] == '#')
                || (map[i][j] == '~')
                || (map[i][j] == '*')
                || (map[i][j] == '.')
                || (map[i][j] == '+')
                || (map[i][j] == '=')
                || (map[i][j] == '$')
                || (map[i][j] == '!')) { //bukan angka
              j++;
              jneff++;
            } else { //angka tapi beda
              if ((map[i][j + 1] == '#')
                  || (map[i][j + 1] == '~')
                  || (map[i][j + 1] == '*')
                  || (map[i][j + 1] == '.')
                  || (map[i][j + 1] == '+')
                  || (map[i][j + 1] == '=')
                  || (map[i][j + 1] == '$')
                  || (map[i][j + 1] == '!')) {
                j = j + 2;
                jneff++;
              } else { // dua digit
                j = j + 3;
                jneff++;
              }
            }
          }
        }
      }
      if (count % 10 == 8) {
        digit1++;
        digit2 = 48;
      } else {
        digit2++;
      }
      count++;
    }
  }

  /**
   * Menginisiasi semua animal pada map
   * I.S : myZoo terdefinisi
   * F.S : Animal pada map terdefinisi sesuai posisinya
   * @throws FileNotFoundException if file not found
   */
  void initAnimal() throws FileNotFoundException {
    int brs = 0;
    map = new char[500][500];
    strTemp = new String[500];
    try {
      FileInputStream fstream = new FileInputStream("animal.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String strLine;
      while ((strLine = br.readLine()) != null) {
        strTemp[brs] = strLine;
        for (int j = 0; j < strLine.length(); j++) {
          map[brs][j] = strLine.charAt(j);
        }
        brs++;
      }
    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());
    }

    int jneff;
    for (int i = 0; i < mapBrs; i++) {
      int j = 0;
      jneff = 0;
      while (j < strTemp[i].length()) {
        switch (map[i][j]) {
          case '-' :
            jneff++;
            break;
          default:
            myZoo.createAnimal(map[i][j], i, jneff, Animal.getNAnimal());
            jneff++;
            break;
        }
        j++;
      }
    }
  }

  private int [][] mazeZoo;
  private boolean [][] mazeWasHere;
  private boolean [][] mazeRightPath;
  private int xxKeluar;
  private int yyKeluar;
  private int panjang;
  private int lebar;
  private Vector<Integer> vecx = new Vector<>();
  private Vector<Integer> vecy = new Vector<>();

  private boolean solveMaze(int x, int y) {
    if (!mazeWasHere[x][y] && mazeZoo[x][y] != 2) {
      vecx.addElement(x);
      vecy.addElement(y);
    }
    if (x == xxKeluar && y == yyKeluar) {
      return true;
    }
    if (mazeZoo[x][y] == 2 || mazeWasHere[x][y]) {
      return false;
    }
    mazeWasHere[x][y] = true;
    if (x != 0) {
      if (solveMaze(x - 1, y)) {
        mazeRightPath[x][y] = true;
        return true;
      }
    }
    if (x != panjang - 1) {
      if (solveMaze(x + 1, y)) {
        mazeRightPath[x][y] = true;
        return true;
      }
    }
    if (y != 0) {
      if (solveMaze(x, y - 1)) {
        mazeRightPath[x][y] = true;
        return true;
      }
    }
    if (y != lebar - 1) {
      if (solveMaze(x, y + 1)) {
        mazeRightPath[x][y] = true;
        return true;
      }
    }
    return false;
  }

  void tourZoo() {

    //x dan y adalah posisi awal "pengunjung"
    //asumsi pintu masuk dan keluar paling banyak ada 10
    int numMasuk = 0;
    int numKeluar = 0;
    int [] masukX;
    masukX = new int[10];
    int [] masukY;
    masukY = new int[10];
    int [] keluarX;
    keluarX = new int[10];
    int [] keluarY;
    keluarY = new int[10];

    panjang = myZoo.getSizeBrs();
    lebar = myZoo.getSizeKol();
    for (int i = 0; i < panjang ; i++) {
      for (int j = 0; j < lebar; j++) {
        //cari semua entrance dan exit yang ada
        if (i == 0 || i == panjang - 1 || j == 0 || j == lebar - 1) {
          if (myZoo.getCell()[i][j].render() == '=') {
            masukX[numMasuk] = i;
            masukY[numMasuk] = j;
            numMasuk++;
          }
          if (myZoo.getCell()[i][j].render() == '!') {
            keluarX[numKeluar] = i;
            keluarY[numKeluar] = j;
            numKeluar++;
          }
        }
      }
    }
    int random;
    //random pintu masuk dan keluar
    Random rand = new Random();
    random = rand.nextInt(numMasuk);

    xxKeluar = keluarX[random];
    yyKeluar = keluarY[random];

    char cont;
    mazeZoo = new int [panjang][lebar];
    mazeWasHere = new boolean[panjang][lebar];
    mazeRightPath = new boolean[panjang][lebar];
    for (int i = 0; i < panjang; i++) {
      for (int j = 0; j < lebar; j++) {
        cont = myZoo.getCell()[i][j].render();
        if (cont == '+' || cont == '!' || cont == '=') {
          mazeZoo[i][j] = 1;
        } else {
          mazeZoo[i][j] = 2;
        }
        mazeWasHere[i][j] = false;
        mazeRightPath[i][j] = false;
      }
    }

    int xxMasuk = masukX[random];
    int yyMasuk = masukY[random];
    //tour sampai exit (pencarian jalur dengan dfs)
    boolean tour = solveMaze(xxMasuk, yyMasuk);
    tour = !tour;

    int xx;
    int yy;
    int k;
    int l;
    int up;
    int down;
    int left;
    int right;
    for (int i = 0; i < vecx.size(); i++) {
      System.out.println("\033[H\033[J");
      xx = vecx.elementAt(i);
      yy = vecy.elementAt(i);

      up = xx - 1;
      down = xx + 1;
      left = yy - 1;
      right = yy + 1;

      myZoo.printZooAnimalCageTour(xx, yy);
      myZoo.moveAnimal();

      boolean found = false;
      boolean fup = false;
      boolean fdown = false;
      boolean fleft = false;
      boolean fright = false;
      k = 0;
      while (k < myZoo.getNumCage() && !found) {
        l = 0;
        while (l < myZoo.getCage()[k].getSize() && !found) {
          if (myZoo.getCage()[k].getCell()[l].getX() == up
              && myZoo.getCage()[k].getCell()[l].getY() == yy) { //look up
            found = true;
            fup = true;
          } else if (myZoo.getCage()[k].getCell()[l].getX() == down
              && myZoo.getCage()[k].getCell()[l].getY() == yy) { //look down
            found = true;
            fdown = true;
          } else if (myZoo.getCage()[k].getCell()[l].getX() == xx
              && myZoo.getCage()[k].getCell()[l].getY() == right) { //right
            found = true;
            fright = true;
          } else if (myZoo.getCage()[k].getCell()[l].getX() == xx
              && myZoo.getCage()[k].getCell()[l].getY() == left) { //left
            found = true;
            fleft = true;
          } else {
            l++;
          }
        }
        k++;
      }
      k--;

      if (found) {
        boolean [] visited = new boolean[24];
        for (int lop = 0; lop < 24; lop++) {
          visited[lop] = false;
        }
        if (fup) {
          for (int a = 0; a < myZoo.getCage()[k].getSize(); a++) {
            for (int b = 0; b < Animal.getNAnimal(); b++) {
              if (myZoo.getCage()[k].getCell()[a].getX() == myZoo.getAnimal()[b].getLocX()
                  && myZoo.getCage()[k].getCell()[a].getY() == myZoo.getAnimal()[b].getLocY()) {
                cont = myZoo.getAnimal()[b].getContent();
                if (visited[cont - 65]) {
                  // sudah
                } else {
                  myZoo.getAnimal()[b].getInfo();
                  visited[cont - 65] = true;
                }
              }
            }
          }
        }
        if (fdown) {
          for (int a = 0; a < myZoo.getCage()[k].getSize(); a++) {
            for (int b = 0; b < Animal.getNAnimal(); b++) {
              if (myZoo.getCage()[k].getCell()[a].getX() == myZoo.getAnimal()[b].getLocX()
                  && myZoo.getCage()[k].getCell()[a].getY() == myZoo.getAnimal()[b].getLocY()) {
                cont = myZoo.getAnimal()[b].getContent();
                if (visited[cont - 65]) {
                  // sudah
                } else {
                  myZoo.getAnimal()[b].getInfo();
                  visited[cont - 65] = true;
                }
              }
            }
          }
        }
        if (fright) {
          for (int a = 0; a < myZoo.getCage()[k].getSize(); a++) {
            for (int b = 0; b < Animal.getNAnimal(); b++) {
              if (myZoo.getCage()[k].getCell()[a].getX() == myZoo.getAnimal()[b].getLocX()
                  && myZoo.getCage()[k].getCell()[a].getY() == myZoo.getAnimal()[b].getLocY()) {
                cont = myZoo.getAnimal()[b].getContent();
                if (visited[cont - 65]) {
                  // sudah
                } else {
                  myZoo.getAnimal()[b].getInfo();
                  visited[cont - 65] = true;
                }
              }
            }
          }
        }
        if (fleft) {
          for (int a = 0; a < myZoo.getCage()[k].getSize(); a++) {
            for (int b = 0; b < Animal.getNAnimal(); b++) {
              if (myZoo.getCage()[k].getCell()[a].getX() == myZoo.getAnimal()[b].getLocX()
                  && myZoo.getCage()[k].getCell()[a].getY() == myZoo.getAnimal()[b].getLocY()) {
                cont = myZoo.getAnimal()[b].getContent();
                if (visited[cont - 65]) {
                  // sudah
                } else {
                  myZoo.getAnimal()[b].getInfo();
                  visited[cont - 65] = true;
                }
              }
            }
          }
        }
      }
      System.out.println("Press \"ENTER\" to continue...");
      Scanner scanner = new Scanner(System.in);
      scanner.nextLine();
    }
  }
}