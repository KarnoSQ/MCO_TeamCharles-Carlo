import java.util.Objects;
/**Represents an Evolution Creator
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */
public class EvolutionFactory extends CreatureFactory{
    /**
     * Default Constructor
     */
    EvolutionFactory(){
        CreateList();
    }

    /**
     * Makes a new Creature
     * @param type type of the creature
     * @param family family of the creature
     * @param evolution evolution level of the creature
     * @return new creature
     */
    public Creatures makenewCreature(String type,char family,int evolution) {
        try{
            for (CreatureInfo cr : features) {
                if (cr.getFamily() == family && Objects.equals(cr.getType(), type) &&
                        cr.getEvo() == (evolution + 1)) {
                    return new Creatures(cr);
                }
            }
            throw new ArrayIndexOutOfBoundsException();
            }catch(ArrayIndexOutOfBoundsException e){
            //throw alert or something
        //Charles make a Creature cannot be made alert
            // || then delete this
            // \/
            return null;
             }
        }
}
