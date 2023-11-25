package GuiMCO;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class InventoryView {

    private JFrame mainFrame;
    private JLabel label;
    private JPanel centerPanel, panel, nestedPanel;
    private JButton button;
    private JLayeredPane layeredPane;

    // Creature
    private ImageIcon img;
    private String name, type, family;
    private int lvl;

    public InventoryView() {

        this.mainFrame = new JFrame("Inventory");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setSize(1280, 720);
        this.mainFrame.setResizable(false);

        this.centerPanel = new JPanel();
        this.centerPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.centerPanel.setPreferredSize(new Dimension(1280,620));
        this.mainFrame.add(this.centerPanel);

        // JUST FOR DEMO
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Strawander", "Fire", "1", 1));
        creatures.add(new Creature("Chocowool", "Fire", "2", 1));
        creatures.add(new Creature("Parfwit", "Fire", "3", 1));
        creatures.add(new Creature("Brownisaur", "Grass", "4", 1));
        creatures.add(new Creature("Frubat", "Grass", "5", 1));
        creatures.add(new Creature("Malts", "Grass", "6", 1));
        
        // Call the method with the creatures list
        printCreatureStats(creatures);

        this.nestedPanel = new JPanel();
        this.label = new JLabel("Active Creature");
        this.button = new JButton("Change active creature");
        this.button.setPreferredSize(new Dimension(190, 50));
        this.panel = new JPanel(new BorderLayout());

        // change img to active creature
        // maybe active creature will get called and passed here
        this.label.setIcon(img);

        this.label.setHorizontalTextPosition(JLabel.CENTER);
        this.label.setVerticalTextPosition(JLabel.TOP);
        this.label.setIconTextGap(-10);

        nestedPanel.setLayout(new BoxLayout(nestedPanel, BoxLayout.Y_AXIS));
        nestedPanel.add(this.label);
        nestedPanel.add(this.button);

        this.panel.add(nestedPanel, BorderLayout.EAST);
        this.panel.add(new JPanel(), BorderLayout.SOUTH);
        this.mainFrame.add(this.panel, BorderLayout.SOUTH);

        this.mainFrame.setVisible(true);

    }

    public void printCreatureStats(ArrayList<Creature> creatures) {
        for (Creature creature : creatures) {

            this.name = creature.getName();
            this.type = creature.getType();
            this.family = creature.getFamily();
            this.lvl = creature.getLevel();

            this.panel = new JPanel();
            this.panel.setLayout(null);
            this.panel.setPreferredSize(new Dimension(300,200));
            this.panel.setBackground(new Color(200, 200, 200));

            // Create labels and add them to the panel
            this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\" + name + ".png");
            this.label = new JLabel(name);
            this.label.setIcon(img);
            this.label.setBounds(0,0,300,200);
            this.label.setVerticalTextPosition(JLabel.TOP);
            this.label.setHorizontalTextPosition(JLabel.CENTER);
            this.label.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
            this.label.setIconTextGap(-15);
            this.panel.add(this.label);

            this.label = new JLabel("Family: " + family);
            this.label.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
            this.label.setBounds(150,-30,200,200);
            this.panel.add(this.label);

            this.label = new JLabel("Type: " + type);
            this.label.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
            this.label.setBounds(150,-5,200,200);
            this.panel.add(this.label);

            this.label = new JLabel("Evo Level: " + lvl);
            this.label.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
            this.label.setBounds(150,20,200,200);
            this.panel.add(this.label);

            //Add the whole creature's stats to the center panel of the frame
            this.centerPanel.add(this.panel);
        }
    }
}
