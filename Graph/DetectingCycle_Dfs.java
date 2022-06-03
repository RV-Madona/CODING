 public boolean isCycleDfs(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(Integer av: adj.get(node)){
            if(!vis[av]){
               if(isCycleDfs(av,node,vis,adj)) return true;
            }
            else if(av != parent) return true;
        }
        return false;
    }
    public boolean dfs_cycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                if(isCycleDfs(i,-1,vis,adj)) return true;
            }
        }
        return false;
    }