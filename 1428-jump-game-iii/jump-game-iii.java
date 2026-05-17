class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        if(start < 0 || start >= n) return false;
        boolean[] visit = new boolean[n];
        visit[start] = true;
        boolean changed = true;
        while(changed){
            changed = false;
            for(int i = 0; i < n; i++){
                if(!visit[i]) continue;
                if(arr[i] == 0) return true;
                int forw = i + arr[i];
                int bacw = i - arr[i];
                if(forw < n && !visit[forw]){ visit[forw] = true; changed = true; }
                if(bacw >= 0 && !visit[bacw]){ visit[bacw] = true; changed = true; }
            }
        }
        return false;
        // int n = arr.length;
        // if(start < 0 || start >= n) return false;
        // boolean[] visit = new boolean[n];
        // while(start >= 0 && start < n && !visit[start]){
        //     visit[start] = true;
        //     if(arr[start]==0) return true;
        //     int forw = start+arr[start];
        //     int bacw = start-arr[start];
        //     if(forw >= 0 && forw < n && !visit[forw]){
        //         start = forw;
        //         continue;
        //     }
        //     else if(bacw >= 0 && bacw < n && !visit[bacw]){
        //         start = bacw;
        //         continue;
        //     }
        //     else break;
        // }
        // return false;
    }
}