import java.util.logging.Logger;
public class Area2 extends Area1{
    public Area2(){
        this.current_area=2;
        this.row=4;
        this.column=4;
    }
    public int moveup(int y){
        try{
            if(1+y<=row){
                return y+1;
            }
            else throw new IllegalArgumentException();
        }
        catch(Exception e) {
            //Charles make an alert on Screen saying cant walk here
            return y;
        }
    }
    public int movedown(int y){
        try{
            if(y-1<=row){
                return y-1;
            }
            else throw new IllegalArgumentException();
        }
        catch(Exception e) {
            //Charles make an alert on Screen saying cant walk here
            return y;
        }
    }
}
