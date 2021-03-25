import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * Front end class to create a row of dice in the graphical
 * frame used to display the game. Draws dice in as a row of
 * 5 rectangles with appropriate dots drawn to represent face
 * values.
 * 
 * @author Sarah Psiaki
 * 
 * @version 03.24.21
 *
 */
public class Dice extends JPanel {
    
    //Stores the face value of each die
    private int[] diceVals;
    
    //Constants for the rows/columns spacing of dots on a die
    private static final int ROWCOLUMN1 = 8;
    private static final int ROWCOLUMN2 = 22;
    private static final int ROWCOLUMN3 = 36;
    
    //Start coordinate of row of dice
    private static final int X_START = 100;
    
    //Gap between each die
    private static final int X_GAP = 60;
    
    //Y coordinate of row of dice
    private static final int Y = 150;
    
    //Length/width of die
    private static final int DIE_SIZE = 50;
    
    
    
    /**
     * Constructor
     * 
     * @param dice An int array of length 5
     * 
     * @precondition dice param has a length of 5
     */
    public Dice(int[] dice)
    {
        diceVals = dice;
    }
    
    /**
     * An Overidden method, creates 5 dice as rectangles
     * and calls drawDots for each die to draw dots on it.
     * 
     * @param g Graphics object used to draw on panel
     */
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        for (int i = 0; i < diceVals.length; i++)
        {
            g2d.drawRect(X_START + (i * X_GAP), Y, DIE_SIZE, DIE_SIZE);
            
            drawDots(X_START + (i * X_GAP), Y, g2d, diceVals[i]);
        }
    }
    
    /**
     * Draws the correct number of dots (1-6) to represent
     * the face of a 6 sided die.
     * 
     * @param x The x coordinate of the die
     * @param y The y coordinate of the die
     * @param g2d 2D graphics instance
     * @param numDots Number of dots to draw
     * 
     * @precondition numDots is between 1 and 6 inclusive.
     */
    public void drawDots(int x, int y, Graphics2D g2d, int numDots)
    {
        if (numDots == 1 || numDots == 3 || numDots == 5)
        {
            g2d.drawOval(x + ROWCOLUMN2, y + ROWCOLUMN2, 6, 6);
        }
        
        if (numDots == 2 || numDots == 3 || numDots == 4 || numDots == 5 || numDots == 6)
        {
            g2d.drawOval(x + ROWCOLUMN3, y + ROWCOLUMN1, 6, 6);
            
            g2d.drawOval(x + ROWCOLUMN1, y + ROWCOLUMN3, 6, 6);
        }
        
        if (numDots == 4 || numDots == 5 || numDots == 6)
        {
            g2d.drawOval(x + ROWCOLUMN3, y + ROWCOLUMN3, 6, 6);
            
            g2d.drawOval(x + ROWCOLUMN1, y + ROWCOLUMN1, 6, 6);
        }
        
        if (numDots == 6)
        {
            g2d.drawOval(x + ROWCOLUMN3, y + ROWCOLUMN2, 6, 6);
            
            g2d.drawOval(x + ROWCOLUMN1, y + ROWCOLUMN2, 6, 6);
        }
        
        
    }

}
