package GuiMCO;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MainMenuView {

    JFrame mainFrame;
    JLabel fireGifLbl;
    ImageIcon fireGifImg;
    JLayeredPane layeredPane;
    JButton invBtn,explrBtn,EvoBtn,ExtBtn;

    public MainMenuView(){

        this.mainFrame = new JFrame("Main Menu");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainFrame.setLayout(null);
		this.mainFrame.setSize(1280, 720);
        this.mainFrame.setResizable(false);

        // -START- Background gif

        this.layeredPane = new JLayeredPane();
        this.fireGifImg = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\MainMenuScreen.gif");

        this.fireGifLbl = new JLabel();
        this.fireGifLbl.setIcon(this.fireGifImg);
        this.fireGifLbl.setBounds(0,0,1280,720);

        this.layeredPane.setBounds(0,0,1280,720);
        this.layeredPane.add(this.fireGifLbl, Integer.valueOf(0));

        // -END- Background gif

        // -START- Buttons

        
        this.invBtn = new JButton("Inventory");
        this.invBtn.setBounds(219,303,316, 115);
        this.invBtn.setFont(new Font("Georgia Bold", Font.PLAIN, 40));
        this.layeredPane.add(this.invBtn, Integer.valueOf(1));
        

        this.explrBtn = new JButton("Explore");
        this.explrBtn.setBounds(745,303,316, 115);
        this.explrBtn.setFont(new Font("Georgia Bold", Font.PLAIN, 40));
        this.layeredPane.add(this.explrBtn, Integer.valueOf(1));
        

        this.EvoBtn = new JButton("Evolve");
        this.EvoBtn.setBounds(482,509,316, 115);
        this.EvoBtn.setFont(new Font("Georgia Bold", Font.PLAIN, 40));
        this.layeredPane.add(this.EvoBtn, Integer.valueOf(1));
        

        this.invBtn = new JButton("Exit");
        this.invBtn.setBounds(1020,580,190, 70);
        this.invBtn.setFont(new Font("Georgia Bold", Font.PLAIN, 40));
        this.layeredPane.add(this.invBtn, Integer.valueOf(1));

        this.mainFrame.add(this.layeredPane);

        this.mainFrame.setVisible(true);
    }

	public void setInvntryBtnListener(ActionListener actionListener){

        this.invBtn.addActionListener(actionListener);

    }

    	public void setExplrBtnListener(ActionListener actionListener){

        this.explrBtn.addActionListener(actionListener);

    }

   	public void setEvolBtnListener(ActionListener actionListener){

        this.EvoBtn.addActionListener(actionListener);

    }

    	public void setExitBtnListener(ActionListener actionListener){

        this.ExtBtn.addActionListener(actionListener);

    }
    
}
