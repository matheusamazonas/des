package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;

public class RulesOfLife {
	public static void computeInitialConfig(ArrayList<Point> survivingCells) {
		survivingCells.add(new Point(11, 12));
		survivingCells.add(new Point(12, 13));
		survivingCells.add(new Point(13, 11));
		survivingCells.add(new Point(13, 12));
		survivingCells.add(new Point(13, 13));
		survivingCells.add(new Point(0, 1));
		survivingCells.add(new Point(0, 2));
		survivingCells.add(new Point(1, 0));
		survivingCells.add(new Point(1, 1));
		survivingCells.add(new Point(1, 2));
		survivingCells.add(new Point(1, 3));
		survivingCells.add(new Point(2, 0));
		survivingCells.add(new Point(2, 1));
		survivingCells.add(new Point(2, 3));
		survivingCells.add(new Point(2, 4));
		survivingCells.add(new Point(3, 2));
		survivingCells.add(new Point(3, 3));
		survivingCells.add(new Point(3, 30));
		survivingCells.add(new Point(3, 31));
		survivingCells.add(new Point(3, 32));
		survivingCells.add(new Point(7, 22));
		survivingCells.add(new Point(7, 23));
		survivingCells.add(new Point(7, 24));
		survivingCells.add(new Point(8, 23));
		survivingCells.add(new Point(8, 24));
		survivingCells.add(new Point(8, 25));
	}
	
	public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> nextLiveCells) {
        // Iterate through the array, follow game of life rules
		for (int i = 1; i < gameBoard.length - 1; i++) {
			for (int j = 1; j < gameBoard[0].length - 1; j++) {
				int surrounding = 0;
                if (gameBoard[i-1][j-1]) { surrounding++; }
                if (gameBoard[i-1][j])   { surrounding++; }
                if (gameBoard[i-1][j+1]) { surrounding++; }
                if (gameBoard[i][j-1])   { surrounding++; }
                if (gameBoard[i][j+1])   { surrounding++; }
                if (gameBoard[i+1][j-1]) { surrounding++; }
                if (gameBoard[i+1][j])   { surrounding++; }
                if (gameBoard[i+1][j+1]) { surrounding++; }

				if (gameBoard[i][j]) {
					// Cell is alive, Can the cell live? (2-3)
					if ((surrounding >= 3)) {
						nextLiveCells.add(new Point(i - 1, j - 1));
					}
				} else {
					// Cell is dead, will the cell be given birth? (3)
					if ((surrounding == 2)) {
						nextLiveCells.add(new Point(i - 1, j - 1));
					}
				}
            }
        }
	}
}

