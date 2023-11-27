import java.util.Iterator;
public class Evolution {
    private Inventory inven;
    EvolutionFactory ev;
    public Evolution(Inventory inven) {
        this.inven = inven;
    }

    public Creatures CreateEvolution(int index1, int index2) {
       try{
           if (canevolve(index1, index2)) {
               Creatures c1=inven.getCreature(index1);
               Creatures c2=inven.getCreature(index2);
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
           throw new IllegalArgumentException();
       }
    }


        private boolean canevolve ( int index1, int index2){
            try {
                return((inven.getCreaturelist().get(index1) == inven.getCreaturelist().get(index1))&&inven.getCreaturelist().get(index1).getIdentity().getEvo()<3);
            } catch (Exception e) {
                return false;
                //Charles make a fail screen idk up to you how it works
            }

        }
    }

