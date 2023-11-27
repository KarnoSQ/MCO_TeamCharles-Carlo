import java.util.Random;


public abstract class Area {
    protected int current_area;
    protected int row;
    protected int column;
    protected Player player;

    protected Area(int current_area,int row,int column) {
        this.current_area = current_area;
        this.row = row;
        this.column = column;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public int getCurrent_area() {
        return current_area;
    }
    protected Boolean hasRandomEncounters() {
        Random rand = new Random();
        return rand.nextInt(0, 100) <= 40;
    }
    private Creatures YieldACreature(){
        CreatureFactory cf = new  CreatureFactory();
        return cf.makenewCreature(current_area);
    }
   public BattleOrder encounters(){
       return new BattleOrder(player.inven,YieldACreature());
   }

}