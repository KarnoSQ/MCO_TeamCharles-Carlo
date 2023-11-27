public class BattleOrder extends BattleInfo{
    private Creatures enemy;
    private Inventory inven;
    private int turns = 3;
    //use this to make the gui
    public BattleOrder(Inventory inven,Creatures enemy){
        super(inven,enemy);
    }
    public int getTurns() {
        return turns;
    }
    public void useaturn(){
        this.turns-=1;
    }
    public boolean runsaway() {
    return turns >= 0;
    }
}
