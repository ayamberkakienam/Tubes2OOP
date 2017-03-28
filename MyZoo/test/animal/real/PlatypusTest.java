package animal.real;

<<<<<<< HEAD
import org.junit.Test;
=======
>>>>>>> 561517193c2df4541b91bc541d8b74cbb14f401d
import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by akmalfadlurohman on 3/28/17.
 */
class PlatypusTest {
    @Test
    public void getLocX() {
        System.out.println("Test getLocX");
        Animal A = new Platypus(2,5);
        assertTrue(A.getLocX() == 2);
    }

    @Test
    public void getLocY() {
        System.out.println("Test getLocY");
        Animal A = new Platypus(2,5);
        assertTrue(A.getLocY() == 5);
    }

    @Test
    public void getFodder() {
        System.out.println("Test getFodder");
        Animal A = new Platypus(2,5);
        assertTrue(A.getFodder() == (0.025*A.getWeight()));
    }

    @Test
    public void getContent() {
        System.out.println("Test getContent");
        Animal A = new Platypus(2,5);
        assertTrue(A.getContent() == 'Z');
    }

    @Test
    public void getWeight()  {
        System.out.println("Test getWeight");
        Animal A = new Platypus(2,5);
        assertTrue(A.getWeight() == 5);
    }

    @Test
    public void isTamed()  {
        System.out.println("Test isTamed");
        Animal A = new Platypus(2,5);
        assertTrue(A.IsTamed());
    }
    @Test
    public void getLegs() {
        System.out.println("Test getLegs");
        Animal A = new Platypus(2,5);
        assertTrue(A.getLegs() == 4);
    }

    @Test
    public void interact() {
        System.out.println("Test interact");
        Animal A = new Platypus(2,5);
        assertTrue(A.Interact().equals("Krr krr"));
    }
}