package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by akmalfadlurohman on 3/28/17.
 */
class BurungHantuTest {
    @Test
    public void getLocX() {
        System.out.println("Test getLocX");
        Animal A = new BurungHantu(2,5);
        assertTrue(A.getLocX() == 2);
    }

    @Test
    public void getLocY() {
        System.out.println("Test getLocY");
        Animal A = new BurungHantu(2,5);
        assertTrue(A.getLocY() == 5);
    }

    @Test
    public void getFodder() {
        System.out.println("Test getFodder");
        Animal A = new BurungHantu(2,5);
        assertTrue(A.getFodder() == (0.025*A.getWeight()));
    }

    @Test
    public void getContent() {
        System.out.println("Test getContent");
        Animal A = new BurungHantu(2,5);
        assertTrue(A.getContent() == 'B');
    }

    @Test
    public void getWeight()  {
        System.out.println("Test getWeight");
        animal.Animal A = new animal.real.BurungHantu(2,5);
        assertTrue(A.getWeight() == 2);
    }

    @Test
    public void isTamed()  {
        System.out.println("Test isTamed");
        animal.Animal A = new animal.real.BurungHantu(2,5);
        assertTrue(A.IsTamed());
    }
    @Test
    public void getLegs() {
        System.out.println("Test getLegs");
        animal.Animal A = new animal.real.BurungHantu(2,5);
        assertTrue(A.getLegs() == 2);
    }

    @Test
    public void interact() {
        System.out.println("Test interact");
        animal.Animal A = new animal.real.BurungHantu(2,5);
        assertTrue(A.interact().equals("Kur kur kur"));
    }

}