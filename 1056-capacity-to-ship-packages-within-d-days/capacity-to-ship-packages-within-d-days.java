class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        for(int num : weights) max = Math.max(max,num);
        int l = max, h = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        int n = weights.length;
        while( l <= h){
            int capacity = l +(h-l)/2;
            int current = capacity;
            int totalDays = 1;
            for(int i = 0; i < n; i++){
                if(current < weights[i]){
                    totalDays++;
                    current = capacity;
                }
                current-=weights[i];
            }
            if(totalDays <= days){
                ans = capacity;
                h = capacity-1;
            }
            else l = capacity+1;
        }
        return ans;
    }
}