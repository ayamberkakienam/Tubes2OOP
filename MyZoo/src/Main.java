import animal.Animal;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by um on 28/03/17.
 */
public class Main {


    static public void main (String [] args) throws FileNotFoundException {
        Driver d = new Driver();
        Scanner scan = new Scanner(System.in);

        System.out.println("Initialisation Cell..");
        d.initCell();
        d.getZoo().printZoo();

        System.out.println("Press \"ENTER\" to continue...");
        scan.nextLine();

        for (int i = 0; i < d.getNumCage(); i++) {
            d.getZoo().createCage(i);
        }
        System.out.println("Initialisation Cage..");
        System.out.println("\033[H\033[J");
        d.initCage();
        d.getZoo().printZooCage();

        System.out.println("Press \"ENTER\" to continue...");
        scan.nextLine();

        d.initAnimal();
        System.out.println("\033[H\033[J");
        System.out.println("Initialisation Animal..");
        d.getZoo().printZooCageAnimal(0, 0, d.getZoo().getSizeBrs(), d.getZoo().getSizeKol());

        System.out.println("Press \"ENTER\" to continue...");
        scan.nextLine();

        int pil, x1, x2, y1, y2;
        String c = "a";

        do {
            System.out.println("\033[H\033[J");
            System.out.println(" ---- : Menu : ---- ");
            System.out.println("1. Display Virtual Zoo");
            System.out.println("2. Tour Virtual Zoo ");
            System.out.println("3. See Animal Consume Rate");
            System.out.println("4. Exit");
            System.out.println("Choice: ");
            pil = scan.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Zoo Size = " + d.getZoo().getSizeBrs() + "x" + d.getZoo().getSizeKol());
                    System.out.print("Masukkan x1 = "); x1 = scan.nextInt();
                    System.out.print("Masukkan y1 = "); y1 = scan.nextInt();
                    System.out.print("Masukkan x2 = "); x2 = scan.nextInt();
                    System.out.print("Masukkan y2 = "); y2 = scan.nextInt();
                    while(c != "x" && c != "X") {
                        System.out.println("\033[H\033[J");
                        d.getZoo().moveAnimal();
                        d.getZoo().printZooCageAnimal(x1, y1, x2, y2);
                        System.out.println("Press \"ENTER\" to continue...");
                        c = scan.nextLine();
                    }
                    break;
                case 2:
                    d.TourZoo();
                    break;
                case 3:
                    System.out.println("\033[H\033[J");
                    System.out.println("Animal Consume Rate is " + Animal.getConsumeRate() + " kg/day");
                    System.out.println("Press \"ENTER\" to continue...");
                    scan.nextLine();
                    scan.nextLine();
                    break;
                case 4:
                    System.out.println("Thank You.");
                    break;
                default:
                    System.out.println("Wrong choice. Try Again.");
                    break;
            }
        } while (pil != 4);
    }
}
