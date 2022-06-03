Graph Traversing using Breadth First Search
NOTE:FOR LOOP: we use just because if it is a disconnected graph

    public ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                q.add(i);
                vis[i] = true;
                while(!q.isEmpty()){
                    int node = q.poll();
                    ans.add(node);
                    for(Integer av: adj.get(node)){
                        if(!vis[av]){
                            q.add(av);
                            vis[av]=true;
                        }
                    }
                }
            }

        }
        return ans;
    }
