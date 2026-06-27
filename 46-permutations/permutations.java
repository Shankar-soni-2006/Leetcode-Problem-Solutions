class Solution {
    public void helper(int ind, List<List<Integer>> ans, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(ind + 1, ans, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,ans,temp, nums);
        return ans;
    }
}