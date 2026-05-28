class Solution {
    public boolean canJump(int[] nums) {
        int idx = 0;
        if(nums[0]==nums.length) return true;
        for(int i = 0; i < nums.length; i++){
            if( i > idx) return false;
            idx = Math.max(idx,i+nums[i]);
            // System.out.println(idx+" "+i);
            if(idx >= nums.length-1) return true;
            // idx+=nums[i];
            // i=idx;
            // if(idx == nums.length-1) return true;         
        }
        return false;
    }
}