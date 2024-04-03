class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int[] delrow ={-1,0,1,0};
        int[] delcol ={0,1,0,-1};
        boolean[][] vis = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                 if(dfs(board , word, i, j, delrow,delcol,0,vis)) return true;
                }
            }
        }
        return false;   
    }
    public boolean dfs(char[][] board , String word , int row, int col , int[] delrow, int[] delcol, int index, boolean[][] vis){
        int n = board.length;
        int m = board[0].length;
        if(index==word.length()-1) return true;
        vis[row][col]=true;
        for(int i = 0 ; i<4;i++){
        int newrow= row+delrow[i];
        int newcol=col+delcol[i];
        if(newrow>=0&&newrow<n && newcol>=0&& newcol<m && board[newrow][newcol]==word.charAt(index+1)&& vis[newrow][newcol]==false){
           vis[newrow][newcol]= true;
            if(dfs(board , word, newrow,  newcol, delrow,delcol,index+1,vis))  return true; 
           
            
        }
    }
    vis[row][col]= false;
    return false;
    }
}