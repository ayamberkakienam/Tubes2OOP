import animal.Animal;
import building.Zoo;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import static animal.Animal.getNAnimal;

/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

/**
 * Driver
 * Menangani pembacaan dari file eksternal dan pembuatan map kebun binatang
 */
public class Driver {
    private int map_brs;
    private int map_kol;
    private int num_cage;
    private char [][]map;
    private String []str_temp;
    private Zoo my_zoo;

    /**
     * @throws FileNotFoundException
     * Constructor.
     * Membaca file eksternal dan menyimpan informasi jumlah baris dan kolom map
     */
    public Driver() throws FileNotFoundException {
        int brs = 0;
        map = new char[500][500];
        str_temp = new String[500];
        try {
            FileInputStream fstream = new FileInputStream("MyZoo/map.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String str_line;
            while ((str_line = br.readLine()) != null) {
                str_temp[brs] = str_line;
                for (int j = 0; j < str_line.length(); j++) {
                    map[brs][j] = str_line.charAt(j);
                }
                brs++;
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        map_brs = brs - 1;
        num_cage = Integer.parseInt(str_temp[brs - 1].substring(5));
        int kol = 0;
        int x = 0;
        while (x < str_temp[0].length()) {
            if ((map[0][x] == 'A') || (map[0][x] == 'W') || (map[0][x] == 'L')) {
                x = x + 2;
            } else {
                x++;
            }
            kol++;
        }
        map_kol = kol;
//        System.out.println(map_brs + " " + map_kol + " " + num_cage);
        my_zoo = new Zoo(map_brs, map_kol, num_cage);
    }
    /**
     * @return jumlah baris map.
     * Mengembalikan jumlah baris yang menyusun map
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan jumlah baris map
     */
    public int getMapBrs() {
        return map_brs;
    }
    /**
     * @return jumlah kolom map.
     * Mengembalikan jumlah kolom yang menyusun map
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan jumlah kolom map
     */
    public int getMapKol() {
        return map_kol;
    }
    /**
     * @return jumlah kandang map.
     * Mengembalikan jumlah kandang pada map
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan jumlah kandang map
     */
    public int getNumCage() {
        return num_cage;
    }
    /** getter untuk atribut my_zoo
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan object Zoo yang telah dihidupkan
     * @return Object my_zoo.
     */
    public Zoo getZoo() {
        return my_zoo;
    }
    /** Menginisiasi semua cell pada map
     *  I.S : my_zoo terdefinisi
     *  F.S : Cell pada my_zoo terbentuk
     */
    void initCell() {
        int i, jneff;
        int j;
        for (i = 0; i < map_brs; i++) {
            j = 0;
            jneff = 0;
            while (j < str_temp[i].length()) {
                char c = map[i][j];
                if (c < 48 || c > 57) {
                    my_zoo.createCell(map[i][j], i, jneff);
                    jneff++;
                }
                j++;
            }
        }
    }
    /** Menginisiasi semua kandang pada map
     *  I.S : my_zoo terdefinisi
     *  F.S : semua kandang pada my_zoo telah diciptakan
     */
    void initCage() {
        int j;
        int count = 0, i, jneff, idx;
        char digit1 = 48;
        char digit2 = 49;
        while (count < num_cage) {
            idx = 0;
            for (i = 0; i < map_brs; i++) {
                j = 0;
                jneff = 0;
                while (j < str_temp[i].length()) {
                    if (count < 9) {
                        if (map[i][j] == digit2) {
                            if ((map[i][j+1] == '#') ||
                                    (map[i][j+1] == '~') ||
                                    (map[i][j+1] == '*')) {
                                my_zoo.setCellCage(count, idx, i, jneff);
                                j = j+2;
                                idx++;
                                jneff++;
                            }
                            else { //angka sama tapi beda belakangnya (dua digit)
                                j = j+3;
                                jneff++;
                            }
                        }
                        else if ((map[i][j]=='#') ||
                                (map[i][j]=='~') ||
                                (map[i][j]=='*') ||
                                (map[i][j]=='.') ||
                                (map[i][j]=='+') ||
                                (map[i][j]=='=') ||
                                (map[i][j]=='$') ||
                                (map[i][j]=='!')) {
                            j++;
                            jneff++;
                        }
                        else { // angka satu digit beda
                            if ((map[i][j+1]=='#') ||
                                    (map[i][j+1]=='~') ||
                                    (map[i][j+1]=='*') ||
                                    (map[i][j+1]=='.') ||
                                    (map[i][j+1]=='+') ||
                                    (map[i][j+1]=='=') ||
                                    (map[i][j+1]=='$') ||
                                    (map[i][j+1]=='!')) {
                                j = j+2;
                                jneff++;
                            }
                            else { //dua digit
                                j = j+3;
                                jneff++;
                            }
                        }
                    }
                    else {
                        if (map[i][j] == digit1) {
                            if (map[i][j+1] == digit2) {
                                my_zoo.setCellCage(count, idx, i, jneff);
                                j = j+3;
                                idx++;
                                jneff++;
                            }
                            else if ((map[i][j+1]=='#') ||
                                    (map[i][j+1]=='~') ||
                                    (map[i][j+1]=='*') ||
                                    (map[i][j+1]=='.') ||
                                    (map[i][j+1]=='+') ||
                                    (map[i][j+1]=='=') ||
                                    (map[i][j+1]=='$') ||
                                    (map[i][j+1]=='!')) {
                                j = j+2;
                                jneff++;
                            }
                            else { //dua digit beda
                                j = j+3;
                                jneff++;
                            }
                        }
                        else if ((map[i][j]=='#') ||
                                (map[i][j]=='~') ||
                                (map[i][j]=='*') ||
                                (map[i][j]=='.') ||
                                (map[i][j]=='+') ||
                                (map[i][j]=='=') ||
                                (map[i][j]=='$') ||
                                (map[i][j]=='!')) { //bukan angka
                            j++;
                            jneff++;
                        }
                        else { //angka tapi beda
                            if ((map[i][j+1]=='#') ||
                                    (map[i][j+1]=='~') ||
                                    (map[i][j+1]=='*') ||
                                    (map[i][j+1]=='.') ||
                                    (map[i][j+1]=='+') ||
                                    (map[i][j+1]=='=') ||
                                    (map[i][j+1]=='$') ||
                                    (map[i][j+1]=='!')) {
                                j = j+2;
                                jneff++;
                            }
                            else { // dua digit
                                j = j+3;
                                jneff++;
                            }
                        }
                    }
                }
            }
            if (count%10 == 8) {
                digit1++;
                digit2 = 48;
            }
            else {
                digit2++;
            }
            count++;
        }
    }
    /** Menginisiasi semua animal pada map
     *  I.S : my_zoo terdefinisi
     *  F.S : Animal pada map terdefinisi sesuai posisinya
     */
    void initAnimal() throws FileNotFoundException {
        int brs = 0;
        map = new char[500][500];
        str_temp = new String[500];
        try {
            FileInputStream fstream = new FileInputStream("MyZoo/animal.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String str_line;
            while ((str_line = br.readLine()) != null) {
                str_temp[brs] = str_line;
                for (int j = 0; j < str_line.length(); j++) {
                    map[brs][j] = str_line.charAt(j);
                }
                brs++;
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        int i, j, jneff;
        for (i = 0; i < map_brs; i++) {
            j = 0;
            jneff = 0;
            while (j < str_temp[i].length()) {
                switch (map[i][j]) {
                    case '-' :
                        jneff++;
                        break;
                    default:
                        my_zoo.createAnimal(map[i][j], i, jneff, getNAnimal());
                        jneff++;
                        break;
                }
                j++;
            }
        }
    }

    private int [][] maze_zoo;
    private boolean [][] maze_was_here;
    private boolean [][] maze_right_path;
    private int x_keluar;
    private int y_keluar;
    private int panjang;
    private int lebar;
    private Vector<Integer> vecx = new Vector<>();
    private Vector<Integer> vecy = new Vector<>();

    private boolean SolveMaze(int x, int y) {
      if (!maze_was_here[x][y] && maze_zoo[x][y] != 2) {
        vecx.addElement(x);
        vecy.addElement(y);
      }
      if (x == x_keluar && y == y_keluar) return true;
      if (maze_zoo[x][y] == 2 || maze_was_here[x][y]) return false;
      maze_was_here[x][y] = true;
      if (x != 0) {
        if (SolveMaze(x-1, y)) {
          maze_right_path[x][y] = true;
          return true;
        }
      }
      if (x != panjang - 1) {
        if (SolveMaze(x+1, y)) {
          maze_right_path[x][y] = true;
          return true;
        }
      }
      if (y != 0) {
        if (SolveMaze(x, y-1)) {
          maze_right_path[x][y] = true;
          return true;
        }
      }
      if (y != lebar - 1) {
        if (SolveMaze(x, y+1)) {
          maze_right_path[x][y] = true;
          return true;
        }
      }
      return false;
    }

    void TourZoo() {
        //x dan y adalah posisi awal "pengunjung"
        //asumsi pintu masuk dan keluar paling banyak ada 10
        int random, n_masuk = 0, masuk_x[], masuk_y[];
        int n_keluar = 0, keluar_x[], keluar_y[];
        masuk_x = new int[10];
        masuk_y = new int[10];
        keluar_x = new int[10];
        keluar_y = new int[10];

        panjang = my_zoo.getSizeBrs();
        lebar = my_zoo.getSizeKol();
        for (int i = 0; i < panjang ; i++) {
            for (int j = 0; j < lebar; j++) {
                //cari semua entrance dan exit yang ada
                if (i == 0 || i == panjang-1 || j == 0 || j == lebar-1) {
                    if (my_zoo.getCell()[i][j].render() == '=') {
                        masuk_x[n_masuk] = i;
                        masuk_y[n_masuk] = j;
                        n_masuk++;
                    }
                    if (my_zoo.getCell()[i][j].render() == '!') {
                        keluar_x[n_keluar] = i;
                        keluar_y[n_keluar] = j;
                        n_keluar++;
                    }
                }
            }
        }
        //random pintu masuk dan keluar
        Random rand = new Random();
        random = rand.nextInt(n_masuk);
        int x_masuk = masuk_x[random];
        int y_masuk = masuk_y[random];
        x_keluar = keluar_x[random];
        y_keluar = keluar_y[random];

        char cont;
        maze_zoo = new int [panjang][lebar];
        maze_was_here = new boolean[panjang][lebar];
        maze_right_path = new boolean[panjang][lebar];
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                cont = my_zoo.getCell()[i][j].render();
                if (cont == '+' || cont == '!' || cont == '=') {
                    maze_zoo[i][j] = 1;
                } else {
                    maze_zoo[i][j] = 2;
                }
                maze_was_here[i][j] = false;
                maze_right_path[i][j] = false;
            }
        }

        //tour sampai exit (pencarian jalur dengan dfs)
        boolean tour = SolveMaze(x_masuk, y_masuk);
        tour = !tour;

        int xx, yy, k, l, up, down, left, right;
        for (int i = 0; i < vecx.size(); i++) {
            System.out.println("\033[H\033[J");
            xx = vecx.elementAt(i);
            yy = vecy.elementAt(i);

            up = xx-1;
            down = xx+1;
            left = yy-1;
            right = yy+1;

            my_zoo.printZooAnimalCageTour(xx, yy);
            my_zoo.moveAnimal();

            boolean found = false, fup = false, fdown = false, fleft = false, fright = false;
            k = 0;
            while (k < my_zoo.getNumCage() && !found) {
                l = 0;
                while (l < my_zoo.getCage()[k].getSize() && !found) {
                    if (my_zoo.getCage()[k].getCell()[l].getX() == up && my_zoo.getCage()[k].getCell()[l].getY() == yy) { //look up
                        found = true;
                        fup = true;
                    } else if (my_zoo.getCage()[k].getCell()[l].getX() == down && my_zoo.getCage()[k].getCell()[l].getY() == yy) { //look down
                        found = true;
                        fdown = true;
                    } else if (my_zoo.getCage()[k].getCell()[l].getX() == xx && my_zoo.getCage()[k].getCell()[l].getY() == right) { //right
                        found = true;
                        fright = true;
                    } else if (my_zoo.getCage()[k].getCell()[l].getX() == xx && my_zoo.getCage()[k].getCell()[l].getY() == left) { //left
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
                for (int lop = 0; lop < 24; lop++) visited[lop] = false;
                if (fup) {
                    for (int a = 0; a < my_zoo.getCage()[k].getSize(); a++) {
                        for (int b = 0; b < Animal.getNAnimal(); b++) {
                            if (my_zoo.getCage()[k].getCell()[a].getX() == my_zoo.getAnimal()[b].getLocX() &&
                                    my_zoo.getCage()[k].getCell()[a].getY() == my_zoo.getAnimal()[b].getLocY()) {
                                cont = my_zoo.getAnimal()[b].getContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo.getAnimal()[b].getInfo();
                                    visited[cont-65] = true;
                                }
                            }
                        }
                    }
                }
                if (fdown) {
                    for (int a = 0; a < my_zoo.getCage()[k].getSize(); a++) {
                        for (int b = 0; b < Animal.getNAnimal(); b++) {
                            if (my_zoo.getCage()[k].getCell()[a].getX() == my_zoo.getAnimal()[b].getLocX() &&
                                    my_zoo.getCage()[k].getCell()[a].getY() == my_zoo.getAnimal()[b].getLocY()) {
                                cont = my_zoo.getAnimal()[b].getContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo.getAnimal()[b].getInfo();
                                    visited[cont-65] = true;
                                }
                            }
                        }
                    }
                }
                if (fright) {
                    for (int a = 0; a < my_zoo.getCage()[k].getSize(); a++) {
                        for (int b = 0; b < Animal.getNAnimal(); b++) {
                            if (my_zoo.getCage()[k].getCell()[a].getX() == my_zoo.getAnimal()[b].getLocX() &&
                                    my_zoo.getCage()[k].getCell()[a].getY() == my_zoo.getAnimal()[b].getLocY()) {
                                cont = my_zoo.getAnimal()[b].getContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo.getAnimal()[b].getInfo();
                                    visited[cont-65] = true;
                                }
                            }
                        }
                    }
                }
                if (fleft) {
                    for (int a = 0; a < my_zoo.getCage()[k].getSize(); a++) {
                        for (int b = 0; b < Animal.getNAnimal(); b++) {
                            if (my_zoo.getCage()[k].getCell()[a].getX() == my_zoo.getAnimal()[b].getLocX() &&
                                    my_zoo.getCage()[k].getCell()[a].getY() == my_zoo.getAnimal()[b].getLocY()) {
                                cont = my_zoo.getAnimal()[b].getContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo.getAnimal()[b].getInfo();
                                    visited[cont-65] = true;
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
