class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a,b)-> b[k]-a[k]);
        int[][] ans = new int[score.length][score[0].length];
        for(int i = 0;i < score.length; i++){
            for(int j = 0;j<score[0].length; j++){
                 ans[i][j] = score[i][j];
            }
        }
        return ans;
    }
}