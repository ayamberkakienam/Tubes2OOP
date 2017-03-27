package animal.animal_classification;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**@interface Information
 * Interface yang menangani informasi hewan dan interaksinya
 */
public interface Information {
    /**@brief mengembalikan string yang menggambarkan interaksi
     * user dengan hewan
     * @return suara hewan
     */
    String Interact();
    /**@brief Menamplkan informasi tentang hewan
     */
    void GetInfo();
}
