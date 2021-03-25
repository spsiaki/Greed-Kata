
/**
 * Controls the state of the game with instances of GameWindow and
 * ScoreCalculator.
 * 
 * @author Sarah Psiaki
 * @version 03.24.21
 *
 */
public class ProjectRunner {

    /**
     * Creates an instance of a ScoreCalculator and
     * passes it to GameWindow as a parameter to start
     * the game.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        
        ScoreCalculator calc = new ScoreCalculator();
        
        new GameWindow(calc);
    } 
}
