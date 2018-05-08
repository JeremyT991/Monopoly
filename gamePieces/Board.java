package Monopoly.gamePieces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Board {

  JFrame gameBoard;
  JFrame deedFrame;

  Deed[] spaces;

  Board() {
    //ten spaces on each side of the board, total 40;
    spaces = new Deed[40];
    for (int i = 0; i < 40; i++) {
      spaces[i] = new Builder().lookup(i);
    }

    gameBoard = new JFrame("Monopoly");

    // game tiles
    JPanel panelS = new JPanel();
    JPanel panelW = new JPanel();
    JPanel panelN = new JPanel();
    JPanel panelE = new JPanel();

    // menu bar
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exit = new JMenuItem("Exit");
    fileMenu.add(exit);
    menuBar.add(fileMenu);

    JButton[] button = new JButton[40];


    // Put properties onto screen
    for (int i = 10; i >= 0; i--) {
      button[i] = new JButton(spaces[i].getName());
      button[i].setPreferredSize(new Dimension(125, 125));
      panelS.add(BorderLayout.SOUTH, button[i]);
    }

    panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
    for (int i = 19; i > 10; i--) {
      button[i] = new JButton(spaces[i].getName());
      button[i].setPreferredSize(new Dimension(125, 125));
      panelW.add(BorderLayout.WEST, button[i]);
    }

    for (int i = 20; i <= 30; i++) {
      button[i] = new JButton(spaces[i].getName());
      button[i].setPreferredSize(new Dimension(125, 125));
      panelN.add(BorderLayout.NORTH, button[i]);
    }

    panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
    for (int i = 31; i < 40; i++) {
      button[i] = new JButton(spaces[i].getName());
      button[i].setPreferredSize(new Dimension(125, 125));
      panelE.add(BorderLayout.EAST, button[i]);
    }

    // Listeners
    for (int i = 0; i < 40; i++) {
      button[i].addActionListener(new DeedListener(i));
    }


    gameBoard.setJMenuBar(menuBar);
    gameBoard.getContentPane().add(BorderLayout.SOUTH, panelS);
    gameBoard.getContentPane().add(BorderLayout.WEST, panelW);
    gameBoard.getContentPane().add(BorderLayout.NORTH, panelN);
    gameBoard.getContentPane().add(BorderLayout.EAST, panelE);
    gameBoard.setSize(1200, 1200);
    gameBoard.setVisible(true);
    gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Board();  
  }
  
  public class DeedListener implements ActionListener {
    int property;

    DeedListener(int i) {
      property = i;
    }
    public void actionPerformed (ActionEvent ev) {
      deedFrame = new JFrame();
      JPanel deedPanel = new JPanel();
      JLabel nameLabel = new JLabel(spaces[property].getName());
      JLabel rentLabel = new JLabel("Rent $" + spaces[property].getRent(0));
      JLabel h1Label = new JLabel("with 1 House\t$" + spaces[property].getRent(1));
      JLabel h2Label = new JLabel("With 2 Houses\t$" + spaces[property].getRent(2));
      JLabel h3Label = new JLabel("With 3 Houses\t$" + spaces[property].getRent(3));
      JLabel h4Label = new JLabel("With 4 Houses\t$" + spaces[property].getRent(4));
      JLabel hotelLabel = new JLabel("With HOTEL $" + spaces[property].getRent(5));
      JLabel mortgageLabel = new JLabel("Mortgage Value $" + spaces[property].getMortgage());
      JLabel costLabel = new JLabel("Houses cost $" + spaces[property].getHouseCost() + " each.\n Hotels, $" + " plus 4 houses.");
      

      deedPanel.setLayout(new BoxLayout(deedPanel, BoxLayout.Y_AXIS));
      deedPanel.add(nameLabel);
      deedPanel.add(rentLabel);
      deedPanel.add(h1Label);
      deedPanel.add(h2Label);
      deedPanel.add(h3Label);
      deedPanel.add(h4Label);
      deedPanel.add(hotelLabel);
      deedPanel.add(mortgageLabel);
      deedPanel.add(costLabel);

      deedFrame.getContentPane().add(BorderLayout.CENTER, deedPanel);
      deedFrame.setSize(100, 400);
      deedFrame.setVisible(true);

    }
  }
}
