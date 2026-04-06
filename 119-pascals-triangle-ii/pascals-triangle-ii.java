class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        int n = rowIndex;
        long val = 1;
        for(int r = 0;r<=n;r++){
            arr.add((int)val);
            val = val*(n-r)/(r+1);
        }
        return arr;
    }
}