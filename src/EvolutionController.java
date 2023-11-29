import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EvolutionController {

    private EvolutionModel model;
    private EvolutionView view;
    private Inventory inventory;
    private ArrayList<Creatures> list;

    public EvolutionController(EvolutionView view, EvolutionModel model, Inventory inventory){

        this.view = view;
        this.model = model;
        this.list = inventory.getCreaturelist();
        
        view.setEvoBtn1Listener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                //Show inventory
                
                view.printInventory(inventory);

            }
        });

        view.setEvoBtn2Listener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                //Show inventory

                view.printInventory(inventory);
                
            }
        });

        view.setEvolveBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                

            }
        });

        view.setExitBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                
            }
        });


    }
    
}
