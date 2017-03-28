package building.habitat.real;

import building.habitat.Habitat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/29/17.
 */
class WaterHabitatTest {
  @Test
  void getContent() {
    Habitat A = new WaterHabitat(1, 2);
    assertTrue(A.getContent() == '~');
  }

  @Test
  void getX() {
    Habitat A = new WaterHabitat(1, 2);
    assertTrue(A.getX() == 1);
  }

  @Test
  void getY() {
    Habitat A = new WaterHabitat(1, 2);
    assertTrue(A.getY() == 2);
  }

  @Test
  void isCaged() {
    Habitat A = new WaterHabitat(1, 2);
    assertTrue(!A.isCaged());
  }

  @Test
  void render() {
    Habitat A = new WaterHabitat(1, 2);
    assertTrue(A.render() == '~');
  }
}