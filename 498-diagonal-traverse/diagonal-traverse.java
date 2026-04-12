class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] arr = new int[row*col];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(idx<row*col){
            arr[idx++] = mat[i][j];
            //if upward
            if((i+j)%2==0){
                if(j==col-1) i++;
                else if(i==0) j++;
                else{
                    i--;
                    j++;
                }
            }
            //if downward
            else{
                if(i==row-1) j++;
                else if(j==0) i++;
                else{
                    i++;
                    j--;
                }
            }
        }
        return arr;
    }
}