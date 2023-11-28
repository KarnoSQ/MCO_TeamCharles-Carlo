/**Represents area2
 * @author Carlo San Buenaventura
 * @version 1.0
 *
 */
public class Area2 extends Area1{
    /**
     * Default Constructor
     */
    public Area2(){
        this.current_area=2;
        this.row=4;
        this.column=4;
    }

    /**
     * Moves up
     * @param y column location of player
     * @return new location
     */
    public int moveup(int y){
        try{
            if(1+y<=row){
                return y+1;
            }
            else throw new InvalidRangeException("Cant Move Here");
        }
        catch(Exception e) {
            //Charles make an alert on Screen saying cant walk here
            return y;
        }
    }
    /**
     * Moves down
     * @param y column location of player
     * @return new location
     */
    public int movedown(int y){
        try{
            if(y-1<=row && y-1>=0){
                return y-1;
            }
            else throw new InvalidRangeException("Cant Move Here");
        }
        catch(Exception e) {
            //Charles make an alert on Screen saying cant walk here
            return y;
        }
    }
}
