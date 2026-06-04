class Solution {
    public int maximumCandies(int[] candies, long k) {
       int n = candies.length;
       long low = 0, high = Integer.MAX_VALUE;
       long  ans = 0;
       while(low <= high){
           long maxCandy = low+(high-low)/2;
           long currentCandy = 0;
           if(maxCandy==0) break;
           for(int i = 0 ; i < n; i++){
                currentCandy+=(candies[i]/maxCandy);
           }
           if(currentCandy < k ){
                // low = maxCandy+1;
                high = maxCandy-1;
           }else{
                ans = maxCandy;
              low = maxCandy+1;
            }
       }
        return (int)ans;
    }
}