package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**PausSpermaTest
 *  Kelas untuk mengetes kelas PausSperma
 */
class PausSpermaTest {
    @Test
    public void getName() {
        System.out.println("Test Name..");
        Animal H = new PausSperma(5, 4);
        assertTrue(H.getName().equals("Paus Sperma"));
    }

    @Test
    void getLocX() {
        System.out.println("Test X Position..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.getLocX()==5);
    }

    @Test
    void getLocY() {
        System.out.println("Test Y Position..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.getLocY()==4);
    }

    @Test
    void getFodder() {
        System.out.println("Test Fodder..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.getFodder()==0.025*H.getWeight());
    }

    @Test
    void getContent() {
        System.out.println("Test Content..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.getContent()=='T');
    }

    @Test
    void getWeight() {
        System.out.println("Test Weight..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.getWeight()==7000);
    }

    @Test
    void isTamed() {
        System.out.println("Test Tamed..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.isTamed());
    }

    @Test
    void getLegs() {
        System.out.println("Test Legs..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.getLegs()==0);
    }

    @Test
    void interact() {
        System.out.println("Test interact..");
        Animal H = new PausSperma(5,4);
        assertTrue(H.interact().equals("Srosh srosh"));
    }

}