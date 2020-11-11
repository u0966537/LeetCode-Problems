package lc11102020;

public class NumberOfIslands {
	public int numIslands(char[][] grid) {
		int count = 0;

		// double for loops to vist all nodes in the gird
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				// if the value is 1, then we have to start to sink the island
				if (grid[i][j] == '1') {
					count++;
					grid = sink(grid, i, j);
				}
			}
		}
		return count;
	}

	public char[][] sink(char[][] grid, int r, int c) {
		if (grid[r][c] == '1') {
			grid[r][c] = '0';
		}

		// check up
		if (r - 1 >= 0 && grid[r - 1][c] == '1') {
			sink(grid, r - 1, c);
		}
		// check down
		if (r + 1 < grid.length && grid[r + 1][c] == '1') {
			sink(grid, r + 1, c);
		}
		// check left
		if (c - 1 >= 0 && grid[r][c - 1] == '1') {
			sink(grid, r, c - 1);
		}
		// check right
		if (c + 1 < grid[0].length && grid[r][c + 1] == '1') {
			sink(grid, r, c + 1);
		}

		return grid;
	}
}
