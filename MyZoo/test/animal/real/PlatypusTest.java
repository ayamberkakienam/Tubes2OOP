import org.junit.Test;
import animal.Animal;
import animal.real.Platypus;
import static org.junit.Assert.*;

/**
 * Created by akmalfadlurohman on 3/28/17.
 */
class PlatypusTest {
    @Test
    public void getLocX() {
        System.out.println("Test GetLocX");
        Animal A = new Platypus(2,5);
        assertTrue(A.GetLocX() == 2);
    }

    @Test
    public void getLocY() {
        System.out.println("Test GetLocY");
        Animal A = new Platypus(2,5);
        assertTrue(A.GetLocY() == 5);
    }

    @Test
    public void getFodder() {
        System.out.println("Test GetFodder");
        Animal A = new Platypus(2,5);
        assertTrue(A.GetFodder() == (0.025*A.GetWeight()));
    }

    @Test
    public void getContent() {
        System.out.println("Test GetContent");
        Animal A = new Platypus(2,5);
        assertTrue(A.GetContent() == 'Z');
    }

    @Test
    public void getWeight()  {
        System.out.println("Test GetWeight");
        Animal A = new Platypus(2,5);
        assertTrue(A.GetWeight() == 5);
    }

    @Test
    public void isTamed()  {
        System.out.println("Test isTamed");
        Animal A = new Platypus(2,5);
        assertTrue(A.IsTamed());
    }
    @Test
    public void getLegs() {
        System.out.println("Test GetLegs");
        Animal A = new Platypus(2,5);
        assertTrue(A.GetLegs() == 4);
    }

    @Test
    public void interact() {
        System.out.println("Test interact");
        Animal A = new Platypus(2,5);
        assertTrue(A.Interact().equals("Krr krr"));
    }
}