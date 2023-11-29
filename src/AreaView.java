import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AreaView{

    private ImageIcon img, playerImg;
    public JFrame mainFrame;
    public int passArea;
    private JLabel label,playerLabel;
    public JPanel panel,areaPanels,controllerPanel,controllerBackPanel,areaTitlePanel, exitPanel;
    private JButton upButton,leftButton,righButton,downButton,exitButton;
    private GridBagConstraints gbc;
    private JOptionPane optionPane;
    private AreaModel model;

    public AreaView(int selectedArea, AreaModel model){

        this.model = model;
        this.passArea = selectedArea;  

        // Frame
        this.mainFrame = new JFrame("Area");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setSize(1280,720);
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setResizable(false);

        // Area title
        this.areaTitlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.label = new JLabel("Area "+ passArea);
        this.label.setFont(new Font("Calibri Bold", Font.PLAIN, 60));
        this.areaTitlePanel.add(this.label);
        this.mainFrame.add(this.areaTitlePanel, BorderLayout.NORTH);
        
        // Player Icon
        this.playerImg = new ImageIcon("GuiMCO/Character.png");
        this.playerLabel = new JLabel();
        this.playerLabel.setIcon(playerImg);

        printArea(passArea);

        printKeypad(passArea);

        printExitBtn();
        
        this.mainFrame.setVisible(true);

    }

    public void printArea(int area){

        this.panel = new JPanel();

        if (area == 1) {

            this.panel.setLayout(new GridBagLayout());

            // Get Player X Value
            int xValue = model.getX();

        
            for (int i = 0; i < 5; i++) {

                this.gbc = new GridBagConstraints();
                this.gbc.gridx = i; 
                this.gbc.gridy = 0;
                this.gbc.gridwidth = 1;
                this.gbc.gridheight = 1;
                this.gbc.fill = GridBagConstraints.BOTH;
                this.gbc.insets = new Insets(0, 10, 0, 0);
                
                this.areaPanels = new JPanel();
                this.areaPanels.setBackground(new Color(99, 201, 107));
                this.areaPanels.setPreferredSize(new Dimension(100,100));

                if(xValue == i){

                    this.areaPanels.add(this.playerLabel);

                }
                
                this.panel.add(this.areaPanels, this.gbc);

            }
            
            this.mainFrame.add(this.panel, BorderLayout.CENTER);

        } else if (area == 2) {

            int xValue = model.getX();
            int yValue = model.getY();

            this.panel.setLayout(new GridBagLayout());
        
            for (int row = 0; row < 3; row++) {

                for (int col = 0; col < 3; col++) {

                    this.gbc = new GridBagConstraints();
                    this.gbc.gridx = col;
                    this.gbc.gridy = row;
                    this.gbc.gridwidth = 1;
                    this.gbc.gridheight = 1;
                    this.gbc.fill = GridBagConstraints.BOTH;
                    this.gbc.insets = new Insets(10, 10, 10, 10);
        
                    this.areaPanels = new JPanel();
                    this.areaPanels.setBackground(new Color(99, 201, 107));
                    this.areaPanels.setPreferredSize(new Dimension(100, 100));

                    if(xValue == row && yValue == col){

                        this.areaPanels.add(this.playerLabel);
                    }
        
                    this.panel.add(this.areaPanels, this.gbc);
                }
            }
        
            this.mainFrame.add(this.panel, BorderLayout.CENTER);

        } else if(area == 3){

            double xValue = model.getX();
            double yValue = model.getY();

            this.panel.setLayout(new GridBagLayout());
        
            for (int row = 0; row < 4; row++) {

                for (int col = 0; col < 4; col++) {

                    this.gbc = new GridBagConstraints();
                    this.gbc.gridx = col;
                    this.gbc.gridy = row;
                    this.gbc.gridwidth = 1;
                    this.gbc.gridheight = 1;
                    this.gbc.fill = GridBagConstraints.BOTH;
                    this.gbc.insets = new Insets(10, 10, 10, 10);
        
                    this.areaPanels = new JPanel();
                    this.areaPanels.setBackground(new Color(99, 201, 107));
                    this.areaPanels.setPreferredSize(new Dimension(100, 100));

                    if(xValue == row && yValue == col){

                        this.areaPanels.add(this.playerLabel);
                    }
        
                    this.panel.add(this.areaPanels, this.gbc);
                }
            }
        
            this.mainFrame.add(this.panel, BorderLayout.CENTER);

        }

    }

    
    public void printKeypad(int area){

        this.controllerBackPanel = new JPanel();

        if (area == 1) {

            
            this.controllerBackPanel.setLayout(new GridBagLayout());
        
            for (int i = 0; i < 3; i++) {

                this.controllerPanel = new JPanel();
                this.gbc = new GridBagConstraints();

                this.gbc.gridx = i; 
                this.gbc.gridy = 0;
                this.gbc.gridwidth = 1;
                this.gbc.gridheight = 1;
                this.gbc.fill = GridBagConstraints.BOTH;
                this.gbc.insets = new Insets(0, 10, 0, 0);

                if(i == 0){
                    
                    this.leftButton = new JButton();
                    this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Left.png");
                    this.leftButton.setIcon(img);
                    this.leftButton.setBackground(Color.black);
                    this.leftButton.setPreferredSize(new Dimension(70,70));
                    this.leftButton.setFocusable(false);
                    this.controllerPanel.add(this.leftButton);

                } else if(i == 2){

                    this.righButton = new JButton();
                    this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Right.png");
                    this.righButton.setIcon(img);
                    this.righButton.setBackground(Color.black);
                    this.righButton.setPreferredSize(new Dimension(70,70));
                    this.righButton.setFocusable(false);
                    this.controllerPanel.add(this.righButton);
                }

                this.controllerPanel.setBackground(Color.black);
                this.controllerPanel.setPreferredSize(new Dimension(70,70));

                this.controllerBackPanel.add(this.controllerPanel, this.gbc);
            }
        
            this.mainFrame.add(this.controllerBackPanel, BorderLayout.WEST);

        } else if (area == 2 || area == 3) {

            this.controllerBackPanel.setLayout(new GridBagLayout());
        
            for (int row = 0; row < 3; row++) {

                for (int col = 0; col < 3; col++) {

                    this.controllerPanel = new JPanel();
                    this.label = new JLabel();
                    this.gbc = new GridBagConstraints();
                    
                    this.gbc.gridx = col;
                    this.gbc.gridy = row;
                    this.gbc.gridwidth = 1;
                    this.gbc.gridheight = 1;
                    this.gbc.fill = GridBagConstraints.BOTH;
                    this.gbc.insets = new Insets(10, 10, 10, 10);
    

                    if (row == 0 && col == 1){ 

                        this.upButton = new JButton();
                        this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Up.png");
                        this.upButton.setIcon(img);
                        this.upButton.setBackground(Color.black);
                        this.upButton.setPreferredSize(new Dimension(70,70));
                        this.upButton.setFocusable(false);
                        this.controllerPanel.add(this.upButton);
                        

                    }  
                    else if(row == 1 && col == 0){

                        this.leftButton = new JButton();
                        this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Left.png");
                        this.leftButton.setIcon(img);
                        this.leftButton.setBackground(Color.black);
                        this.leftButton.setPreferredSize(new Dimension(70,70));
                        this.leftButton.setFocusable(false);
                        this.controllerPanel.add(this.leftButton);

                    }  
                    else if(row == 1 && col == 1){

                        this.controllerPanel.setBackground(Color.BLACK);
                        

                    }  
                    else if(row == 1 && col == 2){

                        this.righButton = new JButton();
                        this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Right.png");
                        this.righButton.setIcon(img);
                        this.righButton.setBackground(Color.black);
                        this.righButton.setPreferredSize(new Dimension(70,70));
                        this.righButton.setFocusable(false);
                        this.controllerPanel.add(this.righButton);

                    }   
                    else if (row == 2 && col == 1) {  
                        
                        this.downButton = new JButton();
                        this.img = new ImageIcon("C:\\Users\\Charles\\VSCODE\\GuiMCO\\Down.png");
                        this.downButton.setIcon(img);
                        this.downButton.setBackground(Color.black);
                        this.downButton.setPreferredSize(new Dimension(70,70));
                        this.downButton.setFocusable(false);
                        this.controllerPanel.add(this.downButton);
                    
                    } else {

                    this.controllerPanel.setBackground(new Color(238, 238, 238));

                    }

                    this.controllerPanel.setPreferredSize(new Dimension(70, 70));
        
                    this.controllerBackPanel.add(this.controllerPanel, this.gbc);
                }
            }
        
            this.mainFrame.add(this.controllerBackPanel, BorderLayout.WEST);

        } 

    }

    public void printExitBtn(){

        this.exitPanel = new JPanel();
        this.exitButton = new JButton("Exit");
        this.exitButton.setPreferredSize(new Dimension(100,50));
        this.exitButton.setFocusable(false);
        this.exitPanel.add(this.exitButton);
        this.mainFrame.add(this.exitPanel,BorderLayout.EAST);
        
    }
    
    public void updateArea1View() {

        int xValue = model.getX();
        this.panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;

        panel.removeAll();

        for (int col = 0; col < 5; col++) {
            JPanel areaPanel = new JPanel();
            areaPanel.setBackground(new Color(99, 201, 107));
            areaPanel.setPreferredSize(new Dimension(100, 100));
            gbc.gridx = col;
            gbc.insets = new Insets(0, 10, 0, 0);
            
            if(col == xValue){

                areaPanel.add(playerLabel);

            }

            panel.add(areaPanel, gbc);

        }

        mainFrame.add(panel, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public void updateAreaView() {

        int xValue = model.getX();
        int yValue = model.getY();
        this.panel.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);

        panel.removeAll();

        if(this.passArea == 2){

        for (int row = 0; row < 3; row++){

        for (int col = 0; col < 3; col++) {

            JPanel areaPanel = new JPanel();
            areaPanel.setBackground(new Color(99, 201, 107));
            areaPanel.setPreferredSize(new Dimension(100, 100));
            gbc.gridx = col;
            gbc.gridy = row;
            
            if(col == xValue && row == yValue){

                areaPanel.add(playerLabel);

            }

            panel.add(areaPanel, gbc);

        }

        }

            mainFrame.add(panel, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();

        } else if(this.passArea == 3){

            for (int row = 0; row < 4; row++){

            for (int col = 0; col < 4; col++) {

            JPanel areaPanel = new JPanel();
            areaPanel.setBackground(new Color(99, 201, 107));
            areaPanel.setPreferredSize(new Dimension(100, 100));
            gbc.gridx = col;
            gbc.gridy = row;
            
            if(col == xValue && row == yValue){

                areaPanel.add(playerLabel);

            }

            panel.add(areaPanel, gbc);

        }

        }

            mainFrame.add(panel, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();

        }
    }
    
    public void invalidMove(){

        this.optionPane.showMessageDialog(null, "You cannot go there!", "Invalid input", JOptionPane.PLAIN_MESSAGE);
    }

    public void setUpBtnListener(ActionListener actionListener) {
		this.upButton.addActionListener(actionListener);
	}

    public void setLeftBtnListener(ActionListener actionListener) {
		this.leftButton.addActionListener(actionListener);
	}

    public void setRightBtnListener(ActionListener actionListener) {
		this.righButton.addActionListener(actionListener);
	}

    public void setDownBtnListener(ActionListener actionListener) {
		this.downButton.addActionListener(actionListener);
	}

    public void setExitBtnListener(ActionListener actionListener) {
        this.exitButton.addActionListener(actionListener);
    }

}
