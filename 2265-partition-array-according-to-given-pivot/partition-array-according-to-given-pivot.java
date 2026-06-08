class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int small =0;
        int pCount = 0;
        // int great = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < pivot) small++;
            else if(nums[i]==pivot) pCount++;   
        }
        int[] ans = new int[n];
        int sIdx = 0, pIdx = small, gIdx = small+pCount;
        for(int i = 0; i < n; i++){
           if(nums[i] < pivot) ans[sIdx++] = nums[i];
           else if(nums[i] == pivot) ans[pIdx++] = nums[i];
           else ans[gIdx++] = nums[i];
            
        }
        return ans;
    }
}