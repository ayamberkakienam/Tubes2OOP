package building.facility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/29/17.
 */
class ParkTest {
  @Test
  void getContent() {
    Facility A = new Park(1, 2);
    assertTrue(A.getContent() == '.');
  }

  @Test
  void getX() {
    Facility A = new Park(1, 2);
    assertTrue(A.getX() == 1);
  }

  @Test
  void getY() {
    Facility A = new Park(1, 2);
    assertTrue(A.getY() == 2);
  }

  @Test
  void isCaged() {
    Facility A = new Park(1, 2);
    assertTrue(!A.isCaged());
  }

  @Test
  void render() {
    Facility A = new Park(1, 2);
    assertTrue(A.render() == '.');
  }
}