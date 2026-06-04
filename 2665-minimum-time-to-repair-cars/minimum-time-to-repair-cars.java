class Solution {
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long high = Long.MAX_VALUE, low = 0;
        long ans = 0;
        while(low <= high){
            long totalCars = 0;
            long time = low+(high-low)/2;
            for(int i = 0; i < n; i++){
                totalCars+=Math.sqrt((double)time/ranks[i]);
            }
            if(totalCars >= cars){
                ans = time;
                high = time-1;
            }else low = time+1;
        }
        return ans;
    }
}