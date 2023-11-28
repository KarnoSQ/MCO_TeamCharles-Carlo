/**Represents a Creature
 * @author Carlo San Buenaventura
 * @version 2.0
 *
 */
public class Creatures {
    private CreatureInfo identity;

    /**
     * Default Constructor
     * @param ci information of the creatures
     */
    public Creatures(CreatureInfo ci){
    this.identity=ci;
    }
    public boolean isStronger(String E){
    if(identity.getType().equals("Fire") && E.equals("Grass")){
        return true;
    }
    else if(identity.getType().equals("Water") && E.equals("Fire")){
            return true;
    }
    else return identity.getType().equals("Grass") && E.equals("Water");
    }
    public CreatureInfo getIdentity() {
        return identity;
    }
}
