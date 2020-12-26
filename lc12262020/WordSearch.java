package lc12262020;

public class WordSearch{
 public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, int i, int j, String word, int idx) {
        if (idx == word.length()) return true;
        
        // within the grid.
        if (i >= 0 && i < board.length &&
            j >= 0 && j < board[0].length && 
            board[i][j] == word.charAt(idx)) {
            char tmp = board[i][j];
            board[i][j] = '*';
            
            if (dfs(board, i + 1, j, word, idx + 1) ||
               dfs(board, i - 1, j, word, idx + 1) ||
               dfs(board, i, j + 1, word, idx + 1) ||
               dfs(board, i, j - 1, word, idx + 1)) {
                return true;
            }
            
            // or reset the char back to original
            board[i][j] = tmp;
        }
        return false;
    }
}