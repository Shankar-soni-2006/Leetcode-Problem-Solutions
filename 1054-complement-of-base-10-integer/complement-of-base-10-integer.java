class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binary);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1') sb.setCharAt(i,'0');
            else sb.setCharAt(i,'1');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}