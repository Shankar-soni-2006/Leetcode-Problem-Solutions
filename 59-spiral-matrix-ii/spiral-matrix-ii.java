class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr= new int[n][n];
        int number=1;
        int srow = 0;
        int erow = n-1;
        int scol = 0;
        int ecol = n-1;
        while(srow<=erow && scol<=ecol){
            //starting row
            for(int i = scol;i<=ecol;i++){
                arr[srow][i] = number++;
            }
            srow++;
            //ending column
            for(int i = srow;i<=erow;i++){
                arr[i][ecol] = number++;
            }
            
            ecol--;
            //ending row
            if(srow<=erow){
                for(int i = ecol;i>=scol ;i--){
                   arr[erow][i] = number++;
                }
                
                erow--;
            }
            //starting column
            if(scol<=ecol){
                for(int i = erow;i>=srow;i--){
                    arr[i][scol] = number++;
                }
                
                scol++;
            }
        }
        return arr;
    }
}