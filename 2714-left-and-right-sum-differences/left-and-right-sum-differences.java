class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = {1,2,3,4};
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int sum = 0;
        leftSum[0] = 0;
        for(int i = 1 ;i < leftSum.length; i++){
            sum+=nums[i-1];
            leftSum[i] = sum;
        }

        sum = 0;
        rightSum[n-1] = 0;
        for(int i = rightSum.length-2; i >=0; i--){
           sum+=nums[i+1];
           rightSum[i] = sum;
        }
        // System.out.println(Arrays.toString(leftSum));
        // System.out.println(Arrays.toString(rightSum));
        for(int i = 0; i < n; i++) nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        return nums;
    }
} 