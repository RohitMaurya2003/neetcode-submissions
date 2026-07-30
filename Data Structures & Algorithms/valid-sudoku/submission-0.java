class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if(verify(board,i,j,board[i][j])==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean verify(char board[][],int row,int col,char val){
        int count=0;
        for(int i=0;i<9;i++){
            if(board[row][i]==val){
                count++;
            }
        }

        if(count>=2){
            return false;
        }
        count=0;

        for(int i=0;i<9;i++){
            if(board[i][col]==val){
                count++;
            }
        }

         if(count>=2){
            return false;
        }
        count=0;
        int r=row/3*3;
        int c=col/3*3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==val){
                    count++;
                }
            }
        }
        if(count>=2){
            return false;
        }

        return true;
        
        
    }
}

