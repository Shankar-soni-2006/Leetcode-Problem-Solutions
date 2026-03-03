class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum = n*(n+1);
        if(n==1) return 1;
        for(int i=n;i>1;i--){
            if(oddSum %i==0 && evenSum%i==0) return i;
        }
        return -1;
    }
}