import java.util.logging.Logger;
public class Area1 extends Area{


    public Area1(){
        super('1', 5,1);
    }

    public int moveleft(int x){
        try{
            if(1+x<=row){
                return x+1;
            }
            else throw new IllegalArgumentException();
        }
        catch(Exception e) {
        //Charles make an alert on Screen saying cant walk here
        return x;
        }
    }
    public int moveright(int x){
        try{
            if(x-1<=row){
                return x-1;
            }
            else throw new IllegalArgumentException();
        }
        catch(Exception e) {
            //Charles make an alert on Screen saying cant walk here
            return x;
        }
    }
}
