class Solution {
    // private void f(int ind, int target, List<Integer> temp, List<List<Integer>> ans, int[] nums) {
    //     if(ans.contains(temp)) return;
    //     if (ind == nums.length) {
    //         if (target == 0) {
    //             ans.add(new ArrayList<>(temp));
    //         }
    //         return;
    //     }
    //     if (nums[ind] <= target) {
    //         temp.add(nums[ind]);
    //         f(ind+1, target - nums[ind], temp, ans, nums);
    //         temp.remove(temp.size() - 1);
    //     }
    //     // f(ind + 1, target, temp, ans, nums);
    // }
    public void helper(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target,int sum, int idx){
        if(sum == target){ 
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target) return;
        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            temp.add(candidates[i]);
            helper(ans, temp, candidates, target, sum+candidates[i], i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = candidates.length;
        // f(0,target, temp, ans, candidates);
        helper(ans,temp,candidates,target,0,0);
        return ans; 
    }
}