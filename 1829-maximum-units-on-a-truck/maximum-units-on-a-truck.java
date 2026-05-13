class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maxUnit = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        for(int i = 0; i < boxTypes.length; i++){
            if(boxTypes[i][0] < truckSize){
                truckSize-=boxTypes[i][0];
                maxUnit+=(boxTypes[i][0]*boxTypes[i][1]);
            }else if(truckSize==0) break;
            else{
                maxUnit+=(truckSize*boxTypes[i][1]);
                truckSize = 0;
            }
        }
        return maxUnit;
    }
}