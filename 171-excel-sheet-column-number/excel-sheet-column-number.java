class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;
        int i = 0;
        while(i < n){
            int val = ((columnTitle.charAt(i)-'A')+1)*((int)Math.pow(26,n-i-1));
            ans+=val;
            i++;
        }
        return ans;
    }
}