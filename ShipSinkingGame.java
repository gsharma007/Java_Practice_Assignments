// Programmer: Gaurav Sharma     CSC110 Module 7 Assignment
// Date: Dec 7, 2018

import java.util.*;

public class ShipSinkingGame {
    final static int SHIP_COUNT = 8;
    public static void main(String[] args) {
        System.out.println("Welcome to the Ship Sinking Game");
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want play mode ? (N=cheat Mode)");
        char inp = input.next().charAt(0);
        // char inp ='y';
        if (inp == 'y') {
            System.out.println("Ok - We are in play mode. Enjoy ...");
            playGame();
        } else {
            System.out.println("Ok - We are in CHEAT mode. Enjoy ...");
            cheatGame();
        }
    }

    public static void playGame() {
        Ship[] shps = new Ship[SHIP_COUNT];
        for (int i = 0; i< SHIP_COUNT ; i++){
            shps[i] = new Ship();
        }
        Sea grid = new Sea();
        grid.addShip(shps);
        int row = -1;
        int col = -1;
        int missCount = 0;
        int hitCount = 0;
        String inp;
        int shipSize = grid.getSize();
        String[][] shipGrid = grid.getGrid();
        String[][] playGrid = playGameGrid();
        Scanner input = new Scanner(System.in);
        while (true) {
            printGrids(playGrid);
            System.out.print("Enter a coordinate(0..9) for target:");
            inp = input.next();
            if (inp.charAt(0) == 'q') {
                System.out.println("Quitting early! " + (hitCount + missCount) + " shots were used. ");
                break;
            } else {
                row = Integer.parseInt(inp);
            }
            System.out.print("Enter a coordinate(0..9) for target:");
            inp = input.next();
            if (inp.charAt(0) == 'q') {
                System.out.println("Quitting early with " + missCount + " miscounts");
                break;
            } else {
                col = Integer.parseInt(inp);
            }
            if (shipGrid[row][col] != ".") {
                hitCount = hitCount + 1;
                System.out.println("===>Ship A hit " + hitCount + " times.");
                System.out.println("Good shot! A ship was hit.");
                shipSize = shipSize - 1;
                playGrid[row][col] = "*";
            } else {
                System.out.println("No ships were hit.");
                missCount = missCount + 1;
                playGrid[row][col] = "X";
            }
            if (missCount == 12) {
                System.out.println("You missed 12 hits");
                break;
            }

            if (shipSize == 0) {
                System.out.println("Congratulations! All ships destroyed with " + (hitCount + missCount) + " shots!");
                break;
            }
        }
    }

    public static void printGrids(String[][] gridPrint) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(gridPrint[row][col]);
            }
            System.out.println(" ");
        }
    }

    public static String[][] playGameGrid() {
        String[][] st = new String[11][11];
        for (int row = 0; row < 11; row++) {
            for (int col = 0; col < 11; col++) {
                if (row == 0) {
                    st[row][col] = Integer.toString(col);
                } else if (col == 0) {
                    st[row][col] = Integer.toString(row);
                } else {
                    st[row][col] = ".";
                }
            }
        }
        return st;
    }

    public static void cheatGame() {
        Ship[] shps = new Ship[SHIP_COUNT];
        for (int i = 0; i< SHIP_COUNT ; i++){
            shps[i] = new Ship();
        }
        Sea grid = new Sea();
        grid.addShip(shps);
        int row = -1;
        int col = -1;
        int missCount = 0;
        int hitCount = 1;
        String inp;
        int shipSize = grid.getSize();
        String[][] shipGrid = grid.getGrid();
        String[][] playGrid = playGameGrid();
        Scanner input = new Scanner(System.in);
        while (true) {
            printGrids(shipGrid);
            System.out.print("Enter a coordinate(0..9) for target:");
            inp = input.next();
            if (inp.charAt(0) == 'q') {
                System.out.println("Quitting early! " + (hitCount + missCount) + " shots were used. ");
                break;
            } else {
                row = Integer.parseInt(inp);
            }
            System.out.print("yes");
            System.out.print("Enter a coordinate(0..9) for target:");
            inp = input.next();
            if (inp.charAt(0) == 'q') {
                System.out.println("Quitting early with " + missCount + " miscounts");
                break;
            } else {
                col = Integer.parseInt(inp);
            }
            if (shipGrid[row][col] != ".") {
                hitCount = hitCount + 1;
                System.out.println("===>Ship F hit " + hitCount + " times.");
                System.out.println("Good shot! A ship was hit.");
                shipSize = shipSize - 1;
                shipGrid[row][col] = "*";
            } else {
                System.out.println("No ships were hit.");
                missCount = missCount + 1;
                shipGrid[row][col] = "X";
            }
            
            if (missCount == 12) {
                System.out.println("You missed 12 hits");
                break;
            }

            if (shipSize == 0) {
                System.out.println("Congratulations! All ships destroyed with " + (hitCount + missCount) + " shots!");
                break;
            }
        }
    }
}
