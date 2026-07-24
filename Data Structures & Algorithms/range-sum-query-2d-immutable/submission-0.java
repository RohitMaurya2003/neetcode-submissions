class NumMatrix {
    int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    int sum = 0;
    int n, m;
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.n = matrix.length;
        this.m = matrix[0].length;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        sum = 0; // reset for every new query
        boolean vis[][] = new boolean[n][m];
        dfs(vis, row1, col1, row1, col1, row2, col2, n, m);
        return sum;
    }

    public void dfs(boolean vis[][], int r1, int c1, int startR, int startC, int r2, int c2, int n, int m) {
        vis[r1][c1] = true;       // mark visited BEFORE exploring neighbors
        sum += matrix[r1][c1];

        for (int i = 0; i < 4; i++) {
            int r = dir[i][0] + r1;
            int c = dir[i][1] + c1;
            if (r >= startR && c >= startC && r <= r2 && c <= c2   // stay inside the rectangle
                && r < n && c < m                                  // stay inside the matrix
                && !vis[r][c]) {
                dfs(vis, r, c, startR, startC, r2, c2, n, m);
            }
        }
    }
}