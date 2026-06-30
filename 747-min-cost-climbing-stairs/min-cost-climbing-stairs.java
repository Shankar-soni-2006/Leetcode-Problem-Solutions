class Solution {
    int []dp;
    public int f(int i, int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=cost[i]+Math.min(f(i+1,cost),f(i+2,cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(f(0,cost),f(1,cost));
    }
}