class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (int)Math.sqrt(c);
        while(l <= r){
            long target = l * l + r * r;
            if(c == target) return true;
            else if(c < target) r--;
            else l++;
        }
        return false;
    }
}