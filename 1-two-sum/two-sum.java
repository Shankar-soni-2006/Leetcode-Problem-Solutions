class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int required = target-nums[i];
            if(map.containsKey(required)){
                arr[0] = map.get(required);
                arr[1] = i;
            }
            map.put(nums[i],i);
        }
        return arr;
        // int[] arr = new int[2];
        // for(int i = 0; i < nums.length-1; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             arr[0] = i;
        //             arr[1] = j;
        //             return arr;
        //         }
        //     }
        // }
        // return null;
    }
    
}