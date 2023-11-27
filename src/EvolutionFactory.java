import java.util.Objects;
public class EvolutionFactory extends CreatureFactory{
    EvolutionFactory(){
        CreateList();
    }
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
