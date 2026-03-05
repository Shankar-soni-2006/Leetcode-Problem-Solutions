class Solution {
    public int minOperations(String s) {
        int count01 = 0;
        int count10 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0){
                if(s.charAt(i)=='1') count01++;
                else count10++;
            }else{
                if(s.charAt(i)=='1') count10++;
                else count01++;
            }      
        }
        return Math.min(count01,count10);
    }
}