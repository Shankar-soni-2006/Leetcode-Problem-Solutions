class Solution {
    // public int binarySearch(int[] arr, int x){
    //     int low = 0, high = arr.length-1;
    //     while(l <= h){

    //     }
    // }
    public int search(int[] nums, int target) {
        int s = 0, n = nums.length, e = n-1;
        int peak = 0;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[0] <= nums[mid]){
              peak = mid;
              s = mid+1;  
            }else e = mid - 1;
        }
        s = 0;
        e = peak;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) s = mid+1;
            else e = mid-1;
        }
        s = peak+1; 
        e = n-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) s = mid+1;
            else e = mid-1;
        }
        return -1;
    }
} 