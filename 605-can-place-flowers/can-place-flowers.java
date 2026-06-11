class Solution {
    public boolean canPlaceFlowers(int[] seats, int k) {
        int n = seats.length;
        for (int i = 1; i < n; i++) {
            if (seats[i] == 1 && seats[i - 1] == 1) {
                return false;
            }
        }
        for(int i = 0; i < n; i++){
            if(seats[i]==0){
                if((i == 0 || seats[i-1] == 0) && (i == n-1 || seats[i+1] == 0)){
                seats[i] = 1;
                k--;
                if(k==0) return true;}
            }
        }
        return k<=0;
    }
}