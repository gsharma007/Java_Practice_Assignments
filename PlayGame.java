import java.util.*;
public class PlayGame 
{
    public static void main( String[] args ) 
    {
        Scanner kb = new Scanner( System.in );//  Create the game objectEyesHaveIt 
        eyesGame = new EyesHaveIt();// Get name of user, a.k.a., the human playwer
        System.out.print("Who is playing against the computer? ");
        String name = kb.next();// Perform some initialization of the game 
        eyesGame.init( name );// Let the game be played
        eyesGame.playGame();}}