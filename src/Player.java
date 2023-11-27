public class Player {

    Inventory inven;
    private int x=0;
    private int  y=0;
    private String name;
    public Player(String name,Inventory invent){
        this.name=name;
        this.inven = invent;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
