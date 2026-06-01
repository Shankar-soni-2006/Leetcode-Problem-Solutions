class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int sum = 0;
        // if(n <= 2){
        //     for(int num : cost) sum+=num;
        // }
        int x = 0;
        for(int i = n-1; i >= 0; i--){
            x++;
            if(x==3){
                x = 0;
                continue;
            } 
            sum+=cost[i];    
        }
        return sum;
    }
}