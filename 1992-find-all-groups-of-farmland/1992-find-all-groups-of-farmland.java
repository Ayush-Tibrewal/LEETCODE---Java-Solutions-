class Solution {
    public List<List<Integer>> farmland = new ArrayList<>();
    public int[][] findFarmland(int[][] land) {
        for(int i = 0;i<land.length;i++){
            for(int j = 0;j<land[i].length;j++){
                if(land[i][j]==1){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(i);
                    lst.add(j);
                    dfs(land,i,j,lst);
                }
            }
        }
        return convert(farmland);
    }

    public void dfs(int[][] land, int row, int col,List<Integer> lst) {
        if(row >= land.length || col >= land[0].length){
            return;
        }
        if(land[row][col]==1){
            land[row][col] = 2;
            if(row +1 >= land.length && col +1 >= land[0].length){
                lst.add(row);
                lst.add(col);
                farmland.add(lst);
                return;
            }

            if((row+1 >= land.length && land[row][col+1] == 0)){
                lst.add(row);
                lst.add(col);
                farmland.add(lst);
                return;
            }

            if((col+1 >= land[0].length && land[row+1][col] == 0)){
                lst.add(row);
                lst.add(col);
                farmland.add(lst);
                return;
            }

            if((row+1 < land.length && col+1<land[0].length)  && (land[row+1][col]==0 && land[row][col+1] == 0)){
                lst.add(row);
                lst.add(col);
                farmland.add(lst);
                return;
            }
        }else{
            return;
        }
        dfs(land, row+1, col,lst);
        dfs(land, row, col+1,lst);
    }

   public int[][] convert(List<List<Integer>> list) {
    int inc = 0;
    int n = list.size();
    int[][] array = new int[n][];
    for(int i = 0; i < n; i++) {
        List<Integer> innerList = list.get(i);
        array[i] = new int[innerList.size()];
        for(int j : innerList) {
            array[i][inc] = j;
            inc++;
        }
        inc = 0;
    }
    return array;


    }
}