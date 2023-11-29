import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EvolutionView {

    private JFrame mainFrame;
    private JLabel label, lblBg;
    private ImageIcon img, bg;
    private JButton evoButton1, evoButton2, evolveButton,exitButton;
    public JComboBox comboBox1, comboBox2;
    private ArrayList<Creatures> list;
    private Inventory inventory;

    public EvolutionView(Inventory inventory){

        this.inventory = inventory;
        this.list = inventory.getCreaturelist();

        this.mainFrame = new JFrame("Evolution");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(1280,720);
        this.mainFrame.setLayout(null);
        this.mainFrame.setResizable(false);

        printEvolutionFrames();
        printInventory(inventory);
        printButtons();
        printBackground();


        this.mainFrame.setVisible(true);
    }

    public void printInventory(Inventory inventory){

        InventoryView inventoryView = new InventoryView(inventory);
        inventoryView.printCreatureStats(list);

    }

    private void printBackground(){

        this.lblBg = new JLabel();
        this.bg = new ImageIcon("GuiMCO/EvolutionBackground.png");
        this.lblBg.setIcon(bg);
        this.lblBg.setBounds(0,0,1280,720);
        this.mainFrame.add(this.lblBg);
    }

    private void printEvolutionFrames(){

        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/EvolutionFrame.png");
        this.label.setIcon(this.img);
        this.label.setBounds(300,260,200,200);
        this.mainFrame.add(this.label);


        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/EvolutionFrame.png");
        this.label.setIcon(this.img);
        this.label.setBounds(750,260,200,200);
        this.mainFrame.add(this.label);


    }
    
    private void printButtons(){
        

        this.evoButton1 = new JButton("Choose");
        this.evoButton1.setBounds(300,180,200,50);
        this.evoButton1.setFocusable(false);
        this.mainFrame.add(this.evoButton1);

        this.evoButton2 = new JButton("Choose");
        this.evoButton2.setBounds(750,180,200,50);
        this.evoButton2.setFocusable(false);
        this.mainFrame.add(this.evoButton2);

        this.evolveButton = new JButton();
        this.img = new ImageIcon("GuiMCO/EvolveButton.png");
        this.evolveButton.setIcon(this.img);
        this.evolveButton.setBackground(new Color(247, 79, 79 ));
        this.evolveButton.setBounds(582,300,90,90);
        this.evolveButton.setFocusable(false);
        this.mainFrame.add(this.evolveButton);

        this.exitButton = new JButton("Exit");
        this.exitButton.setBounds(1130,60,100,50);
        this.exitButton.setFocusable(false);
        this.mainFrame.add(this.exitButton);


    }

    public void setEvoBtn1Listener(ActionListener actionListener){
        
        this.evoButton1.addActionListener(actionListener);

    }

    public void setEvoBtn2Listener(ActionListener actionListener){
        
        this.evoButton2.addActionListener(actionListener);

    }

    public void setEvolveBtnListener(ActionListener actionListener){
        
        this.evolveButton.addActionListener(actionListener);

    }

    public void setExitBtnListener(ActionListener actionListener){
        
        this.evolveButton.addActionListener(actionListener);

    }
}
