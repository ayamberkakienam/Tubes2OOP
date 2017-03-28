package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by akmalfadlurohman on 3/28/17.
 */
class PlatypusTest {
    @Test
    void getLocX() {
        System.out.println("Test getLocX");
        Animal A = new Platypus(2,5);
        assertTrue(A.getLocX() == 2);
    }

    @Test
    void getLocY() {
        System.out.println("Test getLocY");
        Animal A = new Platypus(2,5);
        assertTrue(A.getLocY() == 5);
    }

    @Test
    void getFodder() {
        System.out.println("Test getFodder");
        Animal A = new Platypus(2,5);
        assertTrue(A.getFodder() == (0.025*A.getWeight()));
    }

    @Test
    void getContent() {
        System.out.println("Test getContent");
        Animal A = new Platypus(2,5);
        assertTrue(A.getContent() == 'V');
    }

    @Test
    void getWeight()  {
        System.out.println("Test getWeight");
        Animal A = new Platypus(2,5);
        assertTrue(A.getWeight() == 5);
    }

    @Test
    void isTamed()  {
        System.out.println("Test isTamed");
        Animal A = new Platypus(2,5);
        assertTrue(A.isTamed());
    }
    @Test
    void getLegs() {
        System.out.println("Test getLegs");
        Animal A = new Platypus(2,5);
        assertTrue(A.getLegs() == 4);
    }

    @Test
    void interact() {
        System.out.println("Test interact");
        Animal A = new Platypus(2,5);
        assertTrue(A.interact().equals("Krr krr"));
    }
}