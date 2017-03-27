package Animal.Animal_Classification;
/**
 * Created by Husnulzaki Wibisono Har on 3/27/17.
 */

/**
 *  Menangani kelas hewan dengan atribut habitat = "Land" dan legs = 2
 */
class Biped extends LandAnimal {
    /**
     *  Constructor
     * @param w Berat hewan
     * @param x Letak hewan berdasarkan indeks baris map zoo
     * @param y Letak hewan berdasarkan indeks kolom map zoo
     * @param tame true apabila hewan telah dijinakkan
     */
    public Biped(float w,int x,int y,boolean tame) {
      super(w,x,y,tame);
      //SetLeg(2);
    }
    /**
     *  Mengembalikan string yang menggambarkan interaksi user dengan hewan
     * @return String sesuai implementasi pada kelas riil turunan
     */
    public String Interact () {
      return "No Interact";
    }
    /**
     *  Mencetak semua informasi hewan
     */
    public void GetInfo() {

    }
}
