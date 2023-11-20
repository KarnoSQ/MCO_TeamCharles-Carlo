package GuiMCO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartingCreatureController {

    private StartingCreatureView view;
    private StartingCreatureModel model;
    
    public StartingCreatureController(StartingCreatureView view, StartingCreatureModel model){

        this.model = model;
        this.view = view;

        this.view.addButton1(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Strawander");
            }
        });

        this.view.addButton2(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Chocowool");
            }
        });

        this.view.addButton3(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Parfwit");
            }
        });

        this.view.addButton4(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Brownisaur");
            }
        });

        this.view.addButton5(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Frubat");
            }
        });

        this.view.addButton6(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Malts");
            }
        });

        this.view.addButton7(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Squirpie");
            }
        });

        this.view.addButton8(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Chocolite");
            }
        });

        this.view.addButton9(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){
                model.setStartCreature("Oshacone");
            }
        });
        
    }

    
}
