package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by akmalfadlurohman on 3/28/17.
 */
class IkanTerbangTest {
    @Test
    public void getLocX() {
        System.out.println("Test GetLocX");
        Animal A = new IkanTerbang(2,5);
        assertTrue(A.GetLocX() == 2);
    }

    @Test
    public void getLocY() {
        System.out.println("Test GetLocY");
        Animal A = new IkanTerbang(2,5);
        assertTrue(A.GetLocY() == 5);
    }

    @Test
    public void getFodder() {
        System.out.println("Test GetFodder");
        Animal A = new IkanTerbang(2,5);
        assertTrue(A.GetFodder() == (0.025*A.GetWeight()));
    }

    @Test
    public void getContent() {
        System.out.println("Test GetContent");
        Animal A = new IkanTerbang(2,5);
        assertTrue(A.GetContent() == 'I');
    }

    @Test
    public void getWeight()  {
        System.out.println("Test GetWeight");
        animal.Animal A = new IkanTerbang(2,5);
        assertTrue(A.GetWeight() == 2);
    }

    @Test
    public void isTamed()  {
        System.out.println("Test isTamed");
        animal.Animal A = new IkanTerbang(2,5);
        assertTrue(A.IsTamed());
    }
    @Test
    public void getLegs() {
        System.out.println("Test GetLegs");
        animal.Animal A = new IkanTerbang(2,5);
        assertTrue(A.GetLegs() == 0);
    }

    @Test
    public void interact() {
        System.out.println("Test interact");
        animal.Animal A = new IkanTerbang(2,5);
        assertTrue(A.Interact().equals("Cepok cepok cepok"));
    }
}