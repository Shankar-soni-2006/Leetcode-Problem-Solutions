class Solution {
    public boolean isPerfectSquare(int num) {
        // if (num < 1) return false;
        // for (long  i = 1; i * i <= num; i++) { 
        //     if (i * i == num) {
        //         return true;
        //     }
        // }
        // return false;
        long l = 0, h = num;
        while(l <= h){
            long m = l+(h-l)/2;
            if((m*m) == num) return true;
            else if((m*m) < num) l = m+1;
            else h = m-1;
        }
        return false;
    }
}
