class Solution {
    private int count=0;
    public void dfs(int grid[][],int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            return ;
        }
        grid[i][j]=0;
        count++;
        dfs(grid,i+1,j,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i,j-1,n,m);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count=0;
                    dfs(grid,i,j,n,m);
                    
                    max=Math.max(count,max);
                }
            }
        }
        return max;
    }
}
