package GuiMCO;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area1Controller{
    
    private AreaModel model;
    private AreaView view;
    private Area1 area;
    private Player player;
    private MainMenuView MMview;

    public Area1Controller(AreaView view, AreaModel model, MainMenuView MMview, Player player){

        this.view = view;
        this.model = model;
        this.MMview = MMview;
        this.player = player;
        this.area = new Area1();

        MMview.mainFrame.setEnabled(false);
        MMview.mainFrame.setVisible(false);

        this.view.setLeftBtnListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){

                int x = model.getX();
                int newX = area.moveLeft(x);

                if(newX == x){

                    view.invalidMove();

                } else {

                    if(area.hasRandomEncounters()){

                        area.encounters();

                    }

                    model.setX(newX);
                    view.updateArea1View();
                    
                }

            }
        });

        this.view.setRightBtnListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                int x = model.getX();
                int newX = area.moveRight(x);

                if(newX == x){

                    view.invalidMove();

                } else {
                    
                    if(area.hasRandomEncounters()){

                        area.encounters();

                    }
                    
                    model.setX(newX);
                    view.updateArea1View();

                }

            }
        });

        this.view.setExitBtnListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                model.setX(0);
                model.setY(0);
                MMview.mainFrame.setEnabled(true);
                MMview.mainFrame.setVisible(true);
                view.mainFrame.dispose();
            }
        });
        
    }
}
