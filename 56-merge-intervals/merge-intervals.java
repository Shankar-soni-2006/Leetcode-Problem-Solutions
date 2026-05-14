class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        int j = 0;
        for(int i = 0; i< intervals.length; i++){
            if(intervals[i][0] <= ans.get(j)[1]){
               ans.get(j)[1] = Math.max(ans.get(j)[1],intervals[i][1]);
            }else{
                ans.add(intervals[i]);
                j++;
            }    
        }
        return ans.toArray(new int[j][]);
    }
}