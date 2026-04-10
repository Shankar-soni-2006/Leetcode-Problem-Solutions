class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i : nums) ans.add(i);
        if(nums.length == ans.size()) return false;
        else return true;
    }
}