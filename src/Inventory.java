import java.util.ArrayList;
/** Represents an Inventory
 * @author Carlo San Buenaventura
 * @version 2.0
 *
 */
public class Inventory {
    private ArrayList<Creatures> creaturelist = new ArrayList<>();
    private ActiveCreature ac;

    /**
     * Default Constructor
     */
    Inventory(){

    }

    /**
     *
     * @return Creatures List
     */
    public ArrayList<Creatures> getCreaturelist() {
        return creaturelist;
    }

    /**
     *
     * @param index index of the creature to be active
     * @return true or false if became active
     */
    public boolean setAc(int index) {
        try{
            ac=(ActiveCreature)creaturelist.get(index);
            //make a message in gui
            return true;
        }catch(ArrayIndexOutOfBoundsException e){
            //Charles Make a no Pokémon found in inventory gui
            return false;
        }
    }

    /**
     *
     * @return Ac
     */
    public ActiveCreature getAc() {
        return ac;
    }

    /**
     *
     * @param index index of creature
     * @return creature
     */
    public Creatures getCreature(int index) {
       try{
       return creaturelist.get(index);
       }
       catch(ArrayIndexOutOfBoundsException e){
           //Charles Make a no Pokémon found in inventory gui
           throw new IllegalArgumentException();
       }
    }

    /**
     * adds a creature to the inventory
     * @param creature creature to be added
     * @return true or false if added
     */
    public boolean addCreature(Creatures creature){
        try{
            creaturelist.add(creature);
            return true;
        }catch(Exception e){
            //Charles make a failed to add Pokémon in inventory gui
            throw new IllegalArgumentException();
        }
    }

    /**
     * removes creature
     * @param index creature to be removed
     * @return true or false depends on if they are removed or not
     */
    public boolean removeCreature(int index){
        try{
            creaturelist.remove(index);
            //make a message in gui
            return true;
        }catch(ArrayIndexOutOfBoundsException e){
            //Charles Make a no Pokémon found in inventory gui
            return false;
        }
    }

    /**
     * Changes creature in list
     * @param index index of creature to be changed
     * @param creature creature to change
     */
    public void setCreaturelist(int index, Creatures  creature) {
        this.creaturelist.set(index,creature);
    }
}
