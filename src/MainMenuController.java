package GuiMCO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Window;

public class MainMenuController {

    private MainMenuView view;
    private MainMenuModel model;
    private int selectedArea;
    private Inventory inventory;
    private Player player;
    private AreaModel areaModel;
    private AreaView areaView;

    public MainMenuController(MainMenuView view, MainMenuModel model, Inventory inventory, Player player){

        this.view = view;
        this.model = model;

        // Instances
        this.inventory = inventory;
        this.player = player;

        this.view.setInvntryBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                
                InventoryModel invModel = new InventoryModel(inventory);
                InventoryView invView = new InventoryView(inventory);
                InventoryController invController = new InventoryController(invView, invModel, inventory);
                
            }
        });

        // Choose Area
        this.view.setComboBoxListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                if(e.getSource()==view.comboBox){

                    selectedArea = view.comboBox.getSelectedIndex();
                        
                }
            }
        });
        
        // Explore chosen Area Button
        this.view.setExplrBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                areaModel = new AreaModel(player);
                areaView = new AreaView(selectedArea + 1, areaModel);

                switch(selectedArea){
                    case 0:

                    Area1Controller area1Controller = new Area1Controller(areaView, areaModel, view, player);
                    break;

                    case 1:

                    Area2Controller area2Controller = new Area2Controller(areaView, areaModel, view, player);
                    break;

                    case 2:

                    Area3Controller area3Controller = new Area3Controller(areaView, areaModel, view, player);
                    break;

                }
            
            }
        });

        // Evolution Button
        this.view.setEvolBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                
                EvolutionModel evoModel = new EvolutionModel(inventory);
                EvolutionView evoView = new EvolutionView(inventory);
                EvolutionController evolutionController = new EvolutionController(evoView, evoModel, inventory);
                
            }
        });

        // Exit Button
        this.view.setExitBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                    Window window = view.mainFrame;

                    if(window instanceof javax.swing.JFrame){
                        javax.swing.JFrame frame = (javax.swing.JFrame) window;
                        frame.dispose();
                    }
            }   
        });

        

    }
    
}
