package animal.classification.land.biped;

import animal.classification.land.LandAnimal;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/27/17.
 */

/**
 *  Menangani kelas hewan dengan atribut habitat = "Land" dan legs = 2.
 */

public abstract class Biped extends LandAnimal {
  /**
   * Constructor.
   * @param w Berat hewan
   * @param x Letak hewan berdasarkan indeks baris map zoo
   * @param y Letak hewan berdasarkan indeks kolom map zoo
   * @param tame true apabila hewan telah dijinakkan
   */

  public Biped(float w,int x,int y,boolean tame) {
    super(w,x,y,tame);
    setLeg(2);
  }
}
