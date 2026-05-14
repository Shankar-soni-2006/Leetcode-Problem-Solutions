class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[n-1]+1!=n) return false;
        int temp = nums[n-1];
        for(int i = 0; i < n; i++){
            if(i < n-2 && nums[i]==nums[i+1]){
                 return false;
            }else{
                if(nums[i]==temp) return true;
            }
        }
        return true;
    }
}