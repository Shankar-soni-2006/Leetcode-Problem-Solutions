class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int sumS = 0;
        int sumT = 0;
        for(char c: arr1) sumS+=c;
        for(char c: arr2) sumT+=c;
        return (char) (sumT - sumS);  
    }

}
