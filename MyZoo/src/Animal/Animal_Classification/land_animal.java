package Animal.Animal_Classification;

/**
 * Created by root on 3/27/17.
 */
public class land_animal {
    /**@brief Constructor
     * Melakukan inisialisasi kelas LandAnimal
     * @param w untuk weight
     * @param x untuk koordinat x pada map
     * @param y untuk koordinat y pada map
     * @param tame true jika jinak, false jika tidak jinak
     */
    LandAnimal(float w,int x,int y,bool tame);
    /**@brief Getter untuk habitat
     * @return habitat dari Kelas Habitat
     */
    string GetHabitat();
    /**@brief mengembalikan string yang menggambarkan interaksi
     * user dengan hewan
     * @return suara hewan
     */
    virtual string Interact()=0;
    /**@brief Menamplkan informasi tentang hewan
     */
    virtual void GetInfo();

    /**@brief habitat dari hewan
     */
    protected Stringl habitat;
}
