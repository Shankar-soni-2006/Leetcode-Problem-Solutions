class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int s = 0, n = nums.length, e = n-1;
        while(s < e){
            int mid = s+(e-s)/2;
            if(nums[mid] <= nums[mid+1]) s = mid+1;  
            else e = mid;
        }
        return s;
    }
}