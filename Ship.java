// Programmer: Gaurav Sharma     CSC110 Module 7 Assignment
// Date: Dec 7, 2018


import java.util.Random;
public class Ship{
    private int size;
    private boolean orientation;
    public Ship( )
    {
        Random rand = new Random();
        orientation = rand.nextBoolean();
        int prob = rand.nextInt(100);
        if(prob>0 && prob< 21){
            this.size = 2;
        }
        else if(prob>21 && prob<51){
            this.size = 3;
        }
        else{
            this.size = 4;
        }
    }

    public int getSize()
    {
        return size;
    }

    public boolean getOrientation()
    {
        return orientation;
    }
    public int[] getPoint(){
        Random rand = new Random();
        int[] point = new int[2];
        int row = rand.nextInt(5)+1;
        int column = rand.nextInt(5)+1;
        point[0] =row;
        point[1] =column;
        return point;
    }
}