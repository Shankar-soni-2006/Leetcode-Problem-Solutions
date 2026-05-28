class Solution {
    public int countNegatives(int[][] grid) {
        int count  = 0;
        for(int i = 0; i < grid.length; i++){
            int low = 0, high = grid[i].length-1;
            int firstNeg = grid[i].length;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(grid[i][mid] < 0){
                    firstNeg = mid;
                    high = mid-1;
                }else low = mid+1;
            }
            count+=grid[i].length - firstNeg;
        }
        return count;
        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0 ; j < grid[i].length;j++){
        //         if(grid[i][j] < 0) count++;
        //     }
        // }
        // return count;
        // int i = 0;
        // int j = grid[0].length-1;
        // while(i < matrix.length && j >= 0){
        //     if()
        // }
    }
}