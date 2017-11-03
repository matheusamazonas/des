package gameOfLife.generator

import gameOfLife.dSL.GameSpec

class JavaGenerator {
	
	def static toJava(GameSpec root)'''
		package GameOfLife;
		
		import java.awt.Point;
		import java.util.ArrayList;
		
		public class RulesOfLife {
			public static void computeInitialConfig(ArrayList<Point> survivingCells) {
				«FOR p : root.initiallyAlive»
					survivingCells.add(new Point(«p.x», «p.y»));
				«ENDFOR»
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
							if ((surrounding == 2) || (surrounding == 3)) {
								nextLiveCells.add(new Point(i - 1, j - 1));
							}
						} else {
							// Cell is dead, will the cell be given birth? (3)
							if (surrounding == 3) {
								nextLiveCells.add(new Point(i - 1, j - 1));
							}
						}
		            }
		        }
			}
		
		}
		
		'''
}