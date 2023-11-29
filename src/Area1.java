/**Represents area1
 * @author Carlo San Buenaventura
 * @version 2.1
 *
 */
public class Area1 extends Area{

    /**
     * Default Constructor
     */
    public Area1(){
        super('1', 4,1);
    }

    /**
     * Moves left
     * @param x row location
     * @return new location
     */
    public int moveRight(int x){
        try{
            if(1 + x <= row){
                return x+1;
            }
            else throw new InvalidRangeException("Cant Move Here");
        }
        catch(Exception e) {
        //Charles make an alert on Screen saying cant walk here
        return x;
        }
    }
    /**
     * Moves left
     * @param x row location
     * @return new location
     */
    public int moveLeft(int x){
        try{
            if(x-1 <= row && x-1>=0){
                return x-1;
            }
            else throw new InvalidRangeException("Cant Move Here");
        }
        catch(Exception e) {
            //Charles make an alert on Screen saying cant walk here
            return x;
        }
    }
}
