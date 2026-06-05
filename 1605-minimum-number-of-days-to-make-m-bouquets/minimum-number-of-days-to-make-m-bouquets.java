class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = 1, high = Integer.MAX_VALUE;
        if((long)m*k > bloomDay.length) return -1;
        int ans = -1;
        while(low <= high){
            int day = low +(high-low)/2;
            int flowerCount = 0;
            int bouqet = 0;
            for(int i = 0; i < n; i++){
                if(bloomDay[i] <= day){
                    flowerCount++;
                    if(flowerCount==k){
                        bouqet++;
                        flowerCount = 0;
                    }
                }else flowerCount = 0;
            }
            if(bouqet >= m){
                high = day-1;
                ans = day;
            }else{
                low = day+1;
            }
        }
        return ans;
    }
}