class Solution {
    public boolean check(int[] nums) {
        // int min = 0;
        int n = nums.length;
        int great = 0;
        if(nums[0] < nums[n-1]) great++;
        for(int i = 0 ; i < n-1; i++){
           if(nums[i] > nums[i+1]) great++;
           if(great>1){
            return false;
           }
        }
        System.out.print(great);
        return true;
    }
}