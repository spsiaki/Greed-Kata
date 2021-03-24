
public class ScoreCalculatorTest extends student.TestCase {

    
    private ScoreCalculator calc;
    
    public void setUp()
    {
        int[] rolls = {1,1,1,5,1};
        calc = new ScoreCalculator(rolls);
    }
    
    public void testFindBestScore()
    {
        assertEquals(2050, calc.findBestScore());
        
        int[] rolls2 = {2,3,4,6,2};
        ScoreCalculator calc2 = new ScoreCalculator(rolls2);
        
        assertEquals(0, calc2.findBestScore());
        
        int[] rolls3 = {3,4,5,3,3};
        ScoreCalculator calc3 = new ScoreCalculator(rolls3);
        
        assertEquals(350, calc3.findBestScore());
        
        int[] rolls4 = {1,5,1,2,4};
        ScoreCalculator calc4 = new ScoreCalculator(rolls4);
        
        assertEquals(250, calc4.findBestScore());
        
        int[] rolls5 = {5,5,5,5,5};
        ScoreCalculator calc5 = new ScoreCalculator(rolls5);
        
        assertEquals(2000, calc5.findBestScore());
        
        int[] rolls6 = {2, 3, 4, 5, 1};
        ScoreCalculator calc6 = new ScoreCalculator(rolls6);
        
        assertEquals(1200, calc6.findBestScore());
        
        
    }
    
    
    
    
}
