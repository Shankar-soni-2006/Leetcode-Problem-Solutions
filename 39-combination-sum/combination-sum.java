class Solution {
    private void f(int ind, int target, List<Integer> temp, List<List<Integer>> ans, int[] nums) {
        if (ind == nums.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (nums[ind] <= target) {
            temp.add(nums[ind]);
            f(ind, target - nums[ind], temp, ans, nums);
            temp.remove(temp.size() - 1);
        }
        f(ind + 1, target, temp, ans, nums);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        f(0, target, temp, ans, candidates);
        return ans;
    }
}
