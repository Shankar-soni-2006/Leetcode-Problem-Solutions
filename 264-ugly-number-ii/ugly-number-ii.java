class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int two = 0,three = 0, five = 0;
        for(int i = 1; i < n; i++){
            int t = arr[two]*2;
            int th = arr[three]*3;
            int fi = arr[five]*5;
            int num = Math.min(t,Math.min(th,fi));
            arr[i] = num;
            if(num == t) two++;
            if(num == th) three++;
            if(num == fi) five++;
        }
        return arr[n-1];
    }
}