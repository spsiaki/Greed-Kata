
import java.util.Random;

public class ScoreCalculator {
    
    private int[] dice;
  
    /**
     * 
     */
    public ScoreCalculator()
    {
        dice = new int[5];
    }
    
    /**
     * Uses a random generator to simulate the rolling
     * of 5, 6-sided dice.
     * 
     * @return Returns the result of rolling 5 dice
     * as an int array of length 5.
     */
    public int[] roll()
    {
        Random rand = new Random();
        
        for (int i = 0; i < 5; i++)
        {
            dice[i] = rand.nextInt(6) + 1;
        }
        
        return dice;
    }
    
    
    /**
     * Assumption made is that dice are not ordered
     * 
     * @return Returns the highest possible score combination
     * as an integer
     */
    public int findBestScore()
    {
        int[] countRolls = new int[6];
        for (int i = 0; i < dice.length; i++)
        {
            countRolls[dice[i] - 1]++;
        }
        
        int totalScore = 0;
       
        
        for (int i = 0; i < 6; i++)
        {
            if (i != 0 && countRolls[i] >= 3)
            {
                totalScore += 100 * (i + 1);
            }
            else if (i == 0 && countRolls[i] >= 3)
            {
                totalScore += 1000;
            }
            
            if (i == 0)
            {
                totalScore += (countRolls[i]%3) * 100;
            }
            
            if (i == 4)
            {
                totalScore += (countRolls[i]%3) * 50;
            }
   
        }
        
        return totalScore;
        
    }
    
    
}
