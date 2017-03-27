/**
 * Created by Diki Ardian W (13515092) on 3/27/17.
 */

package animal.animal_classification;

public abstract class Animal {
    static {
        consumerate = 0;
        n_animal = 0;
    }
    public Animal(float w, int x, int y,boolean tame, char _content) {
        weight = w;
        loc_x = x;
        loc_y = y;
        tamed = tame;
        content = _content;
    }

    public void SetName(String names) {
        name = names;
    }

    public void SetHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void SetLoc(int x, int y) {
        loc_x = x;
        loc_y = y;
    }

    public void SetDiet(String food) {
        diet = food;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public void SetTamed(boolean tame) {
        tamed = tame;
    }

    public void SetLeg(int nleg) {
        legs = nleg;
    }
    public void SetContent(char _content) {
        content =  _content;
    }
    public String GetName() {
        return  name;
    }

    public int GetLocX() {
        return loc_x;
    }

    public int GetLocY() {
        return loc_y;
    }

    public double GetFodder() {
        return 0.025 * weight;
    }

    char GetContent() {
        return content;
    }

    public boolean IsTamed() {
        return tamed;
    }

    public int GetLegs() {
        return legs;
    }

    public boolean DistLocX(Animal an) {
        return (loc_x != an.loc_x);
    }

    public boolean DistLocY(Animal an) {
        return (loc_y != an.loc_y);
    }

    public boolean DistLoc(Animal an) {
        return (DistLocX(an) || DistLocY(an));
    }

    public void PrintInfo() {
        System.out.println("Content        : "+content);
        System.out.println("Name           : "+name);
        System.out.println("Location       : ("+loc_x+","+loc_y+")");
        System.out.println("Weight         : "+String.format("%.5f",weight)+" kg");
        System.out.println("Habitat        : "+habitat);
        System.out.println("Type           : "+type);
        System.out.println("Diet           : "+diet);
        System.out.println("Fodder         : "+String.format("%.5f",GetFodder())+" kg");
        System.out.println(tamed ? "Tame           : Yes " : "Tame           : No ");
        System.out.println("Number of Legs : "+legs);
    }

    abstract void Interact();

    abstract void GetInfo();

    static public float GetConsumeRate() {
        return consumerate;
    }

    static public int GetNAnimal() {
        return  n_animal;
    }

    protected String name;

    protected String habitat;

    protected float weight;

    protected float fodder;

    protected String type;

    protected boolean tamed;

    protected String diet;

    protected int loc_x;

    protected int loc_y;

    protected int legs;

    protected char content;

    static public int n_animal;

    static public float consumerate;
}
