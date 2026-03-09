class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int sr = 0;
        int er = n - 1;
        int sc = 0;
        int ec = m - 1;
        while (sr <= er && sc <= ec) {
            //starting row
            for (int i = sc; i <=ec; i++) {
                ans.add(matrix[sr][i]);
            }
            sr++;
            //ending column
            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }
            ec--;
            //ending row
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    ans.add(matrix[er][i]);
                }
                er--;

            }

            
            //starting column
            if(sc<=ec){
                for(int i = er;i>=sr;i--){
                    ans.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return ans;
    }
}