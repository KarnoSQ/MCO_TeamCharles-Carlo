package GuiMCO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleScreenController {

    private BattleScreenModel model;
    private BattleScreenView view;

    public BattleScreenController(BattleScreenView view, BattleScreenModel model){

        this.view = view;
        this.model = model;

        this.view.setAtkBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                //perform atk

            }

        });

        this.view.setSwapBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                //perform swap

            }

        });

        this.view.setCatchBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                //perform catch

            }

        });

        this.view.setRunBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                //perform run

            }

        });


    }
    
}
