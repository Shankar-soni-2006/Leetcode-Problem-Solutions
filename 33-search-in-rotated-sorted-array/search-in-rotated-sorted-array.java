class Solution {
    public int search(int[] nums, int target) {
        // Method 1
        // int s = 0, n = nums.length, e = n-1;
        // int peak = 0;
        // while(s <= e){
        //     int mid = s+(e-s)/2;
        //     if(nums[0] <= nums[mid]){
        //       peak = mid;
        //       s = mid+1;  
        //     }else e = mid - 1;
        // }
        // s = 0;
        // e = peak;
        // while(s <= e){
        //     int mid = s+(e-s)/2;
        //     if(nums[mid] == target) return mid;
        //     else if(nums[mid] < target) s = mid+1;
        //     else e = mid-1;
        // }
        // s = peak+1; 
        // e = n-1;
        // while(s <= e){
        //     int mid = s+(e-s)/2;
        //     if(nums[mid] == target) return mid;
        //     else if(nums[mid] < target) s = mid+1;
        //     else e = mid-1;
        // }
        // return -1;

        //Method 2
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target) return mid;
            else if(nums[s] <= nums[mid]){ // first half
                 if(target >= nums[s] && target < nums[mid]) e = mid -1;
                 else s = mid+1;
            }else{
                if(target <= nums[e] && target > nums[mid]) s = mid+1;
                else e = mid-1;
            }
        }
        return -1;
    }
} 