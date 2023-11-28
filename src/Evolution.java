import java.util.Iterator;
/**Represents an Evolution
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */
public class Evolution {
    private Inventory inven;
    private EvolutionFactory ev =  new EvolutionFactory();

    /**
     * Default Constructor
     * @param inven players inventory
     */
    public Evolution(Inventory inven) {
        this.inven = inven;
    }

    /**
     * Creates evolution
     * @param index1 index of first creature
     * @param index2 index of second creature
     * @return Evolved Creature
     */
    public Creatures CreateEvolution(int index1, int index2) throws InvalidCreature {
       try{
           if (canevolve(index1, index2)) {
               Creatures c1=inven.getCreature(index1);
               inven.setCreaturelist(index1, null);
               inven.setCreaturelist(index2, null);
               Iterator<Creatures> ct = inven.getCreaturelist().iterator();
               // Loop through a collection
               int i = 0;
               while (ct.hasNext()) {
                   if (ct.next() == null) {
                       inven.removeCreature(i);
                   }
                   i++;
               }
               return ev.makenewCreature(c1.getIdentity().getType(),c1.getIdentity().getFamily(),c1.getIdentity().getEvo());
           }
           else
               throw new IllegalArgumentException();
       }catch(IllegalArgumentException e){
           //Charles make a message here idk
           throw new InvalidCreature("Creature Not Found");
       }
    }

    /**
     *  Checks if player can Evolve Creature
     * @param index1 index of the first creature
     * @param index2 index of the second creature
     * @return true or false if creature can evolve
     */

        private boolean canevolve (int index1, int index2){
            try {
                return((inven.getCreaturelist().get(index1) == inven.getCreaturelist().get(index1))&&inven.getCreaturelist().get(index1).getIdentity().getEvo()<3);
            } catch (Exception e) {
                return false;
                //Charles make a fail screen idk up to you how it works
            }

        }
    }

