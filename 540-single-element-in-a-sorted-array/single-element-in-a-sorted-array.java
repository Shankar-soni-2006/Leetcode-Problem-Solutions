class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0; 
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid<n-1 && nums[mid]==nums[mid+1]){
               if(mid%2==0)  low = mid+2;
               else high = mid-1;
            }else if(mid-1>=0 && nums[mid]==nums[mid-1]){
               if(mid%2==0)  high = mid-2; 
               else low = mid+1;
            }else return nums[mid];    
        }
        return -1;
    }    
}