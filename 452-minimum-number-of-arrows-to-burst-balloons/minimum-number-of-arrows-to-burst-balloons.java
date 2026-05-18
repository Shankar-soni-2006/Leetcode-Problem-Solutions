class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int minArrow = 1;
        int end = points[0][1];
        for(int[] arr: points){
            if(end >= arr[0]) continue;
            else{
                minArrow++;
                end  = arr[1];
            }
        }
        return minArrow;
    }
}