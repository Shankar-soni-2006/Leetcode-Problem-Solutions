class Solution {
    public void helper(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target,int sum, int idx){
        if(sum == target){ 
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target) return;
        for(int i = idx; i < candidates.length; i++){
            temp.add(candidates[i]);
            helper(ans, temp, candidates, target, sum+candidates[i], i);
            temp.remove(temp.size()-1);  
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = candidates.length;
        helper(ans, temp, candidates, target, 0, 0);
        return ans; 
    }
}