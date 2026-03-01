class Solution {
    public int minPartitions(String n) {
        char[] arr = n.toCharArray();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int a = arr[i]-'0';
            if(a > max) max = a;
        }
        return max;
    }
}