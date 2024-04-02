class Solution {
    static int count=-1;
    public void solveSudoku(char[][] board) {
         count=-1;
    solve(board,0,0);
       

        
    }
    public void solve(char[][] board , int row , int col){
        int n = board.length;
        if(row==n){
             count=1 ;
            return;
        }else if(board[row][col]!='.'){
           if(col!=8) solve(board,row,col+1);
           else solve(board,row+1,0);
        }else{
            for(char ch  ='1';ch<='9';ch++){
            if(isvalid(board , row, col , ch)){
                board[row][col]=ch;
            if(col!=8) solve(board,row,col+1);
            else solve(board,row+1,0);
            if(count==1) return;
            board[row][col]='.';

                }
            }

        }
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


