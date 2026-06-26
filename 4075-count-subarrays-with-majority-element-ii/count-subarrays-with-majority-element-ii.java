class Fenwick{
    int n;
    int[] arr;
    public Fenwick(int n){
        this.n = n;
        this.arr = new int[n+1];
    }
    public void update(int x, int delta){
        for(;x <= n;x+=(x&-x)){
            arr[x]+=delta;
        }
    }
    public int query(int x){
        int s = 0;
        for(;x>0;x-=(x&-x)){
            s+=arr[x];
        }
        return s;
    }
}
class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        Fenwick fc = new Fenwick(2*n+1);
        long res = 0;
        int s = n+1;
        fc.update(s,1);
        for(int i : nums){
            if(i==target) s+=1;
            else s-=1;
            res += fc.query(s-1);
            fc.update(s,1);
        }
        return res;
    }
}