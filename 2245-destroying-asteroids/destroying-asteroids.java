class Solution {
    public boolean asteroidsDestroyed(int mass, int[] num) {
        Arrays.sort(num);
        long weight = mass;
        for(int i = 0 ; i < num.length; i++){
            if(num[i] <= weight){
                weight+=num[i];
            }else return false;
        }
        return true;
    }
}