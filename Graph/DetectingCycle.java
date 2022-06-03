Detecting cycle in Undirected Graph
NOTE:FOR LOOP:using for loop if it is disconnected graph


public boolean isCycle(int s,boolean[] vis,ArrayList<ArrayList<Integer>> ans){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s]=true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer av:adj.get(node)){
                if(!vis[av]){
                    q.add(new Node(av,node));
                    vis[av]=true;
                }
                else if(av != par) return true;
            }
        }
        return false;

    }
    public Boolean bfs_Cycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        for(int i=1;i<=v;i++) {
            if (!vis[i]) {
                if (isCycle(i, vis, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
