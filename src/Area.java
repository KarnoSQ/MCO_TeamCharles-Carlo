import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Area
{
    protected int current_area;
    protected int xcoordinate=0;
    protected int ycoordinate=0;
    protected char[][] area;
    protected Area(int current_area, char[][] area)
    {
        this.current_area = current_area;
        this.area = area;
    }
    public boolean canMoveThere(int movement,char coordinate){
        try{
            if(coordinate=='x'){
                area[xcoordinate+movement][ycoordinate] = 'P';
                return true;
            }
            else if(coordinate=='y'){
                area[xcoordinate][ycoordinate+movement] = 'P';
                return true;
            }
            for (char[] row : area) { java.util.Arrays.fill(row, ' ');}
        }
        catch(ArrayIndexOutOfBoundsException e){
            //@Charles have the Gui Print out can not  move there
            System.out.println("Cant Move there");
            return false;
        }
        return false;
    }
    protected Boolean hasRandomEncounters(){
        Random rand= new Random();
        if(rand.nextInt(0,100)<=40){return true;}
        else return false;
    }
    public void movement(String movement) {

        try{
            switch (movement) {
                case "up" -> {
                    if(canMoveThere(1, 'x'))
                        xcoordinate++;
                }
                case "down" -> {
                    if(canMoveThere(-1, 'x'))
                        xcoordinate--;
                }
                case "left" -> {
                    if(canMoveThere(1, 'y'))
                        ycoordinate++;
                }
                case "right" -> {
                    if(canMoveThere(-1, 'y'))
                        ycoordinate--;
                }
                default -> throw new IllegalStateException();
            }
        }
        catch(IllegalStateException e){
            Logger log=Logger.getLogger(Area1.class.getName());
            log.warning("Error in Movement");
            throw e;
        }
    }

}
