 public int[] topoSort(ArrayList<ArrayList<Integer>> adj, int N){
        int[] vis = new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            if(vis[i]==0){
                topo(i,vis,adj,st);
            }
        }
        int[] topo = new int[N];
        int index=0;
        while(!st.isEmpty()){
            topo[index++]=st.pop();
        }
        return topo;
    }

    public static void topo(int node,int[] vis,ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        vis[node] = 1;
        for(Integer v:adj.get(node)){
            if(vis[v]==0){
                topo(v,vis,adj,st);
            }
        }
        st.push(node);
    }