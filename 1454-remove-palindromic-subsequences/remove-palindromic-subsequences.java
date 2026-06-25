class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        int left = 0, right = n-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return 2;
            left++;
            right--;
        }
        return 1;
    }
}