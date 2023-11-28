/**Represents  Battle Order
 * @author Carlo San Buenaventura
 * @version 2.0
 *
 */
public class BattleOrder extends BattleInfo{
    private Creatures enemy;
    private Creatures player;
    private Inventory inven;
    private int turns = 3;

    /**
     * Default Constructor
     * @param inven Inventory
     * @param enemy Enemy Creature
     */
    public BattleOrder(Inventory inven,Creatures enemy){
        super(inven,enemy);
    }

    /**
     *
     * @return amount of turns
     */
    public int getTurns() {
        return turns;
    }

    /**
     * uses a turn
     */
    public void useaturn(){
        this.turns-=1;
    }

    /**
     *
     * @return true if creature has run away
     */
    public boolean runsaway() {
    return turns >= 0;
    }
}
