package building;

import building.habitat.real.AirHabitat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/29/17.
 */
class CageTest {
  @Test
  void getSize() {
    Cage A = new Cage();
    assertTrue(A.getSize() == 0);
  }

  @Test
  void getCell() {
    Cage A = new Cage();
    Cell[] cell;
    A.arrCell[2] = new AirHabitat(2, 3);
    cell = A.getCell();
    assertTrue(cell[2].getX() == 2 && cell[2].getY() == 3);
  }

  @Test
  void incSize() {
    Cage A = new Cage();
    int initSize = A.getSize();
    A.incSize();
    assertTrue(A.getSize() - initSize == 1);
  }

  @Test
  void decSize() {
    Cage A = new Cage();
    int initSize = A.getSize();
    A.decSize();
    assertTrue(initSize - A.getSize() == 1);
  }
}