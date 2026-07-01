class Solution {
    public long helper(int mid, int k, int n){
        long total = 0;
        long curr = 1;
        for(int i = 1; i <= k; i++){
            if(i<=mid){
                curr = curr*(mid-i+1)/i;
                total+=curr;
                if(total >= n) return total;
            }
        }
        return total;
    }
    public int superEggDrop(int k, int n) {
        int low = 1;
        int high = n;
        int res = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(helper(mid,k,n)>=n){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}