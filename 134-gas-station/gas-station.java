class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0,totalCost = 0, current = 0, sIndex = 0;
        for(int i = 0; i < n; i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
            current+=gas[i] - cost[i];
            if(current < 0){
                sIndex = i+1;
                current = 0;
            }
        }
        if(totalGas < totalCost) return -1;
        return sIndex;
    }
}