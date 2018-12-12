// Programmer: Gaurav Sharma     CSC110 Module 7 Assignment
// Date: Dec 7, 2018


public class Sea {
    private String[][] grid = new String[11][11];
    private int size = 0;

    public Sea() {
        for (int row = 0; row < 11; row++) {
            for (int col = 0; col < 11; col++) {
                if (row == 0) {
                    this.grid[row][col] = Integer.toString(col);
                } else if (col == 0) {
                    this.grid[row][col] = Integer.toString(row);
                } else {
                    this.grid[row][col] = ".";
                }
            }
        }
    }

    public void addShip(Ship[] s) {
        char[] nameValue = "ABCDEFGH".toCharArray();
        for (int j = 1; j < s.length; j++) {
            boolean complete = false;
            loop_while:
            while (!complete) {
                int[] point = s[j-1].getPoint();
                int length = s[j-1].getSize();
                boolean orientation = s[j-1].getOrientation();
                int row = point[0];
                int col = point[1];
                if (orientation == true) // Hortizontal
                {
                    for (int i = row; i < row + length; i++) {
                        if (grid[i][col] != ".") {
                            continue loop_while;
                        }
                    }
                    for (int i = row; i < row + length; i++) {
                        grid[i][col] = Character.toString(nameValue[j - 1]);
                    }

                } else  // Vertical
                {
                    for (int i = col; i < col + length; i++) {
                        if (grid[row][i] != ".") {
                            continue loop_while;
                        }
                    }
                    for (int i = col; i < col + length; i++) {
                        grid[row][i] = Character.toString(nameValue[j - 1]);
                    }
                }
                    complete = true;
                }
            }
        }


    public String[][] getGrid() {
        return grid;
    }
    public int getSize(){
        return size;
    }
}