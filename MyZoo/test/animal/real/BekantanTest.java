package animal.real;

import animal.classification.Animal;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
public class BekantanTest {
  @Test
  public void getName() {
    System.out.println("getName");
    Animal b = new Bekantan(1, 2);
    assertTrue(Objects.equals("Bekantan", b.GetName()));
  }

  @Test
  public void getLocX() {
    System.out.println("getLocX");
    Animal b = new Bekantan(1, 2);
    assertTrue(1 == b.GetLocX());
  }

  @Test
  public void getLocY() {
    System.out.println("getLocY");
    Animal b = new Bekantan(1, 2);
    assertTrue(2 == b.GetLocY());
  }

  @Test
  public void getFodder() {
    System.out.println("getFodder");
    Animal b = new Bekantan(1, 2);
    assertTrue(0.25 * b.GetWeight() == b.GetFodder());
  }

  @Test
  public void getContent() {
    System.out.println("getContent");
    Animal b = new Bekantan(1, 2);
    assertTrue('A' == b.GetContent());
  }

  @Test
  public void getWeight() {
    System.out.println("getWeight");
    Animal b = new Bekantan(1, 2);
    assertTrue(50 == b.GetWeight());
  }

  @Test
  public void isTamed() {
    System.out.println("isTamed");
    Animal b = new Bekantan(1, 2);
    assertTrue(b.IsTamed());
  }

  @Test
  public void getLegs() {
    System.out.println("getLegs");
    Animal b = new Bekantan(1, 2);
    assertTrue(2 == b.GetLegs());
  }

  @Test
  public void interact() {
    System.out.println("interact");
    Animal b = new Bekantan(1, 2);
    assertTrue(Objects.equals("Uuuuuuu", b.Interact()));
  }

}