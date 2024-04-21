class Solution {
    // good question of graphs basics
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
           adjList.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] v = new boolean[n];
        q.add(source);
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == destination) return true;
            for(Integer i : adjList.get(node)){
                if(v[i]==false){
                    q.add(i);
                    v[i]=true;
                }
            }
        }
        return false;
    }
}

