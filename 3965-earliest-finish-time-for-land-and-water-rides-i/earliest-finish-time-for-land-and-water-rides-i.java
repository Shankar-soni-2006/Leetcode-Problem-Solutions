class Solution {
    public int earliestFinishTime(int[] lST, int[] lD, int[] wST, int[] wD) {
        int lmin = Integer.MAX_VALUE;
        int ln = lST.length;
        for(int i = 0 ; i < ln; i++) lmin = Math.min(lmin,(lST[i] +lD[i]));

        int wMin = Integer.MAX_VALUE;
        int Wn = wST.length;
        for(int i = 0 ; i < Wn; i++) wMin = Math.min(wMin,(wST[i] + wD[i]));
        
        int minTime = Integer.MAX_VALUE;
        for(int i = 0; i < Wn; i++) minTime = Math.min(minTime,(Math.max(lmin,wST[i])+wD[i]));

        for(int i = 0; i < ln; i++) minTime = Math.min(minTime,(Math.max(wMin,lST[i])+lD[i]));

        // System.out.print(lmin+" "+wMin+" "+minTime);
        return minTime;
    }
}