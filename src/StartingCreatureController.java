package GuiMCO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StartingCreatureController {

    private StartingCreatureView view;
    private StartingCreatureModel model;
    private Inventory inventory;
    private MainMenuController MMController;
    private Player player;
    private CreatureFactory creatureFactory;
    private ArrayList<Creatures> starter;


    public StartingCreatureController(StartingCreatureView view, StartingCreatureModel model){

        this.model = model;
        this.view = view;
        this.inventory = new Inventory();
        this.player = new Player("Ash", inventory);

        starter = creatureFactory.makenewstartercreature();

        this.view.addButton1(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(1));
                
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton2(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(2));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton3(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(3));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton4(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(4));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);
                
            }
        });

        this.view.addButton5(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(5));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton6(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(6));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton7(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(7));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton8(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(8));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        this.view.addButton9(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                inventory.addCreature(starter.get(9));
                view.mainFrame.dispose();
                MainMenuView MMview = new MainMenuView();
                MainMenuModel MMmodel = new MainMenuModel();
                MainMenuController MainMenuController = new MainMenuController(MMview, MMmodel,inventory,player);

            }
        });

        
    }

    
}
