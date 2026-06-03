class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1, high = Integer.MAX_VALUE, ans = Integer.MAX_VALUE;
        while(low <= high){
            int rate = low+(high-low)/2;
            long totalHours = 0;
            for(int i = 0; i < n ;i++){
                long hour = (long)Math.ceil((double)piles[i]/(double)rate);
                totalHours+=hour;
            }
            if(totalHours<=h){
                ans = rate;
                high = rate-1;
            }else low = rate+1;
        }
        return ans;
    }
}