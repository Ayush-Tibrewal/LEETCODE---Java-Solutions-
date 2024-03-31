class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(board, 0 , ans);
        return ans;

    }

    public static void nqueen(char[][] board, int row, List<List<String>> ans) {
        if (row == board.length) {
            List<String> a = new ArrayList<>();
            String st="";
            for (int i = 0; i < board.length; i++) {
                st="";
                for (int j = 0; j < board.length; j++) {
                    st = st+board[i][j];
                } 
                a.add(st);
            }
            ans.add(a);
            return;
            
        }
        
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1,ans);
                board[row][j] = '.';
            }
        }
    }

    private static boolean issafe(char[][] board, int row, int col) {
        int n = board.length;

        
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') return false;
        }

        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}

        
    
