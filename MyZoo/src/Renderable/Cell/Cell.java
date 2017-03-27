package Renderable.Cell;

import Renderable.Renderable;

/**
 * Class Building.Renderable.Cell.
 * Merepresentasikan petak yang ada pada Virtual Zoo.
 *
 * Created by um on 27/03/17.
 */
public class Cell implements Renderable {

    private final int loc_x;
    private final int loc_y;
    private char content;

    /**
     * Default class constructor.
     */
    Cell() {
        this.loc_x = 0;
        this.loc_y = 0;
        this.content = '-';
    }

    /**
     * Class constructor dengan parameter absis dan ordinat
     * dari lokasi cell.
     *
     * @param i absis lokasi cell
     * @param j ordinat lokasi cell
     */
    protected Cell(int i, int j) {
        this.loc_x = i;
        this.loc_y = j;
        this.content = '-';
    }

    /**
     * Mendapatkan content
     * @return content cell
     */
    private char getContent() {
        return this.content;
    }

    /**
     * Mengubah content
     * @param content content merupakan satu karakter unik.
     */
    protected void setContent(char content) {
        this.content = content;
    }

    /**
     * Mendapatkan lokasi absis
     * @return lokasi absis cell
     */
    private int getX() {
        return this.loc_x;
    }

    /**
     * Mendapatkan lokasi ordinat
     * @return lokasi ordinat cell
     */
    private int getY() {
        return this.loc_y;
    }

    private void display() {
        System.out.println("x : " + getX());
        System.out.println("y : " + getY());
        System.out.println("content : " + getContent());
    }

    @Override
    public char Render() {
        return getContent();
    }

    public static void main(String args[]) {
        Cell C = new Cell();
        Cell C1 = new Cell(3,3);
        Cell C2 = new Cell(5,5);
        C.display();
        C1.display();
        C2.display();
    }

}
