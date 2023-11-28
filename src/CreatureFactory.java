import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**Represents Creature creation
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */

public class CreatureFactory {
   protected ArrayList<CreatureInfo> features= new ArrayList<>();

    /**
     * Creates List of Creatures
     */
   protected void CreateList(){
       features.add(new CreatureInfo("Strawalander","Fire",1,'A'));
       features.add(new CreatureInfo("Chocowool","Fire",1,'B'));
       features.add(new CreatureInfo("Parwift","Fire",1,'C'));
       features.add(new CreatureInfo("Brownisaur","Grass",1,'D'));
       features.add(new CreatureInfo("Frubat","Grass",1,'E'));
       features.add(new CreatureInfo("Malts","Grass",1,'F'));
       features.add(new CreatureInfo("Squirpie","Water",1,'G'));
       features.add(new CreatureInfo("Chocolite","Water",1,'H'));
       features.add(new CreatureInfo("Oshacone","Water",1,'I'));

       features.add(new CreatureInfo("Strawleon","Fire",2,'A'));
       features.add(new CreatureInfo("Chocofluff","Fire",2,'B'));
       features.add(new CreatureInfo("Parfure","Fire",2,'C'));
       features.add(new CreatureInfo("Chocosaur","Grass",2,'D'));
       features.add(new CreatureInfo("Golberry","Grass",2,'E'));
       features.add(new CreatureInfo("Kirlicake","Grass",2,'F'));
       features.add(new CreatureInfo("Tartortle","Water",2,'G'));
       features.add(new CreatureInfo("Chocolish","Water",2,'H'));
       features.add(new CreatureInfo("Dewice","Water",2,'I'));

       features.add(new CreatureInfo("Starwizard","Fire",3,'A'));
       features.add(new CreatureInfo("Candaros","Fire",3,'B'));
       features.add(new CreatureInfo("Parfelure","Fire",3,'C'));
       features.add(new CreatureInfo("Fudgasaur","Grass",3,'D'));
       features.add(new CreatureInfo("Croberry","Grass",3,'E'));
       features.add(new CreatureInfo("Velvevoir","Grass",3,'F'));
       features.add(new CreatureInfo("Piestoise","Water",3,'G'));
       features.add(new CreatureInfo("Icesundae","Water",3,'H'));
       features.add(new CreatureInfo("Samurcone","Water",3,'I'));
   }

    /**
     * Default Constructor
     */
    CreatureFactory(){
        CreateList();
    }

    /**
     * makes new Creatures
     * @param currentarea current area of the player
     * @return new Creature
     */
    public Creatures makenewCreature(int currentarea) {
      try{
          Random rand= new Random();
          switch (currentarea) {
              case 1 -> {
                  List<CreatureInfo> area1 = features.stream().filter(q -> q.getEvo() == 1).toList();
                  return new Creatures(area1.get(rand.nextInt(0, area1.size() - 1)));
              }
              case 2 -> {
                  List<CreatureInfo> area2 = features.stream().filter(q -> q.getEvo() <= 2).toList();
                  return new Creatures(area2.get(rand.nextInt(0, area2.size() - 1)));
              }
              case 3 -> {
                  List<CreatureInfo> area3 = features.stream().filter(q -> q.getEvo() <= 3).toList();
                  return new Creatures(area3.get(rand.nextInt(0, area3.size() - 1)));
              }
          }
      }catch(Exception e){
          throw new ClassCastException();
      }
        return null;
    }
}
