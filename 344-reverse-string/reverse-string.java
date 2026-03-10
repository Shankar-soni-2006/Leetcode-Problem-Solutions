class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        int i = 0;
        int j = size-1;
        while(i<j){
            s[i] = (char)(s[i] + s[j]);
            s[j] = (char)(s[i]-s[j]);
            s[i] = (char)(s[i] - s[j]);
           
            // char temp = s[i];
            // s[i] = s[j];
            // s[j] = temp;
            i++;
            j--;
        }    
    }
}