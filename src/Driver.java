package GuiMCO;


public class Driver {

    public static void main(String[] args){

        StartingCreatureView view = new StartingCreatureView();
        StartingCreatureModel model = new StartingCreatureModel();
        StartingCreatureController controller = new StartingCreatureController(view, model);

    }

    
}
