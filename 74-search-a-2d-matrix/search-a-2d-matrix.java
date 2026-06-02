class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int l = 0, h = n*m-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int r = mid/m;
            int c = mid%m;
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) l = mid+1;
            else h = mid-1;
        }
        return false;

        // int low = 0;
        // int high = matrix[0].length-1;
        // while(low < matrix.length && high >= 0){
        //     // int mid = low+(high-low)/2;
        //     if(matrix[low][high] == target) return true;
        //     if(matrix[low][high] < target) low++;
        //     else if(matrix[low][high] > target) high--;
        // }
        // return false;
    }
}