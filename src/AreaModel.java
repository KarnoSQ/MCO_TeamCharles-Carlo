package GuiMCO;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AreaModel {

    public Player player;
    private int x,y;
    
    public AreaModel(Player player){

        this.player = player;
        
    }

    public int getX(){

        return this.player.getX();

    }

    public int getY(){

        return this.player.getY();

    }

    public void setX(int x){

        player.setX(x);
        
    }

    public void setY(int y){
        player.setY(y);
    }
    
}
