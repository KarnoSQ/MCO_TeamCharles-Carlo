import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InventoryView {

    private JLabel label;
    private JOptionPane popUp;

    public JFrame mainFrame;
    public JPanel centerPanel, panel, nestedPanel;
    public JRadioButton btn,btn1,btn2,btn3,btn4,btn5,btn6;
    public JButton exitButton;
    public ButtonGroup group;
    public ArrayList<JRadioButton> buttons = new ArrayList<>();
    public Inventory inventory;
    private ImageIcon invBg;
    private JLabel invenBg;

    // Creature List
    ArrayList<Creatures> creatures;
    CreatureInfo creatureInfo;

    // Individual Creatures
    private ImageIcon img;
    private String name, type;
    private char family;
    private int lvl;

    public InventoryView(Inventory inventory) {

        this.inventory = inventory;

        this.mainFrame = new JFrame("Inventory");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setSize(1280, 720);
        this.mainFrame.setResizable(false);
        

        this.centerPanel = new JPanel();
        this.centerPanel.setLayout(new GridLayout(2,3));
        this.centerPanel.setPreferredSize(new Dimension(1280,620));
        this.mainFrame.add(this.centerPanel);

        buttons.add(btn1 = new JRadioButton("Set Active"));
        buttons.add(btn2 = new JRadioButton("Set Active"));
        buttons.add(btn3 = new JRadioButton("Set Active"));
        buttons.add(btn4 = new JRadioButton("Set Active"));
        buttons.add(btn5 = new JRadioButton("Set Active"));
        buttons.add(btn6 = new JRadioButton("Set Active"));

        this.group = new ButtonGroup();

        this.group.add(btn1);
        this.group.add(btn2);
        this.group.add(btn3);
        this.group.add(btn4);
        this.group.add(btn5);
        this.group.add(btn6);

        creatures = inventory.getCreaturelist();

        printCreatureStats(creatures);

        this.nestedPanel = new JPanel();
        this.label = new JLabel("Active Creature");

        // change img to active creature
        // maybe active creature will get called and passed here
        this.label.setIcon(img);
        this.label.setHorizontalTextPosition(JLabel.CENTER);
        this.label.setVerticalTextPosition(JLabel.TOP);
        this.label.setIconTextGap(-10);

        nestedPanel.setLayout(new BoxLayout(nestedPanel, BoxLayout.Y_AXIS));
        nestedPanel.add(this.label);

        // Exit Button
        this.panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        this.exitButton = new JButton("Exit");
        this.exitButton.setFocusable(false);
        this.exitButton.setPreferredSize(new Dimension(110,60));
        this.exitButton.setFont(new Font("Calibri Bold", Font.PLAIN, 40));
        this.panel.add(this.exitButton);
        this.mainFrame.add(this.panel, BorderLayout.NORTH);


        this.panel = new JPanel(new BorderLayout());
        this.panel.add(nestedPanel, BorderLayout.EAST);
        this.panel.add(new JPanel(), BorderLayout.SOUTH);
        this.mainFrame.add(this.panel, BorderLayout.SOUTH);

        this.mainFrame.setVisible(true);

    }

        public void printCreatureStats(ArrayList<Creatures> creatures2) {

        int counter = 0;

        for (Creatures creature : creatures) {

            this.name = creatureInfo.getName();
            this.type = creatureInfo.getType();
            this.family = creatureInfo.getFamily();
            this.lvl = creatureInfo.getEvo();

            this.panel = new JPanel();
            this.panel.setLayout(null);
            this.panel.setPreferredSize(new Dimension(300,200));

            // Create labels and add them to the panel
            this.img = new ImageIcon("GuiMCO/" + name + ".png");
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

            this.btn = new JRadioButton();
            this.btn = buttons.get(counter);
            this.btn.setBounds(170,130,90,20);
            this.panel.add(this.btn);
            

            //Add the whole creature's stats to the center panel of the frame

            this.centerPanel.add(this.panel);

            this.centerPanel.revalidate();
            this.centerPanel.repaint();

            
            counter++;

            }

    }

        public void printCreatureFound(){

            this.popUp.showMessageDialog(null, "Active Creature Changed!", "Success!", JOptionPane.PLAIN_MESSAGE);

        }

        public void printCreatureNotFound(){

            this.popUp.showMessageDialog(null, "Creature Not Found!", "Failed!", JOptionPane.PLAIN_MESSAGE);
            
        }

        public void setBtn1Listener(ActionListener actionListener) {
            this.btn1.addActionListener(actionListener);
        }

        public void setBtn2Listener(ActionListener actionListener) {
            this.btn2.addActionListener(actionListener);
        }

        public void setBtn3Listener(ActionListener actionListener) {
            this.btn3.addActionListener(actionListener);
        }

        public void setBtn4Listener(ActionListener actionListener) {
            this.btn4.addActionListener(actionListener);
        }

        public void setBtn5Listener(ActionListener actionListener) {
            this.btn5.addActionListener(actionListener);
        }

        public void setBtn6Listener(ActionListener actionListener) {
            this.btn6.addActionListener(actionListener);
        }
 

}
