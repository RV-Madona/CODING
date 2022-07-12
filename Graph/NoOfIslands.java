class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int noOfIslands =0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,vis);
                    noOfIslands++;
                }
            }
        }
        
        return noOfIslands;
    }
    
    public static void dfs(char[][] grid,int row,int col,boolean[][] vis){
        if(row<0 || col<0 || row>=grid.length || col >=grid[0].length || vis[row][col] || grid[row][col] == '0'){
            return;
        }
        
        vis[row][col] = true;
        
        dfs(grid,row,col-1,vis);
        dfs(grid,row,col+1,vis);
        dfs(grid,row-1,col,vis);
        dfs(grid,row+1,col,vis);
    }
}