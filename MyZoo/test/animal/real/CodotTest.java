package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodotTest {
    @Test
    public void getLocX() {
        System.out.println("Test getLocX");
        Animal A = new Codot(2,5);
        assertTrue(A.getLocX() == 2);
    }

    @Test
    public void getLocY() {
        System.out.println("Test getLocY");
        Animal A = new Codot(2,5);
        assertTrue(A.getLocY() == 5);
    }

    @Test
    public void getFodder() {
        System.out.println("Test getFodder");
        Animal A = new Codot(2,5);
        assertTrue(A.getFodder() == (0.025*A.getWeight()));
    }

    @Test
    public void getContent() {
        System.out.println("Test getContent");
        Animal A = new Codot(2,5);
        assertTrue(A.getContent() == 'C');
    }

    @Test
    public void getWeight()  {
        System.out.println("Test getWeight");
        Animal A = new Codot(2,5);
        assertTrue(A.getWeight() == 0.5);
    }

    @Test
    public void isTamed()  {
        System.out.println("Test isTamed");
        Animal A = new Codot(2,5);
        assertTrue(!A.IsTamed());
    }
    @Test
    public void getLegs() {
        System.out.println("Test getLegs");
        Animal A = new Codot(2,5);
        assertTrue(A.getLegs() == 2);
    }

    @Test
    public void interact() {
        System.out.println("Test interact");
        Animal A = new Codot(2,5);
        assertTrue(A.interact().equals("Cit cit cit"));
    }

}