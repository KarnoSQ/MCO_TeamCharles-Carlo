import java.util.Iterator;
public class Evolution {
    private Inventory inven;

    public Evolution(Inventory inven) {
        this.inven = inven;
    }

    public Creatures CreateEvolution(int index1, int index2) {
        if (canevolve(index1, index2)) {
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
        }
        return //evolutionfactory
    }


        private boolean canevolve ( int index1, int index2){
            try {
                return inven.getCreaturelist().get(index1) == inven.getCreaturelist().get(index1);
            } catch (Exception e) {
                return false;
            }

        }
    }

