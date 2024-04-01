class Solution {
    public boolean isValidSudoku(char[][] board) {
         int n = board.length;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.') continue;

                char a = board[i][j];
                board[i][j]='.';
               if(!isvalid(board,i,j,a)) return false;
               board[i][j]=a;
            }
         }
         return true ;
    }
    public boolean isvalid(char[][] board, int row, int col , char num){
        int n = board.length;
        for(int i=0;i<n;i++){
            if(board[row][i]==num) return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]==num) return false;
        }
        int startrow = row/3*3;
        int startcol= col/3*3;
         for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(board[i][j]==num) return false;
            }
    }
    return true;
}
}