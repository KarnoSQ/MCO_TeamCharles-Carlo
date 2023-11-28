import java.util.Random;
/**Represents an area details
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */

public abstract class Area {
    protected int current_area;
    protected int row;
    protected int column;
    protected Player player;
    protected CreatureFactory cf = new  CreatureFactory();

    /**
     * Default Constructor
     * @param current_area  area number
     * @param row number of rows
     * @param column number of columns
     */
    protected Area(int current_area,int row,int column) {
        this.current_area = current_area;
        this.row = row;
        this.column = column;
    }

    /**
     *
     * @return rows
     */
    public int getRow() {
        return row;
    }

    /**
     *
     * @return columns
     */
    public int getColumn() {
        return column;
    }

    /**
     *
     * @return current area
     */
    public int getCurrent_area() {
        return current_area;
    }

    /**
     * Checks for Encounters
     * @return true or false depending on encounters
     */
    protected Boolean hasRandomEncounters() {
        Random rand = new Random();
        return rand.nextInt(0, 100) <= 40;
    }

    /**
     *  Makes a new Creature
     * @return Creature
     */
    private Creatures YieldACreature(){
        return cf.makenewCreature(current_area);
    }

    /**
     * Creates a new encounter
     * @return Battle Order
     */
   public BattleOrder encounters(){
       return new BattleOrder(player.inven,YieldACreature());
   }

}