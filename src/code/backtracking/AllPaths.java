package code.backtracking;

public class AllPaths {

	public static void main(String[] args) {
		boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
		pathRestrictions("", 0, 0, maze);
	}

	static void pathRestrictions(String p, int row, int col, boolean[][] maze) {
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		if (!maze[row][col]) {
			return;
		}
		maze[row][col] = false;
		if (row < maze.length - 1) {
			pathRestrictions(p + "D", row + 1, col, maze);
		}
		if (col < maze[0].length - 1) {
			pathRestrictions(p + "R", row, col + 1, maze);
		}
		if (row > 0) {
			pathRestrictions(p + "U", row - 1, col, maze);
		}
		if (col > 0) {
			pathRestrictions(p + "L", row, col - 1, maze);
		}
		maze[row][col] = true;
	}

}
