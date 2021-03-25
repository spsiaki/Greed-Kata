
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JFrame;

/**
 * GUI class. Creates a game window that will display the dice
 * values. Uses buttons to control the state of the game, as well
 * as an instance of ScoreCalculator to roll the dice and calculate
 * the score of a given roll.
 * 
 * @author Sarah Psiaki
 * @version 03.24.21
 *
 */
public class GameWindow {
    
    //Frame that displays the game state
    private JFrame frame;
    
    //ScoreCalculator controlling backend of game
    private ScoreCalculator scoreCalc;
    
    //JTextField used to display score
    private JTextField score;

    /**
     * Sets up the frame and buttons used to visualize 
     * the game and create a user interface.
     * 
     * @param calc ScoreCalculator object, runs the backend
     * of the game.
     */
    public GameWindow(ScoreCalculator calc)
    {
        
        scoreCalc = calc;
        
        frame = new JFrame("Greed Kata");
        
        score = new JTextField();
        
        JButton rollButton = new JButton("Roll");
        JButton quitButton = new JButton("Quit");
        
        //Sets actions of buttons
        rollButton.addActionListener(e -> roll());
        quitButton.addActionListener(e -> frame.dispose());
        
        
        JPanel buttonPanel = new JPanel();
        
        
        buttonPanel.add(rollButton);
        buttonPanel.add(quitButton);
        
        
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        //Updates frame
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
        
        //Updates frame
        frame.setVisible(true);
        
    }
}
