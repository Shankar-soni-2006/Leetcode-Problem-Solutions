class Solution {
    public int countKthRoots(int l, int r, int k) {
        int count = 0;
        if(k==1) return r-l+1;
        for(int i = 0; i <= r; i++){
            if(Math.pow(i,k) > r) break;
            if(Math.pow(i,k) >= l) count++;
        }
        return count;
        // int rootCount = 0;
        // for(int i = l ; i <= r; i++){
        //     for(int j = 0; j <= r;j++){
        //         if(i == (int)(Math.pow(j,k))) rootCount++;
        //     }    
        // }
        // return rootCount;
        // long a = (long)Math.ceil(Math.round(Math.pow(l,1.0/k)*1e10)/1e10);
        // long b = (long)Math.floor(Math.round(Math.pow(r,1.0/k)*1e10)/1e10);
        // if(a <= b) return (int)(b-a+1);
        // return 0;
    }
}