class Solution {
    public int islandPerimeter(int[][] grid) {
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        int perimeter=0;
        int row=grid.length;
        int col=grid[0].length;
        boolean vis[][]=new boolean[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    Queue<int []>q=new LinkedList<>();
                    q.offer(new int[]{i,j});
                    vis[i][j]=true;

                    while(!q.isEmpty()){
                        int arr[]=q.poll();
                        int x=arr[0];
                        int y=arr[1];

                        for(int l=0;l<4;l++){
                            int r=x+dir[l][0];
                            int c=y+dir[l][1];

                            if(r<0 || c<0 || r>=row ||c>=col|| grid[r][c]==0 ){
                                perimeter++;

                            }
                           else{
                            if(vis[r][c]==false){
                                vis[r][c]=true;
                                q.offer(new int[]{r,c});
                            }
                           }
                        }
                    }
                    return perimeter;

                }
            }
        }
        return 0;
    }
}