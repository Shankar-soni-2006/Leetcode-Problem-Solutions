class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char temp = s.charAt(i);
            if(temp >='a' && temp <= 'z') sb.append(temp);
            else if(temp=='*' && sb.length() > 0) sb.setLength(sb.length()-1);
            else if(temp=='#') sb.append(sb.toString());
            else sb.reverse(); 
        }
        return sb.toString();
    }
}