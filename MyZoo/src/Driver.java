import animal.Animal;
import building.Zoo;

import java.io.*;

import static animal.Animal.GetNAnimal;

/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

/**
 * @class Driver
 * @brief Menangani pembacaan dari file eksternal dan pembuatan map kebun binatang
 */
public class Driver {
    private int map_brs;
    private int map_kol;
    private int num_cage;
    private char map[][];
    private String str_temp[];
    private Zoo my_zoo;

    /**
     * @throws FileNotFoundException
     * @brief Constructor.
     * Membaca file eksternal dan menyimpan informasi jumlah baris dan kolom map
     */
    public Driver() throws FileNotFoundException {
        int brs = 0;
        map = new char[500][500];
        str_temp = new String[500];
        try {
            FileInputStream fstream = new FileInputStream("map.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String str_line;
            while ((str_line = br.readLine()) != null) {
                //System.out.println (str_line);
                str_temp[brs] = str_line;
                for (int j = 0; j < str_line.length(); j++) {
                    map[brs][j] = str_line.charAt(j);
                    System.out.print(map[brs][j]);
                }
                System.out.print("\n");
                brs++;
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
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
        //my_zoo = new Zoo(map_brs, map_kol, num_cage);
    }
    public static void main(String args[]) throws FileNotFoundException {
        Driver d = new Driver();
        System.out.println(d.GetMapBrs() + "\n" + d.map_kol + "\n" + d.num_cage);
        char digit1 = 48;
        digit1++;
        System.out.println(digit1);
    }
    /**
     * @return jumlah baris map.
     * @brief Mengembalikan jumlah baris yang menyusun map
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan jumlah baris map
     */
    public int GetMapBrs() {
        return map_brs;
    }
    /**
     * @return jumlah kolom map.
     * @brief Mengembalikan jumlah kolom yang menyusun map
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan jumlah kolom map
     */
    public int GetMapKol() {
        return map_kol;
    }
    /**
     * @return jumlah kandang map.
     * @brief Mengembalikan jumlah kandang pada map
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan jumlah kandang map
     */
    public int GetNumCage() {
        return num_cage;
    }
    /** @brief Getter untuk atribut my_zoo
     * I.S : Costructor driver telah dipanggil
     * F.S : Mendapakan object Zoo yang telah dihidupkan
     * @return Object my_zoo.
     */

    public Zoo GetZoo() {
        return my_zoo;
    }

    /** @brief Menginisiasi semua cell pada map
     *  I.S : my_zoo terdefinisi
     *  F.S : Cell pada my_zoo terbentuk
     */

    void InitCell() {
        int i, jneff;
        int j;
        for (i = 0; i < map_brs; i++) {
            j = 0;
            jneff = 0;
            while (j < str_temp[i].length()) {
                switch (map[i][j]) {
                    case '.' : {my_zoo.createCell('.', i, jneff); jneff++; break;}
                    case '+' : {my_zoo.createCell('+', i, jneff); jneff++; break;}
                    case '=' : {my_zoo.createCell('=', i, jneff); jneff++; break;}
                    case '!' : {my_zoo.createCell('!', i, jneff); jneff++; break;}
                    case '$' : {my_zoo.createCell('$', i, jneff); jneff++; break;}
                    case '#' : {my_zoo.createCell('#', i, jneff); jneff++; break;}
                    case '~' : {my_zoo.createCell('~', i, jneff); jneff++; break;}
                    case '*' : {my_zoo.createCell('*', i, jneff); jneff++; break;}
                }
                j++;
            }
        }
    }

    /** @brief Menginisiasi semua kandang pada map
     *  I.S : my_zoo terdefinisi
     *  F.S : semua kandang pada my_zoo telah diciptakan
     */
    void InitCage() {
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

    /** @brief Menginisiasi semua animal pada map
     *  I.S : my_zoo terdefinisi
     *  F.S : Animal pada map terdefinisi sesuai posisinya
     */
    void InitAnimal() throws FileNotFoundException {
        int brs = 0;
        map = new char[500][500];
        str_temp = new String[500];
        try {
            FileInputStream fstream = new FileInputStream("animal.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String str_line;
            while ((str_line = br.readLine()) != null) {
                str_temp[brs] = str_line;
                for (int j = 0; j < str_line.length(); j++) {
                    map[brs][j] = str_line.charAt(j);
                }
                brs++;
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        int i, jneff;
        int j;
        for (i = 0; i < map_brs; i++) {
            j = 0;
            jneff = 0;
            while (j < str_temp[i].length()) {
                switch (map[i][j]) {
                    case '-' : {jneff++; break;}
                    case 'A' : {my_zoo.createAnimal('A',i, jneff, GetNAnimal()); jneff++; break;}
                    case 'B' : {my_zoo.createAnimal('B', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'C' : {my_zoo.createAnimal('C',i, jneff, GetNAnimal()); jneff++; break;}
                    case 'D' : {my_zoo.createAnimal('D', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'E' : {my_zoo.createAnimal('E', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'F' : {my_zoo.createAnimal('F', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'G' : {my_zoo.createAnimal('G', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'H' : {my_zoo.createAnimal('H', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'I' : {my_zoo.createAnimal('I', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'J' : {my_zoo.createAnimal('J', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'K' : {my_zoo.createAnimal('K', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'L' : {my_zoo.createAnimal('L', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'M' : {my_zoo.createAnimal('M', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'N' : {my_zoo.createAnimal('N', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'O' : {my_zoo.createAnimal('O', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'P' : {my_zoo.createAnimal('P', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'Q' : {my_zoo.createAnimal('Q', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'R' : {my_zoo.createAnimal('R', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'S' : {my_zoo.createAnimal('S', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'T' : {my_zoo.createAnimal('T', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'U' : {my_zoo.createAnimal('U', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'V' : {my_zoo.createAnimal('V', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'W' : {my_zoo.createAnimal('W', i, jneff, GetNAnimal()); jneff++; break;}
                    case 'X' : {my_zoo.createAnimal('X', i, jneff, GetNAnimal()); jneff++; break;}
                }
                j++;
            }
        }
    }

int** maze_zoo;
bool** maze_was_here;
bool** maze_right_path;
int x_masuk, x_keluar, y_masuk, y_keluar, panjang, lebar;
vector<int> vecx;
vector<int> vecy;

bool SolveMaze(int x, int y) {
  if (!maze_was_here[x][y] && maze_zoo[x][y] != 2) {
    vecx.push_back(x);
    vecy.push_back(y);
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
  return 0;
}

    /** @brief Melakukan Tour pada Zoo
     *  I.S : my_zoo telah terdefinisi beserta cell dan semua cagenya
     *  F.S :
     */

    void TourZoo() {
        //x dan y adalah posisi awal "pengunjung"
        //asumsi pintu masuk dan keluar paling banyak ada 10
        int random, n_masuk = 0, masuk_x[10], masuk_y[10];
        int n_keluar = 0, keluar_x[10], keluar_y[10];
        panjang = my_zoo->GetSizeBrs();
        lebar = my_zoo->GetSizeKol();
        rep(i, panjang) {
            rep(j, lebar) {
                //cari semua entrance dan exit yang ada
                if (i == 0 || i == panjang-1 || j == 0 || j == lebar-1) {
                    if (my_zoo->GetCell()[i][j]->Render() == '=') {
                        masuk_x[n_masuk] = i;
                        masuk_y[n_masuk] = j;
                        n_masuk++;
                    }
                    if (my_zoo->GetCell()[i][j]->Render() == '!') {
                        keluar_x[n_keluar] = i;
                        keluar_y[n_keluar] = j;
                        n_keluar++;
                    }
                }
            }
        }
        //random pintu masuk dan keluar
        srand(time(NULL));
        random = rand() % n_masuk;
        x_masuk = masuk_x[random];
        y_masuk = masuk_y[random];
        x_keluar = keluar_x[random];
        y_keluar = keluar_y[random];

        char cont;
        maze_zoo = new int*[panjang];
        maze_was_here = new bool*[panjang];
        maze_right_path = new bool*[panjang];
        rep(i, panjang) {
            maze_zoo[i] = new int[lebar];
            maze_was_here[i] = new bool[lebar];
            maze_right_path[i] = new bool[lebar];
            rep(j, lebar) {
                cont = my_zoo->GetCell()[i][j]->Render();
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
        bool tour = SolveMaze(x_masuk, y_masuk);
        tour = !tour;

        int xx, yy, k, l, up, down, left, right;
        rep(i, (int) vecx.size()) {
            clear();
            xx = vecx.at(i);
            yy = vecy.at(i);

            up = xx-1;
            down = xx+1;
            left = yy-1;
            right = yy+1;

            my_zoo->PrintZooAnimalCageTour(xx, yy);
            my_zoo->MoveAnimal();

            bool found = false, fup = false, fdown = false, fleft = false, fright = false;
            k = 0;
            while (k < my_zoo->GetSizeCage() && !found) {
                l = 0;
                while (l < my_zoo->l_cage[k]->GetSize() && !found) {
                    if (my_zoo->l_cage[k]->GetCellCage(l)->GetX() == up && my_zoo->l_cage[k]->GetCellCage(l)->GetY() == yy) { //look up
                        found = true;
                        fup = true;
                    } else if (my_zoo->l_cage[k]->GetCellCage(l)->GetX() == down && my_zoo->l_cage[k]->GetCellCage(l)->GetY() == yy) { //look down
                        found = true;
                        fdown = true;
                    } else if (my_zoo->l_cage[k]->GetCellCage(l)->GetX() == xx && my_zoo->l_cage[k]->GetCellCage(l)->GetY() == right) { //right
                        found = true;
                        fright = true;
                    } else if (my_zoo->l_cage[k]->GetCellCage(l)->GetX() == xx && my_zoo->l_cage[k]->GetCellCage(l)->GetY() == left) { //left
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
                bool visited[24];
                rep(lop, 24) visited[lop] = false;
                char cont;
                if (fup) {
                    rep(a, my_zoo->l_cage[k]->GetSize()) {
                        rep(b, Animal::GetNAnimal()) {
                            if (my_zoo->l_cage[k]->GetCellCage(a)->GetX() == my_zoo->GetAnimal()[b]->GetLocX() &&
                                    my_zoo->l_cage[k]->GetCellCage(a)->GetY() == my_zoo->GetAnimal()[b]->GetLocY()) {
                                cont = my_zoo->GetAnimal()[b]->GetContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo->GetAnimal()[b]->GetInfo();
                                    visited[cont-65] = 1;
                                }
                            }
                        }
                    }
                }
                if (fdown) {
                    rep(a, my_zoo->l_cage[k]->GetSize()) {
                        rep(b, Animal::GetNAnimal()) {
                            if (my_zoo->l_cage[k]->GetCellCage(a)->GetX() == my_zoo->GetAnimal()[b]->GetLocX() &&
                                    my_zoo->l_cage[k]->GetCellCage(a)->GetY() == my_zoo->GetAnimal()[b]->GetLocY()) {
                                cont = my_zoo->GetAnimal()[b]->GetContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo->GetAnimal()[b]->GetInfo();
                                    visited[cont-65] = 1;
                                }
                            }
                        }
                    }
                }
                if (fright) {
                    rep(a, my_zoo->l_cage[k]->GetSize()) {
                        rep(b, Animal::GetNAnimal()) {
                            if (my_zoo->l_cage[k]->GetCellCage(a)->GetX() == my_zoo->GetAnimal()[b]->GetLocX() &&
                                    my_zoo->l_cage[k]->GetCellCage(a)->GetY() == my_zoo->GetAnimal()[b]->GetLocY()) {
                                cont = my_zoo->GetAnimal()[b]->GetContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo->GetAnimal()[b]->GetInfo();
                                    visited[cont-65] = 1;
                                }
                            }
                        }
                    }
                }
                if (fleft) {
                    rep(a, my_zoo->l_cage[k]->GetSize()) {
                        rep(b, Animal::GetNAnimal()) {
                            if (my_zoo->l_cage[k]->GetCellCage(a)->GetX() == my_zoo->GetAnimal()[b]->GetLocX() &&
                                    my_zoo->l_cage[k]->GetCellCage(a)->GetY() == my_zoo->GetAnimal()[b]->GetLocY()) {
                                cont = my_zoo->GetAnimal()[b]->GetContent();
                                if (visited[cont-65]) {
                                    // sudah
                                } else {
                                    my_zoo->GetAnimal()[b]->GetInfo();
                                    visited[cont-65] = 1;
                                }
                            }
                        }
                    }
                }
            }
            cout << "Enter to cont.."; cin.ignore();
        }
    }
}
