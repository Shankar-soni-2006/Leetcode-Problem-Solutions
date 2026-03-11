class Solution {
    public char isLower(char c){
        if(c>='a' && c<='z') return c;
        return (char)((c)-('A'-'a'));          
    }
    public boolean isAlphaNumeric(char d){
       boolean isLowercase = (d>='a' && d<='z');
       boolean isUppercase = (d>='A' && d<='Z');   
       boolean isDigit = (d>='0' &&  d<='9');
       return isLowercase || isUppercase || isDigit;
    }
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r){
            while(l<r && !(isAlphaNumeric(s.charAt(l)))) l++;
            while(l<r && !(isAlphaNumeric(s.charAt(r)))) r--;
            if(isLower(s.charAt(l)) != isLower(s.charAt(r))) return false;
              l++;
              r--;
        }
        return true;
    }
}