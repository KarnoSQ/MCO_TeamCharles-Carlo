import java.util.Random;

public class BattleInfo{
    private Creatures enemy;
    private Inventory inven;
    private int enemyhealth = 50;

    BattleInfo(Inventory inven,Creatures enemy){
    this.enemy=enemy;
    this.inven=inven;
    }
    public int Attack(int damage){
        Random rand = new Random();
        return rand.nextInt(1,10) * inven.getAc().getIdentity().getEvo();
    }
    public void Swap(int index){
            inven.setAc(index);
    }
    private boolean hascaughtcreature(){
        Random rand = new Random();
        return  rand.nextInt(1,100)<=(40+50-this.enemyhealth);
    }

    public void Catch(){
        if(hascaughtcreature()){
            inven.addCreature(this.enemy);
        }
    }
}
