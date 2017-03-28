package building;

import animal.Animal;
import animal.real.*;
import building.facility.*;
import building.habitat.real.*;

import java.util.Random;

/**
 * Created by um-13515026
 * on 28/03/17.
 */
public class Zoo {

    protected int size_brs;
    protected int size_kol;
    protected int size_cage;
    protected Cell[][] m_cell;
    protected Cage[] l_cage;
    protected Animal[] l_animal;

    public Zoo(int size_brs, int size_kol, int size_cage) {
        this.size_brs = size_brs;
        this.size_kol = size_kol;
        this.size_cage = size_cage;

        m_cell = new Cell[size_brs][size_kol];
        l_cage = new Cage[size_cage];
        l_animal = new Animal[300];

    }

    public int getSizeBrs() {
        return size_brs;
    }

    public int getSizeKol() {
        return size_kol;
    }

    public int getSizeCage() {
        return size_cage;
    }

    public Cell [][] getCell() {
        return m_cell;
    }

    public Cage [] getCage() {
        return l_cage;
    }

    public Animal [] getAnimal() {
        return l_animal;
    }

    public void moveAnimal() {
        int x, y, move, j;
        boolean moved = false;
        boolean dist = true;
        for (int i = 0; i < Animal.GetNAnimal(); i++) {
            do {
                Random rand = new Random();
                move = rand.nextInt(5) + 1;
                x = l_animal[i].GetLocX();
                y = l_animal[i].GetLocY();
                switch (move) {
                    // CHECK CELL APAKAH CAGED
                    case 1:
                        x--;
                        l_animal[i].SetLoc(x, y);
                        moved = true;
                        j = 0;
                        while (j < Animal.GetNAnimal() && dist) {
                            if (i != j) {
                                dist = l_animal[i].DistLoc(l_animal[j]);
                            }
                            j++;
                        }
                        if (!(m_cell[x][y].isCaged()) || !dist) {
                            x++;
                            l_animal[i].SetLoc(x, y);
                            moved = false;
                        }
                        break;
                    case 2:
                        y++;
                        l_animal[i].SetLoc(x, y);
                        moved = true;
                        j = 0;
                        while (j < Animal.GetNAnimal() && dist) {
                            if (i != j) {
                                dist = l_animal[i].DistLoc(l_animal[j]);
                            }
                            j++;
                        }
                        if (!(m_cell[x][y].isCaged()) || !dist) {
                            y--;
                            l_animal[i].SetLoc(x, y);
                            moved = false;
                        }
                        break;
                    case 3:
                        x++;
                        l_animal[i].SetLoc(x, y);
                        moved = true;
                        j = 0;
                        while (j < Animal.GetNAnimal() && dist) {
                            if (i != j) {
                                dist = l_animal[i].DistLoc(l_animal[j]);
                            }
                            j++;
                        }
                        if (!(m_cell[x][y].isCaged()) || !dist) {
                            x--;
                            l_animal[i].SetLoc(x, y);
                            moved = false;
                        }
                        break;
                    case 4:
                        y--;
                        l_animal[i].SetLoc(x, y);
                        moved = true;
                        j = 0;
                        while (j < Animal.GetNAnimal() && dist) {
                            if (i != j) {
                                dist = l_animal[i].DistLoc(l_animal[j]);
                            }
                            j++;
                        }
                        if (!(m_cell[x][y].isCaged()) || !dist) {
                            y++;
                            l_animal[i].SetLoc(x, y);
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

    public void setCellCage(int n, int nn, int i, int j) {
        if (m_cell[i][j].render() == '*') {
            l_cage[n].getCell()[nn] = new AirHabitat(i, j);
        } else if (m_cell[i][j].render() == '#') {
            l_cage[n].getCell()[nn] = new LandHabitat(i, j);
        } else if (m_cell[i][j].render() == '~') {
            l_cage[n].getCell()[nn] = new WaterHabitat(i, j);
        }
        l_cage[n].getCell()[nn].setCaged();
        l_cage[n].incSize();
    }

    public void createCage(int n) {
        l_cage[n] = new Cage();
    }

    public void createCell(char c, int i, int j) {
        switch (c) {
            case '*':
                m_cell[i][j] = new AirHabitat(i, j);
                break;
            case '#':
                m_cell[i][j] = new LandHabitat(i, j);
                break;
            case '~':
                m_cell[i][j] = new WaterHabitat(i, j);
                break;
            case '+':
                m_cell[i][j] = new Road(i, j);
                break;
            case '=':
                m_cell[i][j] = new RoadEntrance(i, j);
                break;
            case '!':
                m_cell[i][j] = new RoadExit(i, j);
                break;
            case '.':
                m_cell[i][j] = new Park(i, j);
                break;
            case '$':
                m_cell[i][j] = new Restaurant(i, j);
                break;
        }
    }

    public void crateAnimal(char c, int i, int j, int n) {
        if (m_cell[i][j].render() == '#') {
            if (m_cell[i][j].isCaged()) {
                int k = 0;
                boolean found = false;
                while (k < getSizeCage() && !found) {
                    int l = 0;
                    while (l < l_cage[k].getSize() && !found) {
                        if (l_cage[k].getCell()[l].getX() == i && l_cage[k].getCell()[l].getY() == j) {
                            found = true;
                        } else {
                            l++;
                        }
                    }
                    k++;
                }
                k--;
                int area = l_cage[k].getSize();
                int max_n_animal =  area*3/10;
                int n_animal = 0;
                for (int ii = 0; ii < Animal.GetNAnimal(); ii++) {
                    for (int jj = 0; jj < l_cage[k].getSize(); jj++) {
                        if (l_cage[k].getCell()[jj].getX() == l_animal[ii].GetLocX() &&
                                l_cage[k].getCell()[jj].getY() == l_animal[ii].GetLocY()) {
                            n_animal++;
                        }
                    }
                }
                if (n_animal < max_n_animal) {
                    switch (c) {
                        case 'A':
                            l_animal[n] = new Bekantan(i, j);
                            break;
                        case 'B':
                            l_animal[n] = new BurungHantu(i, j);
                            break;
                        case 'C':
                            l_animal[n] = new Codot(i, j);
                            break;
                        case 'D':
                            l_animal[n] = new Elang(i, j);
                            break;
                        case 'E':
                            l_animal[n] = new Gajah(i, j);
                            break;
                        case 'F':
                            l_animal[n] = new Gorilla(i, j);
                            break;
                        case 'G':
                            l_animal[n] = new Harimau(i, j);
                            break;
                        case 'H':
                            l_animal[n] = new Hiu(i, j);
                            break;
                        case 'I':
                            l_animal[n] = new IkanTerbang(i, j);
                            break;
                        case 'J':
                            l_animal[n] = new Jerapah(i, j);
                            break;
                        case 'K':
                            l_animal[n] = new Kancil(i, j);
                            break;
                        case 'L':
                            l_animal[n] = new Kepik(i, j);
                            break;
                        case 'M':
                            l_animal[n] = new Kepiting(i, j);
                            break;
                        case 'N':
                            l_animal[n] = new KumbangHutan(i, j);
                            break;
                        case 'O':
                            l_animal[n] = new KupuKupu(i, j);
                            break;
                        case 'P':
                            l_animal[n] = new Lobster(i, j);
                            break;
                        case 'Q':
                            l_animal[n] = new LumbaLumba(i, j);
                            break;
                        case 'R':
                            l_animal[n] = new MacanTutul(i, j);
                            break;
                        case 'S':
                            l_animal[n] = new OwaOwa(i, j);
                            break;
                        case 'T':
                            l_animal[n] = new PausSperma(i, j);
                            break;
                        case 'U':
                            l_animal[n] = new Piranha(i, j);
                            break;
                        case 'V':
                            l_animal[n] = new Platypus(i, j);
                            break;
                        case 'W':
                            l_animal[n] = new Singa(i, j);
                            break;
                        case 'X':
                            l_animal[n] = new SingaLaut(i, j);
                            break;
                    }
                }
            }
        }
    }

    public void PrintZoo() {
        for (int i = 0; i < size_brs; i++) {
            for (int j = 0; j < size_kol; j++) {
                System.out.print(m_cell[i][j].render());
            }
            System.out.println("");
        }
    }
}
