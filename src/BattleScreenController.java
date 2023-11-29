package GuiMCO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleScreenController {

    private BattleScreenModel model;
    private BattleScreenView view;
    private BattleOrder battleOrder;

    public BattleScreenController(BattleScreenView view, BattleScreenModel model, BattleOrder battleOrder){

        this.view = view;
        this.model = model;
        this.battleOrder = battleOrder;
        


        this.view.setAtkBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                battleOrder.Attack();

            }

        });

        this.view.setSwapBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                battleOrder.Swap(0);

            }

        });

        this.view.setCatchBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                battleOrder.Catch();

            }

        });

        this.view.setRunBtnListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e){

                battleOrder.runsaway();

            }

        });


    }
    
}
