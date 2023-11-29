import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BattleScreenView {

    private JFrame mainFrame;
    private JLabel label;
    private JButton atkButton, swapButton, catchButton, runButton;
    private ImageIcon img;
    private JPanel panel, hpPanel;
    private GridBagConstraints gbc;

    public BattleScreenView(){

        Creature creature = new Creature("Chocolite", "Water", "F", 1);

        this.mainFrame = new JFrame("Battle Screen");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(1280,720);
        this.mainFrame.setLayout(null);
        this.mainFrame.setResizable(false);

        printBattleFrame();
        
        printEnemyStats(creature);

        printEnemyHP(creature);

        printActiveCreatureStats(creature);

        printButtons(creature);


        this.mainFrame.setVisible(true);
    }

    public void printBattleFrame(){

        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/BattleFrame.png");
        this.label.setIcon(this.img);
        this.label.setBounds(540,200,200,200);
        this.mainFrame.add(this.label);

    }

    public void printEnemyStats(Creature creature){
        
        this.label = new JLabel("Name: " + creature.getName());
        this.label.setBounds(800,200,200,100);
        this.mainFrame.add(this.label);

        this.label = new JLabel("Evo Level: " + creature.getLevel());
        this.label.setBounds(800,220,200,100);
        this.mainFrame.add(this.label);

        this.label = new JLabel();
        this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\"+creature.getType()+".png");
        Image resizedImg = resizeImage(this.img.getImage(), 80, 80);
        this.label.setIcon(new ImageIcon(resizedImg));
        this.label.setBounds(650,310,80,80);
        this.mainFrame.add(this.label);

        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/"+ creature.getName() +".png");
        this.label.setIcon(this.img);
        this.label.setBounds(540,200,200,200);
        this.mainFrame.add(this.label);

    }

    public void printEnemyHP(Creature creature) {

        int maxHP = creature.getHP();
        int hpPerBar = maxHP / 5;
        int currentHP = creature.getCurrentHP();

        this.panel = new JPanel(new GridBagLayout());

        this.label = new JLabel("HP: " + currentHP);
        this.img = new ImageIcon("GuiMCO/Heart.png");
        this.label.setIcon(this.img);
        this.label.setVerticalTextPosition(JLabel.TOP);
        this.label.setHorizontalTextPosition(JLabel.CENTER);
        this.label.setBounds(180,150,300,300);
        this.mainFrame.add(this.label);
        
        for (int i = hpPerBar; i <= currentHP; i += hpPerBar) {

            this.gbc = new GridBagConstraints();
            this.gbc.gridx = i; 
            this.gbc.gridy = 0;
            this.gbc.gridwidth = 1;
            this.gbc.gridheight = 1;
            this.gbc.fill = GridBagConstraints.BOTH;
            this.gbc.insets = new Insets(0, 10, 0, 0);
            
            this.hpPanel = new JPanel();
            this.hpPanel.setBackground(new Color(99, 201, 107));
            this.hpPanel.setPreferredSize(new Dimension(40,40));
            

            this.panel.add(this.hpPanel, this.gbc);
        }

        this.panel.setBounds(200,160,300,300);
        this.mainFrame.add(this.panel);

    }

    public void printActiveCreatureStats(Creature creature){

        this.label = new JLabel("Name: " + creature.getName());
        this.label.setBounds(400,350,300,300);
        this.mainFrame.add(this.label);

        this.label = new JLabel("Evo Level: " + creature.getLevel());
        this.label.setBounds(400,380,300,300);
        this.mainFrame.add(this.label);

        this.label = new JLabel();
        this.img = new ImageIcon("GuiMCO/"+ creature.getType() +".png");
        Image resizedImg = resizeImage(this.img.getImage(), 80, 80);
        this.label.setIcon(new ImageIcon(resizedImg));
        this.label.setBounds(310,475,80,80);
        this.mainFrame.add(this.label);


    }

    public void printButtons(Creature creature){
        
        this.atkButton = new JButton();
        this.img = new ImageIcon("GuiMCO/"+ creature.getType() +"Atk.png");
        this.atkButton.setIcon(this.img);
        this.atkButton.setBounds(550,475,80,80);
        this.atkButton.setBackground(Color.black);
        this.mainFrame.add(this.atkButton);

        this.swapButton = new JButton();
        this.img = new ImageIcon("GuiMCO/Swap.png");
        this.swapButton.setIcon(this.img);
        this.swapButton.setBounds(650,475,80,80);
        this.swapButton.setBackground(Color.black);
        this.mainFrame.add(this.swapButton);

        this.catchButton = new JButton();
        this.img = new ImageIcon("GuiMCO/Catch.png");
        this.catchButton.setIcon(this.img);
        this.catchButton.setBounds(750,475,80,80);
        this.catchButton.setBackground(Color.black);
        this.mainFrame.add(this.catchButton);

        this.runButton = new JButton();
        this.img = new ImageIcon("GuiMCO/Run.png");
        this.runButton.setIcon(this.img);
        this.runButton.setBounds(850,475,80,80);
        this.runButton.setBackground(Color.black);
        this.mainFrame.add(this.runButton);


    }

    public void setAtkBtnListener(ActionListener actionListener) {
		this.atkButton.addActionListener(actionListener);
	}

    public void setSwapBtnListener(ActionListener actionListener) {
		this.swapButton.addActionListener(actionListener);
	}

    public void setCatchBtnListener(ActionListener actionListener) {
		this.catchButton.addActionListener(actionListener);
	}

    public void setRunBtnListener(ActionListener actionListener) {
		this.runButton.addActionListener(actionListener);
	}
    
    public Image resizeImage(Image originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(originalImage, 0, 0, width, height, null);
        g2d.dispose();
        return resizedImage;
    }
    
    
}
