class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int sum = 0;
            while(temp!=0){
                int rem = temp%10;
                sum+=rem;
                temp/=10;
            }
            nums[i] = sum;
            sum= 0;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min) min = nums[i];
        }
        return min;
    }
}