import java.util.Random; 
public class Die{
    public static Random generator = new Random();
    public static void main(String args[]){
        int die1 = generator.nextInt(7);
        int die2 = generator.nextInt(7);
        System.out.println(die1);
        System.out.println(die2);
    }
}

