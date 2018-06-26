package src.main.java.tothonderd.totDertig;

//Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
//
//        21 22 23 24 25
//        20  7  8  9 10
//        19  6  1  2 11
//        18  5  4  3 12
//        17 16 15 14 13
//
//        It can be verified that the sum of the numbers on the diagonals is 101.
//
//        What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

public class Opdracht28 {

//      [x]   [y]
//     [rij][kolom]

    public static void main(String[] args) {
        int gridsize = 1001;
        int highestNumber = gridsize*gridsize;
        int[][] grid = new int[gridsize][gridsize];
        int currentNumber = highestNumber;
        int center = gridsize / 2;

        int xAxis = 0;
        int yAxis = gridsize;

        while(grid[center][center] == 0) {
            while (yAxis > 0 && grid[xAxis][yAxis - 1] == 0) {
                grid[xAxis][yAxis - 1] = currentNumber;
                currentNumber--;
                yAxis--;
            }

            while (xAxis < gridsize - 1 && grid[xAxis + 1][yAxis] == 0) {
                grid[xAxis + 1][yAxis] = currentNumber;
                currentNumber--;
                xAxis++;
            }

            while (yAxis < gridsize - 1 && grid[xAxis][yAxis + 1] == 0) {
                grid[xAxis][yAxis + 1] = currentNumber;
                currentNumber--;
                yAxis++;
            }

            while (xAxis > 0 && grid[xAxis - 1][yAxis] == 0) {
                grid[xAxis - 1][yAxis] = currentNumber;
                currentNumber--;
                xAxis--;
            }
        }

        int resultaat = -1;
        for(int i = 0; i < gridsize; i++) {
            resultaat = resultaat + grid[i][i];
        }

        for (int i = gridsize - 1; i >= 0; i--) {
            resultaat = resultaat + grid[i][gridsize - 1 - i];
        }

        System.out.println(resultaat);
    }
}
