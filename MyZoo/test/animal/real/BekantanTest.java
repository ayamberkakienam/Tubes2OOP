package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
class BekantanTest {
  @Test
  void getName() {
    System.out.println("Test Name..");
    Animal b = new Bekantan(1, 2);
    assertTrue(Objects.equals("Bekantan", b.GetName()));
  }

  @Test
  void getLocX() {
    System.out.println("Test X Position..");
    Animal b = new Bekantan(1, 2);
    assertTrue(1 == b.GetLocX());
  }

  @Test
  void getLocY() {
    System.out.println("Test Y Position..");
    Animal b = new Bekantan(1, 2);
    assertTrue(2 == b.GetLocY());
  }

  @Test
  void getFodder() {
    System.out.println("getFodder");
    Animal b = new Bekantan(1, 2);
    assertTrue(0.025 * b.GetWeight() == b.GetFodder());
  }

  @Test
  void getContent() {
    System.out.println("Test Content..");
    Animal b = new Bekantan(1, 2);
    assertTrue('A' == b.GetContent());
  }

  @Test
  void getWeight() {
    System.out.println("Test Weight..");
    Animal b = new Bekantan(1, 2);
    assertTrue(50 == b.GetWeight());
  }

  @Test
  void isTamed() {
    System.out.println("Test Tamed..");
    Animal b = new Bekantan(1, 2);
    assertTrue(b.IsTamed());
  }

  @Test
  void getLegs() {
    System.out.println("Test Legs..");
    Animal b = new Bekantan(1, 2);
    assertTrue(2 == b.GetLegs());
  }

  @Test
  void interact() {
    System.out.println("Test Interact..");
    Animal b = new Bekantan(1, 2);
    assertTrue(Objects.equals("Uuuuuuu", b.Interact()));
  }
}