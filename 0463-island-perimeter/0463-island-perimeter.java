import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int total = 0;

        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    total += bfs(i, j, grid, visited);
                }
            }
        }
        return total;
    }

    public int bfs(int i, int j, int[][] grid, int[][] visited) {
        int perimeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        visited[i][j] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();
            int count = 0;
            for (int a = 0; a < 4; a++) {
                int newRow = row + delRow[a];
                int newCol = col + delCol[a];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    if(grid[newRow][newCol] == 1 &&  visited[newRow][newCol] == 1) count++;
                    if (grid[newRow][newCol] == 1) {
                        if (visited[newRow][newCol] == 0) {
                            visited[newRow][newCol] = 1;
                            count++;
                            q.add(new Pair(newRow, newCol));
                        }
                    } 
            }
           
        }
         perimeter += (4-count);
     
    }
       return perimeter;
    }
}

