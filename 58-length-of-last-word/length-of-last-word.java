class Solution {
    public int lengthOfLastWord(String s) {
        int curr = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(curr == 0) continue;
                else break;
            }
            curr++;
        }
        return curr;
    }
}