/**Represents Information of creature
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */
public class CreatureInfo {
    private final char Family;
    private final String Name;
    private final String Type;
    private final int Evo;

    /**
     *  Default Constructor
     * @param name name of the creature
     * @param type type of the creature (Fire,Grass,Water)
     * @param evo evolution level of the creature
     * @param family family of the creature
     */
    public CreatureInfo (String name,String type,int evo,char family){
        this.Name = name;
        this.Type=type;
        this.Family=family;
        this.Evo=evo;
    }

    /**
     *
     * @return family
     */
    public char getFamily() {
        return Family;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @return evolution
     */
    public int getEvo() {
        return Evo;
    }

    /**
     *
     * @return type
     */
    public String getType() {
        return Type;
    }
}
