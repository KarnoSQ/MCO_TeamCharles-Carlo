package GuiMCO;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EvolutionView {

    private JFrame mainFrame;
    private JLabel label;
    private ImageIcon img;
    private JButton evoButton1, evoButton2, evolveButton;

    public EvolutionView(){

        this.mainFrame = new JFrame("Evolution");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(1280,720);
        this.mainFrame.setLayout(null);
        this.mainFrame.setResizable(false);

        printEvolutionFrames();
        printButtons();


        this.mainFrame.setVisible(true);
    }

    private void printEvolutionFrames(){

        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/EvolutionFrame.png");
        this.label.setIcon(this.img);
        this.label.setBounds(300,200,200,200);
        this.mainFrame.add(this.label);


        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/EvolutionFrame.png");
        this.label.setIcon(this.img);
        this.label.setBounds(750,200,200,200);
        this.mainFrame.add(this.label);



    }
    
    private void printButtons(){

        this.evoButton1 = new JButton("Choose");
        this.evoButton1.setBounds(300,120,200,50);
        this.mainFrame.add(this.evoButton1);

        this.evoButton2 = new JButton("Choose");
        this.evoButton2.setBounds(750,120,200,50);
        this.mainFrame.add(this.evoButton2);

        this.evolveButton = new JButton();
        this.img = new ImageIcon("GuiMCO/EvolveButton.png");
        this.evolveButton.setIcon(this.img);
        this.evolveButton.setBackground(Color.black);
        this.evolveButton.setBounds(582,260,90,90);
        this.mainFrame.add(this.evolveButton);
    }
}
