import java.util.ArrayList;
public class Inventory {
    ArrayList<Creatures> creaturelist = new ArrayList<>();
    ActiveCreature ac;
    Inventory(){

    }
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
    public ActiveCreature getAc() {
        return ac;
    }
    public Creatures getCreature(int index) {
       try{
       return creaturelist.get(index);
       }
       catch(ArrayIndexOutOfBoundsException e){
           //Charles Make a no Pokémon found in inventory gui
           throw new IllegalArgumentException();
       }
    }
    public boolean addCreature(Creatures creature){
        try{
            creaturelist.add(creature);
            return true;
        }catch(Exception e){
            //Charles make a failed to add Pokémon in inventory gui
            throw new IllegalArgumentException();
        }
    }
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
}
