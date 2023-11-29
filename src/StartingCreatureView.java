package GuiMCO;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartingCreatureView {

    public JFrame mainFrame;
    private ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,fireImg,grassImg,waterImg;
    private JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,fireLbl,grassLbl,waterLbl,startText;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private JPanel pnl1,pnl2,pnl3,pnl4,pnl5,pnl6,pnl7,pnl8,pnl9;

    public StartingCreatureView(){
        
        this.mainFrame = new JFrame("Starting Creature");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.mainFrame.setSize(1280, 720);
        this.mainFrame.setResizable(false);

        // -START- Printing images

        this.startText = new JLabel("PICK YOUR STARTING CREATURE!");

        this.fireLbl = new JLabel();
        this.fireImg = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Fire.png");
        this.fireLbl.setIcon(this.fireImg);

        this.grassLbl = new JLabel();
        this.grassImg = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Grass.png");
        this.grassLbl.setIcon(this.grassImg);
        
        this.waterLbl = new JLabel();
        this.waterImg = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Water.png");
        this.waterLbl.setIcon(this.waterImg);

        this.lbl1 = new JLabel("Strawander");
        this.img1 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Strawander.png");
        this.lbl1.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl1.setIcon(this.img1);

        this.lbl2 = new JLabel("Chocowool");
        this.img2 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Chocowool.png");
        this.lbl2.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl2.setIcon(this.img2);

        this.lbl3 = new JLabel("Parfwit");
        this.img3 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Parfwit.png");
        this.lbl3.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl3.setIcon(this.img3);

        this.lbl4 = new JLabel("Brownisaur");
        this.img4 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Brownisaur.png");
        this.lbl4.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl4.setIcon(this.img4);

        this.lbl5 = new JLabel("Frubat");
        this.img5 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Frubat.png");
        this.lbl5.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl5.setIcon(this.img5);

        this.lbl6 = new JLabel("Malts");
        this.img6 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Malts.png");
        this.lbl6.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl6.setIcon(this.img6);

        this.lbl7 = new JLabel("Squirpie");
        this.img7 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Squirpie.png");
        this.lbl7.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl7.setIcon(this.img7);

        this.lbl8 = new JLabel("Chocolite");
        this.img8 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Chocolite.png");
        this.lbl8.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl8.setIcon(this.img8);

        this.lbl9 = new JLabel("Oshacone");
        this.img9 = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Oshacone.png");
        this.lbl9.setFont(new Font("Calibri Bold", Font.PLAIN, 20));
        this.lbl9.setIcon(this.img9);

        // -END- Printing images

        // -START- Printing of buttons

        this.btn1 = new JButton("Family A");
        this.btn1.setPreferredSize(new Dimension(220, 30));
        
        this.btn2 = new JButton("Family B");
        this.btn2.setPreferredSize(new Dimension(220, 30));

        this.btn3 = new JButton("Family C");
        this.btn3.setPreferredSize(new Dimension(220, 30));

        this.btn4 = new JButton("Family D");
        this.btn4.setPreferredSize(new Dimension(220, 30));

        this.btn5 = new JButton("Family E");
        this.btn5.setPreferredSize(new Dimension(220, 30));

        this.btn6 = new JButton("Family F");
        this.btn6.setPreferredSize(new Dimension(220, 30));

        this.btn7 = new JButton("Family G");
        this.btn7.setPreferredSize(new Dimension(220, 30));

        this.btn8 = new JButton("Family H");
        this.btn8.setPreferredSize(new Dimension(220, 30));

        this.btn9 = new JButton("Family I");
        this.btn9.setPreferredSize(new Dimension(220, 30));


        // -END- Printing of buttons

        // -START- Panels

        this.pnl1 = new JPanel();
        this.pnl1.setBackground(new Color(255, 55, 55));
        this.pnl1.add(this.lbl1);
        this.pnl1.add(this.btn1);
        this.pnl1.setPreferredSize(new Dimension(300,200));
        this.pnl1.setBorder(BorderFactory.createLineBorder(new Color(168, 38, 38), 4));

        this.mainFrame.add(this.fireLbl);
        this.mainFrame.add(this.pnl1);

        this.pnl2 = new JPanel();
        this.pnl2.setBackground(new Color(255, 55, 55));
        this.pnl2.add(this.lbl2);
        this.pnl2.add(this.btn2);
        this.pnl2.setPreferredSize(new Dimension(300,200));
        this.pnl2.setBorder(BorderFactory.createLineBorder(new Color(168, 38, 38), 4));
        this.mainFrame.add(this.pnl2);

        this.pnl3 = new JPanel();
        this.pnl3.setBackground(new Color(255, 55, 55));
        this.pnl3.add(this.lbl3);
        this.pnl3.add(this.btn3);
        this.pnl3.setPreferredSize(new Dimension(300,200));
        this.pnl3.setBorder(BorderFactory.createLineBorder(new Color(168, 38, 38), 4));
        this.mainFrame.add(this.pnl3);

        this.pnl4 = new JPanel();
        this.pnl4.setBackground(new Color(82, 188, 85 ));
        this.pnl4.add(this.lbl4);
        this.pnl4.add(this.btn4);
        this.pnl4.setPreferredSize(new Dimension(300,200));
        this.pnl4.setBorder(BorderFactory.createLineBorder(new Color(35, 126, 59), 4));

        this.mainFrame.add(this.grassLbl);
        this.mainFrame.add(this.pnl4);

        this.pnl5 = new JPanel();
        this.pnl5.setBackground(new Color(82, 188, 85 ));
        this.pnl5.add(this.lbl5);
        this.pnl5.add(this.btn5);
        this.pnl5.setPreferredSize(new Dimension(300,200));
        this.pnl5.setBorder(BorderFactory.createLineBorder(new Color(35, 126, 59), 4));
        this.mainFrame.add(this.pnl5);

        this.pnl6 = new JPanel();
        this.pnl6.setBackground(new Color(82, 188, 85 ));
        this.pnl6.add(this.lbl6);
        this.pnl6.add(this.btn6);
        this.pnl6.setPreferredSize(new Dimension(300,200));
        this.pnl6.setBorder(BorderFactory.createLineBorder(new Color(35, 126, 59), 4));
        this.mainFrame.add(this.pnl6);

        this.pnl7 = new JPanel();
        this.pnl7.setBackground(new Color(79, 223, 228));
        this.pnl7.add(this.lbl7);
        this.pnl7.add(this.btn7);
        this.pnl7.setPreferredSize(new Dimension(300,200));
        this.pnl7.setBorder(BorderFactory.createLineBorder(new Color(43, 135, 147), 4));

        this.mainFrame.add(this.waterLbl);
        this.mainFrame.add(this.pnl7);

        this.pnl8 = new JPanel();
        this.pnl8.setBackground(new Color(79, 223, 228));
        this.pnl8.add(this.lbl8);
        this.pnl8.add(this.btn8);
        this.pnl8.setPreferredSize(new Dimension(300,200));
        this.pnl8.setBorder(BorderFactory.createLineBorder(new Color(43, 135, 147), 4));
        this.mainFrame.add(this.pnl8);

        this.pnl9 = new JPanel();
        this.pnl9.setBackground(new Color(79, 223, 228));
        this.pnl9.add(this.lbl9);
        this.pnl9.add(this.btn9);
        this.pnl9.setPreferredSize(new Dimension(300,200));
        this.pnl9.setBorder(BorderFactory.createLineBorder(new Color(43, 135, 147), 4));
        this.mainFrame.add(this.pnl9);  

        // -END- Panels

        this.startText.setFont(new Font("Calibri Bold", Font.PLAIN, 60));
        this.startText.setForeground(Color.white);
        this.mainFrame.add(startText);

        this.mainFrame.getContentPane().setBackground(Color.black);
        this.mainFrame.setVisible(true);

    }

    public void addButton1(ActionListener actionListener){

        this.btn1.addActionListener(actionListener);
    }

    public void addButton2(ActionListener actionListener){

        this.btn2.addActionListener(actionListener);
    }

    public void addButton3(ActionListener actionListener){

        this.btn3.addActionListener(actionListener);
    }

    public void addButton4(ActionListener actionListener){

        this.btn4.addActionListener(actionListener);
    }

    public void addButton5(ActionListener actionListener){

        this.btn5.addActionListener(actionListener);
    }

    public void addButton6(ActionListener actionListener){

        this.btn6.addActionListener(actionListener);
    }

    public void addButton7(ActionListener actionListener){

        this.btn7.addActionListener(actionListener);
    }

    public void addButton8(ActionListener actionListener){

        this.btn8.addActionListener(actionListener);
    }

    public void addButton9(ActionListener actionListener){

        this.btn9.addActionListener(actionListener);
    }
    
}
