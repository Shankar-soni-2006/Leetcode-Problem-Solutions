class Solution {
    public int countNegatives(int[][] grid) {
        int count  = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0 ; j < grid[i].length;j++){
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
        // int i = 0;
        // int j = grid[0].length-1;
        // while(i < matrix.length && j >= 0){
        //     if()
        // }
    }
}