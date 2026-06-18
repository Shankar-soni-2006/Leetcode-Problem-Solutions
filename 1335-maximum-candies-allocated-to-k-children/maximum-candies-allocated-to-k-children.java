class Solution {
    public boolean isPossible(int[] nums, long k, long mid){
        long curr = 0;
        for(int i = 0; i < nums.length; i++){
            curr+=(nums[i]/mid);
        }
        if(curr >= k) return false;
        return true;
    }
    public int maximumCandies(int[] candies, long k) {
       int n = candies.length;
       long low = 1, high = Integer.MAX_VALUE;
    //    long  ans = 0;
       while(low <= high){
           long maxCandy = low+(high-low)/2;
           if(isPossible(candies,k,maxCandy)) high = maxCandy-1;
           else low = maxCandy+1;
        //    long currentCandy = 0;
        //    for(int i = 0 ; i < n; i++){
        //         currentCandy+=(candies[i]/maxCandy);
        //    }
        //    if(currentCandy >= k){
        //         ans = maxCandy;
        //         low = maxCandy+1;
        //    }else{
        //         high = maxCandy-1;
        //     }
       }
        return (int)high;
    }
}