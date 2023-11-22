package GuiMCO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Window;

public class MainMenuController {

    private MainMenuView view;
    private MainMenuModel model;

    public MainMenuController(MainMenuView view, MainMenuModel model){

        this.view = view;
        this.model = model;

        this.view.setInvntryBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setOption("Inventory");
            }
        });

        this.view.setExplrBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setOption("Explore");
            }
        });

        this.view.setEvolBtnListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setOption("Evolve");
            }
        });

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
