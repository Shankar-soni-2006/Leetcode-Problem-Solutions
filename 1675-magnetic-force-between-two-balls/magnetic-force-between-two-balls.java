class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1 , high = position[n-1];
        int ans = 0;
        while(low <= high){
            int minForce = low+(high-low)/2;
            int last = position[0];
            int balls = 1;
            for(int i = 1; i < n; i++){
                if(position[i] - last >= minForce){
                    last = position[i];
                    balls++;   
                }
            }
            if(balls >= m){
                ans = minForce;
                low = minForce+1;
            }else high = minForce-1;
        }
        return ans;
    }
}