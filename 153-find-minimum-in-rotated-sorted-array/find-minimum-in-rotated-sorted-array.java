class Solution {
    public int findMin(int[] nums) {
        int s = 0, n = nums.length, e = n-1;
        int peak = 0;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[0] <= nums[mid]){
              peak = mid;
              s = mid+1;  
            }else e = mid - 1;
        }
        if(peak == n-1) return nums[0];
        return nums[peak+1];
    }
}