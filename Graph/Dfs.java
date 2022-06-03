Graph Traversing using Depth First Search
NOTE:FOR LOOP: we use just because if it is a disconnected graph


public void dfs_recur(int i,boolean[] vis,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj){
        ans.add(i);
        vis[i]=true;
        for(Integer av: adj.get(i)){
            if(!vis[av]){
                dfs_recur(av,vis,ans,adj);
            }

        }
    }
    public ArrayList<Integer> dfs(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                dfs_recur(i,vis,ans,adj);
            }
        }
        return ans;
    }
