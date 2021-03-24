
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

import javax.swing.JButton;

import javax.swing.JFrame;

public class GameWindow {

    public GameWindow()
    {
        JFrame frame = new JFrame("Greed Kata");
        
        JButton rollButton = new JButton("Roll");
        
        JPanel buttonPanel = new JPanel();
        
        JPanel dice = new JPanel();
        
        dice.setBounds(100, 100, 50, 50);
        
        Rectangle rect = new Rectangle(4, 4);
        
        buttonPanel.add(rollButton);
        
       
        
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        frame.getContentPane().add(dice, BorderLayout.CENTER);
        
        frame.setVisible(true);
        
        frame.setSize(500, 400);
        
    }
}
