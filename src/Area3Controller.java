import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area3Controller {

    private AreaView view;
    private AreaModel model;
    private Area2 area;
    private Player player;
    private MainMenuView MMview;
    
    public Area3Controller(AreaView view, AreaModel model, MainMenuView MMview, Player player){

        this.view = view;
        this.model = model;
        this.MMview = MMview;
        this.player = player;
        this.area = new Area3();
        
        MMview.mainFrame.setVisible(false);
        MMview.mainFrame.setEnabled(false);

        this.view.setLeftBtnListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){

                int x = player.getX();
                int newX = area.moveLeft(x);

                if(newX == x){

                    view.invalidMove();

                } else {

                    player.setX(newX);
                    view.updateAreaView();
                }

            }
        });

        this.view.setRightBtnListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                int x = player.getX();
                int newX = area.moveRight(x);

                if(newX == x){

                    view.invalidMove();

                } else {

                    player.setX(newX);
                    view.updateAreaView();
                }

            }
        });

        this.view.setUpBtnListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                int y = player.getY();
                int newY = area.moveUp(y);

                if(newY == y){

                    view.invalidMove();

                } else {

                    player.setY(newY);
                    view.updateAreaView();
                }

            }
        });

        this.view.setDownBtnListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                int y = player.getY();
                int newY = area.moveDown(y);

                if(newY == y){

                    view.invalidMove();

                } else {

                    player.setY(newY);
                    view.updateAreaView();
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
