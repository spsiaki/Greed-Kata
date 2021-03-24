
import java.util.Random;

public class ScoreCalculator {
    
    private int[] dice;
    private int[] countRolls;
    
    private int num5s;
    private int num1s;
    private int num2s;
    
    
    /**
     * 
     * @param diceRolls
     */
    public ScoreCalculator()
    {
        dice = new int[5];
        countRolls = new int[6];
        roll();
        int total = findBestScore();
        System.out.println(dice[0] + " " + dice[1] + " " + dice[2] + " " + dice[3] + " " + dice[4]);
        System.out.println(total);
       
    }
    
    public void roll()
    {
        Random rand = new Random();
        for (int i = 0; i < 5; i++)
        {
            dice[i] = rand.nextInt(6) + 1;
        }
    }
    
    /**
     * Assumption made is that dice are not ordered
     * @return
     */
    public int findBestScore()
    {
        for (int i = 0; i < dice.length; i++)
        {
            countRolls[dice[i] - 1]++;
        }
        int total = 0;
        int numDoubles = 0;
        int numSingles = 0;
        for (int i = 0; i < 6; i++)
        {
            if (i != 0 && countRolls[i] >= 3)
            {
                total += 100 * (i + 1) * (Math.pow(2, countRolls[i]%3));
            }
            else if (i == 0 && countRolls[i] >= 3)
            {
                total += 1000 * (Math.pow(2, countRolls[i]%3));
            }
            
            if (i == 0 && countRolls[i] < 3)
            {
                total += (countRolls[i]%3) * 100;
            }
            
            if (i == 4 && countRolls[i] < 3)
            {
                total += (countRolls[i]%3) * 50;
            }
            
            if (countRolls[i] == 2)
            {
                numDoubles++;
            }
            
            if (countRolls[i] == 1)
            {
                numSingles++;
            }
        }
        
        if (numDoubles == 3)
        {
            total = 800;
        }
        else if (numSingles == 5)
        {
            total = 1200;
        }
        
        return total;
        
    }
    
    
}
