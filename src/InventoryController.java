import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InventoryController {

    private InventoryView view;
    private InventoryModel model;
    private ActiveCreature ac;
    private ArrayList<Creatures> list = new ArrayList<>();
    private InstancesClass instance;
    private Inventory inventory;

    public InventoryController(InventoryView view, InventoryModel model, Inventory inventory){

        this.view = view;
        this.model = model;
        this.inventory = inventory;
        list = model.getInventory();

        view.setBtn1Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                boolean result = inventory.setAc(0);

                if(result){
                    view.mainFrame.revalidate();
                    view.mainFrame.repaint();
                } else {
                    
                }

            }
        });

        view.setBtn2Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                boolean result = inventory.setAc(1);

                if(result){
                    view.mainFrame.revalidate();
                    view.mainFrame.repaint();
                } else {
                    
                }

            }
        });

        view.setBtn3Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                boolean result = inventory.setAc(2);

                if(result){
                    view.mainFrame.revalidate();
                    view.mainFrame.repaint();
                } else {
                    
                }

            }
        });

        view.setBtn4Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                boolean result = inventory.setAc(3);

                if(result){
                    view.mainFrame.revalidate();
                    view.mainFrame.repaint();
                } else {
                    
                }

            }
        });

        view.setBtn5Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                boolean result = inventory.setAc(4);

                if(result){
                    view.mainFrame.revalidate();
                    view.mainFrame.repaint();
                } else {
                    
                }

            }
        });

        view.setBtn6Listener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                boolean result = inventory.setAc(5);

                if(result){
                    view.mainFrame.revalidate();
                    view.mainFrame.repaint();
                } else {
                    
                }

            }
        });
        
    }

    public InventoryController(){

    }

    public ArrayList<Creatures> getList(){

        return list;

    }
    
}
