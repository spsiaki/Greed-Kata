
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JFrame;

public class GameWindow {
    
    private JFrame frame;
    private ScoreCalculator scoreCalc;
    private JTextField score;

    public GameWindow(ScoreCalculator calc)
    {
        
        scoreCalc = calc;
        frame = new JFrame("Greed Kata");
        score = new JTextField();
        
        JButton rollButton = new JButton("Roll");
        
        JButton quitButton = new JButton("Quit");
        
        rollButton.addActionListener(e -> roll());
        
        quitButton.addActionListener(e -> frame.dispose());
        
        
        JPanel buttonPanel = new JPanel();
        
        
        buttonPanel.add(rollButton);
        buttonPanel.add(quitButton);
        
        
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        
        frame.setVisible(true);
        
        frame.setSize(500, 400);
        
    }
    
    /**
     * Called when the "roll" button is clicked, updates frame
     * to reflect a new roll of 5 dice, and the score of the roll.
     */
    public void roll()
    {
        //Clears score from previous role
        score.setText("");
        
        //Creates dice rectangles
        Dice d = new Dice(scoreCalc.roll());
        
        //Adds dice to frame
        frame.getContentPane().add(d, BorderLayout.CENTER);
        
        
        score.setText("Score: " + scoreCalc.findBestScore() + " points");
        
        frame.getContentPane().add(score, BorderLayout.NORTH);
        
        frame.setVisible(true);
        
    }
}
