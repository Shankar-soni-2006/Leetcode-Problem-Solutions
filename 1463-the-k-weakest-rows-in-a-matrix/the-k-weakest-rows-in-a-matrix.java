class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        Integer [] count = new Integer[n];
        Integer [] idx = new Integer[n];
        for(int i = 0 ; i< n; i++) idx[i] = i;
        for(int i = 0; i < n; i++){
            int oneCount = 0;
            for(int j = 0; j < m; j++){
                oneCount+=mat[i][j];
            }
            count[i] = oneCount;
            
        }
        Arrays.sort(idx,(a,b) -> count[a]-count[b]);
        int[] ans = new int[k];
        for(int i = 0; i < k; i++ ){
            ans[i] = idx[i];
        }
        return ans;
    }
}