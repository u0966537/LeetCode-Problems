package lc12032020;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if(board == null || board.length == 0) {
			return false;
		}
		
		Set<String> seen = new HashSet<>();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] != '.') {
					if(!seen.add(board[i][j] + "in row" + i) ||
							!seen.add(board[i][j] + "in col" + j) ||
							!seen.add(board[i][j] + "in box" + (i / 3) + (j / 3))) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
