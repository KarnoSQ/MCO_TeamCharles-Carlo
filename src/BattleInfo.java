import java.util.Random;
/**Represents battle information
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */
public abstract class BattleInfo{
    private Creatures enemy;
    private Inventory inven;
    private int enemyhealth = 50;

    /**
     * Default Constructor
     * @param inven Inventory
     * @param enemy Enemy Creature
     */
    BattleInfo(Inventory inven,Creatures enemy){
    this.enemy=enemy;
    this.inven=inven;
    }

    /**
     *  Attacks a Creature
     * @return damage
     */
    public int Attack(){
        Random rand = new Random();
        return rand.nextInt(1,10) * inven.getAc().getIdentity().getEvo();
    }

    /**
     *  Swaps Creature
     * @param index Creature to swap
     */
    public void Swap(int index){
            inven.setAc(index);
    }

    /**
     * Checks if creature has been caught
     * @return true or false depending on if creature was caught
     */
    private boolean hascaughtcreature(){
        Random rand = new Random();
        return  rand.nextInt(1,100)<=(40+50-this.enemyhealth);
    }

    /**
     * Catches Creature
     */
    public void Catch(){
        if(hascaughtcreature()){
            inven.addCreature(this.enemy);
        }
    }

    /**
     *
     * @return enemy health
     */
    public int getEnemyhealth() {
        return enemyhealth;
    }

    /**
     * enemy takes the damage
     * @param damage damages enemy
     */
    public void takesdamage(int damage){
        if(inven.getAc().isStronger(enemy.getIdentity().getType()))
            damage*=2;
        enemyhealth-=damage;
    }
}
