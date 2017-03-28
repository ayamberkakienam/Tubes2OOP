package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
class OwaOwaTest {
  @Test
  public void getName() {
    System.out.println("Test Name..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(Objects.equals("OwaOwa", b.getName()));
  }

  @Test
  public void getLocX() {
    System.out.println("Test X Position..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(1 == b.getLocX());
  }

  @Test
  public void getLocY() {
    System.out.println("Test Y Position..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(2 == b.getLocY());
  }

  @Test
  public void getFodder() {
    System.out.println("getFodder");
    Animal b = new OwaOwa(1, 2);
    assertTrue(0.025 * b.getWeight() == b.getFodder());
  }

  @Test
  public void getContent() {
    System.out.println("Test Content..");
    Animal b = new OwaOwa(1, 2);
    assertTrue('S' == b.getContent());
  }

  @Test
  public void getWeight() {
    System.out.println("Test Weight..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(70 == b.getWeight());
  }

  @Test
  public void isTamed() {
    System.out.println("Test Tamed..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(b.IsTamed());
  }

  @Test
  public void getLegs() {
    System.out.println("Test Legs..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(2 == b.getLegs());
  }

  @Test
  public void interact() {
    System.out.println("Test interact..");
    Animal b = new OwaOwa(1, 2);
    assertTrue(Objects.equals("Huhuhuhu", b.interact()));
  }
}