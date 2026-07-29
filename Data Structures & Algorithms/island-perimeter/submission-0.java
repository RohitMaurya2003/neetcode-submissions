class Solution {
  
    private int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
    public int find(int [][] grid,int r,int c,int n,int m){
        
        int count=4;
        for(int i=0;i<4;i++){
            int row=r+dir[i][0];
            int col=c+dir[i][1];

            if(row>=0 && col>=0 && row<n && col<m && grid[row][col]==1){
                count--;
            }
        }
        return count;
    }
    public int islandPerimeter(int[][] grid) {
        
        

        int n=grid.length;
        int m=grid[0].length;
        
       
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                     result+=find(grid,i,j,n,m);
                }
            }
        }
        return result;

    }
}