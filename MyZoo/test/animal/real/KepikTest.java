package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by akmalfadlurohman on 3/28/17.
 */
class KepikTest {
    @Test
    public void getLocX() {
        System.out.println("Test getLocX");
        Animal A = new Kepik(2,5);
        assertTrue(A.getLocX() == 2);
    }

    @Test
    public void getLocY() {
        System.out.println("Test getLocY");
        Animal A = new Kepik(2,5);
        assertTrue(A.getLocY() == 5);
    }

    @Test
    public void getFodder() {
        System.out.println("Test getFodder");
        Animal A = new Kepik(2,5);
        assertTrue(A.getFodder() == (0.025*A.getWeight()));
    }

    @Test
    public void getContent() {
        System.out.println("Test getContent");
        Animal A = new Kepik(2,5);
        assertTrue(A.getContent() == 'L');
    }

    @Test
    public void getWeight()  {
        System.out.println("Test getWeight");
        Animal A = new Kepik(2,5);
        assertTrue(A.getWeight() == (float)0.01);
    }

    @Test
    public void isTamed()  {
        System.out.println("Test isTamed");
        Animal A = new Kepik(2,5);
        assertTrue(A.IsTamed());
    }
    @Test
    public void getLegs() {
        System.out.println("Test getLegs");
        Animal A = new Kepik(2,5);
        assertTrue(A.getLegs() == 6);
    }

    @Test
    public void interact() {
        System.out.println("Test interact");
        Animal A = new Kepik(2,5);
        assertTrue(A.Interact().equals("Krik krik krik"));
    }
}