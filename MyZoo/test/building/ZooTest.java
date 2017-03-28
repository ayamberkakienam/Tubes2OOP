package building;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/29/17.
 */
class ZooTest {
  @Test
  void getSizeBrs() {
    Zoo Z = new Zoo(4, 4, 2);
    assertTrue(Z.getSizeBrs() == 4);
  }

  @Test
  void getSizeKol() {
    Zoo Z = new Zoo(4, 5, 2);
    assertTrue(Z.getSizeKol() == 5);
  }

  @Test
  void getNumCage() {
    Zoo Z = new Zoo(4, 4, 2);
    assertTrue(Z.getNumCage() == 2);
  }

  @Test
  void getCell() {
    Zoo Z = new Zoo(4, 4, 2);
    Z.createCell('.', 0, 0);
    Cell[][] C = Z.getCell();
    assertTrue(C[0][0].getContent() == '.');
  }

  @Test
  void getCage() {
    Zoo Z = new Zoo(4, 4, 2);
    Z.createCell('*', 0, 0);
    Z.createCage(0);
    Z.setCellCage(0, 0, 0, 0);
    Cage[] C = Z.getCage();
    assertTrue(C[0].arrCell[0].getContent() == '*');
  }
}