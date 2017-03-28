package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
class MacanTutulTest {
  @Test
  public void getName() {
    System.out.println("Test Name..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(Objects.equals("Macan Tutul", b.getName()));
  }

  @Test
  public void getLocX() {
    System.out.println("Test X Position..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(1 == b.getLocX());
  }

  @Test
  public void getLocY() {
    System.out.println("Test Y Position..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(2 == b.getLocY());
  }

  @Test
  public void getFodder() {
    System.out.println("getFodder");
    Animal b = new MacanTutul(1, 2);
    assertTrue(0.025 * b.getWeight() == b.getFodder());
  }

  @Test
  public void getContent() {
    System.out.println("Test Content..");
    Animal b = new MacanTutul(1, 2);
    assertTrue('R' == b.getContent());
  }

  @Test
  public void getWeight() {
    System.out.println("Test Weight..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(350 == b.getWeight());
  }

  @Test
  public void isTamed() {
    System.out.println("Test Tamed..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(b.isTamed());
  }

  @Test
  public void getLegs() {
    System.out.println("Test Legs..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(4 == b.getLegs());
  }

  @Test
  public void interact() {
    System.out.println("Test interact..");
    Animal b = new MacanTutul(1, 2);
    assertTrue(Objects.equals("Aummmm", b.interact()));
  }
}