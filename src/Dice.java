import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dice extends JPanel {
    
    private int[] diceVals;
    
    public Dice(int[] dice)
    {
        diceVals = dice;
    }
    
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawRect(100, 150, 50, 50);
        
        drawDots(100, 150, g2d, diceVals[0]);
        
        g2d.drawRect(160, 150, 50, 50);
        
        drawDots(160, 150, g2d, diceVals[1]);
        
        g2d.drawRect(220, 150, 50, 50);
        
        drawDots(220, 150, g2d, diceVals[2]);
        
        g2d.drawRect(280, 150, 50, 50);
        
        drawDots(280, 150, g2d, diceVals[3]);
        
        g2d.drawRect(340, 150, 50, 50);
        
        drawDots(340, 150, g2d, diceVals[4]);
    }
    
    public void drawDots(int x, int y, Graphics2D g2d, int numDots)
    {
        if (numDots == 1 || numDots == 3 || numDots == 5)
        {
            g2d.drawOval(x+22, y+22, 6, 6);
        }
        
        if (numDots == 2 || numDots == 3 || numDots == 4 || numDots == 5 || numDots == 6)
        {
            g2d.drawOval(x+35, y+8, 6, 6);
            
            g2d.drawOval(x+8, y+35, 6, 6);
        }
        
        if (numDots == 4 || numDots == 5 || numDots == 6)
        {
            g2d.drawOval(x+35, y+35, 6, 6);
            
            g2d.drawOval(x+8, y+8, 6, 6);
        }
        
        if (numDots == 6)
        {
            g2d.drawOval(x+35, y+22, 6, 6);
            
            g2d.drawOval(x+8, y+22, 6, 6);
        }
        
        
    }

}
