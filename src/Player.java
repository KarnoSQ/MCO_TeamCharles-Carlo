/**Represents a Player
 * @author Carlo San Buenaventura
 * @version 2.0
 *
 */
public class Player {

    Inventory inven;
    private int x=0;
    private int  y=0;
    private String name;

    /**
     * Default Constructor
     * @param name name of a player
     * @param invent inventory of a player
     */
    public Player(String name,Inventory invent){
        this.name=name;
        this.inven = invent;
    }

    /**
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param x row location of player
     */
    public void setX(int x){
        this.x=x;
    }

    /**
     * column location of player
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
}
