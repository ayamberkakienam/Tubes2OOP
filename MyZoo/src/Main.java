import animal.Animal;

import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by um on 28/03/17.
 */
public class Main {
  /**
   * Main program.
   * @param args main program
   * @throws FileNotFoundException if file not found
   * @throws InterruptedException if interrupt
   */
  public static void main(String[] args) throws FileNotFoundException, InterruptedException {
    System.out.println("\033[H\033[J");
    System.out.println("      .=======================================================.");
    System.out.println("      |                                                       |");
    System.out.println("      |     ███╗   ███╗██╗   ██╗███████╗ ██████╗  ██████╗     |");
    System.out.println("      |     ████╗ ████║╚██╗ ██╔╝╚══███╔╝██╔═══██╗██╔═══██╗    |");
    System.out.println("      |     ██╔████╔██║ ╚████╔╝   ███╔╝ ██║   ██║██║   ██║    |");
    System.out.println("      |     ██║╚██╔╝██║  ╚██╔╝   ███╔╝  ██║   ██║██║   ██║    |");
    System.out.println("      |     ██║ ╚═╝ ██║   ██║   ███████╗╚██████╔╝╚██████╔╝    |");
    System.out.println("      |     ╚═╝     ╚═╝   ╚═╝   ╚══════╝ ╚═════╝  ╚═════╝     |");
    System.out.println("      |                                                       |");
    System.out.println("      `=======================================================`");
    Thread.sleep(1000);
    System.out.println("\n                          --=  ENTER =--  ");

    Scanner scan = new Scanner(System.in);
    scan.nextLine();

    Driver d = new Driver();
    System.out.println("\033[H\033[J");
    System.out.println("Initialisation Cell..\n");
    d.initCell();
    d.getZoo().printZoo();

    System.out.println("\nPress \"ENTER\" to continue...\n");
    scan.nextLine();

    for (int i = 0; i < d.getNumCage(); i++) {
      d.getZoo().createCage(i);
    }
    System.out.println("\033[H\033[J");
    System.out.println("Initialisation Cage..\n");
    d.initCage();
    d.getZoo().printZooCage();

    System.out.println("\nPress \"ENTER\" to continue...\n");
    scan.nextLine();

    d.initAnimal();
    System.out.println("\033[H\033[J");
    System.out.println("Initialisation Animal..\n");
    d.getZoo().printZooCageAnimal(0, 0, d.getZoo().getSizeBrs(), d.getZoo().getSizeKol());

    System.out.println("\nPress \"ENTER\" to continue...\n");
    scan.nextLine();

    int pil;
    int x1;
    int x2;
    int y1;
    int y2;
    String c = "a";

    do {
      System.out.println("\033[H\033[J");
      System.out.println(""
          + ".=======================+------------------------+=======================.");
      System.out.println(""
          + "|                       |   ┌┬┐  ┌─┐  ┌┐┌  ┬ ┬   |                       |");
      System.out.println(""
          + "|-----------------------|   │││  ├┤   │││  │ │   |-----------------------|");
      System.out.println(""
          + "|                       |   ┴ ┴  └─┘  ┘└┘  └─┘   |                       |");
      System.out.println(""
          + ".=======================+------------------------+=======================.");
      System.out.println(""
          + "|                                                                        |");
      System.out.println(""
          + "| 1. Display Virtual Zoo                                                 |");
      System.out.println(""
          + "| 2. Tour Virtual Zoo                                                    |");
      System.out.println(""
          + "| 3. See Animal Consume Rate                                             |");
      System.out.println(""
          + "|                                                                        |");
      System.out.println(""
          + "| 4. Exit                                                                |");
      System.out.println(""
          + "|                                                                        |");
      System.out.println(""
          + "`========================================================================`");
      System.out.print(" Choice : ");
      pil = scan.nextInt();
      switch (pil) {
        case 1:
          System.out.println(" Zoo Size = "
              + d.getZoo().getSizeBrs() + "x" + d.getZoo().getSizeKol());
          System.out.print(" Masukkan x1 = ");
          x1 = scan.nextInt();
          System.out.print(" Masukkan y1 = ");
          y1 = scan.nextInt();
          System.out.print(" Masukkan x2 = ");
          x2 = scan.nextInt();
          System.out.print(" Masukkan y2 = ");
          y2 = scan.nextInt();
          while (!Objects.equals(c, "x") && !Objects.equals(c, "X")) {
            System.out.println("\033[H\033[J");
            d.getZoo().moveAnimal();
            d.getZoo().printZooCageAnimal(x1, y1, x2, y2);
            System.out.println("\nPress \"ENTER\" to continue...");
            c = scan.nextLine();
          }
          break;
        case 2:
          d.tourZoo();
          break;
        case 3:
          System.out.println("\033[H\033[J");
          System.out.println("Animal Consume Rate is \n\t" + Animal.getConsumeRate() + " kg/day");
          System.out.println("\nPress \"ENTER\" to continue...");
          scan.nextLine();
          scan.nextLine();
          break;
        case 4:
          System.out.println("\033[H\033[J");
          System.out.println(
              ".==========================================================================.");
          System.out.println(
              "|                                                                          |");
          System.out.println(
              "| ████████╗██╗  ██╗ █████╗ ███╗   ██╗██╗  ██╗  ██╗   ██╗ ██████╗ ██╗   ██╗ |");
          System.out.println(
              "| ╚══██╔══╝██║  ██║██╔══██╗████╗  ██║██║ ██╔╝  ╚██╗ ██╔╝██╔═══██╗██║   ██║ |");
          System.out.println(
              "|    ██║   ███████║███████║██╔██╗ ██║█████╔╝    ╚████╔╝ ██║   ██║██║   ██║ |");
          System.out.println(
              "|    ██║   ██╔══██║██╔══██║██║╚██╗██║██╔═██╗     ╚██╔╝  ██║   ██║██║   ██║ |");
          System.out.println(
              "|    ██║   ██║  ██║██║  ██║██║ ╚████║██║  ██╗     ██║   ╚██████╔╝╚██████╔╝ |");
          System.out.println(
              "|    ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝     ╚═╝    ╚═════╝  ╚═════╝  |");
          System.out.println(
              "|                                                                          |");
          System.out.println(
              "`==========================================================================`");
          scan.nextLine();
          scan.nextLine();
          break;
        default:
          System.out.println("Wrong choice. Try Again.");
          break;
      }
    } while (pil != 4);
  }
}
