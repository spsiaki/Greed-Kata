
import junit.framework.*;

/**
 * Test class for the methods of the ScoreCalculator class. 
 * 
 * @author Sarah Psiaki
 * 
 * @version 03.24.21
 *
 */
public class ScoreCalculatorTest extends TestCase {

    private ScoreCalculator calc;
    
    /**
     * Sets up initial conditions for each test method
     */
    public void setUp()
    {
        calc = new ScoreCalculator();
    }
    
    /**
     * Tests the roll method by asserting that
     * each die value is always in between 1
     * and 6 inclusive.
     */
    public void testRoll()
    {
        int[] diceVals = calc.roll();
        
        for (int i = 0; i < diceVals.length; i++)
        {
            assertTrue(diceVals[i] <= 6);
            assertTrue(diceVals[i] >= 1);
        }
    }
    
    /**
     * Tests the findBestScore method by confirming
     * that the score is always in the expected range
     * and always divisible by 50.
     */
    public void testFindBestScore()
    {
        for (int i = 0; i < 20; i++)
        {
            calc.roll();
            
            int score = calc.findBestScore();
            
            assertTrue(score <= 1200);
            assertTrue(score >= 0);
            assertEquals(score%50, 0);
        }
    }
    
    
    
    
}
