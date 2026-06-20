class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n < 2) return 0;
        Arrays.sort(nums);
        int diff = 0;
        int currdiff = 0;
        for(int i = 0; i < n-1; i++){
            currdiff = nums[i+1] - nums[i];
            diff = Math.max(currdiff, diff);
        }
        return diff;
    }
}