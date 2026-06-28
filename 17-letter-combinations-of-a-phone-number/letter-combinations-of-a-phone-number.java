class Solution {
    public void helper(int idx, List<String> ans, String digits,StringBuilder curr,String[] arr){
        if(idx == digits.length()){
            ans.add(curr.toString());
            return;
        }
        String temp = arr[digits.charAt(idx)-'2'];
        for(char c : temp.toCharArray()){
            curr.append(c);
            helper(idx+1,ans,digits,curr,arr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] arr = {"abc","def","ghi", "jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        helper(0,ans,digits,curr,arr);
        return ans;
    }
}