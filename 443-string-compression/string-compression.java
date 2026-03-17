class Solution {
    public int compress(char[] chars) { 
        if(chars.length==1) return 1;
        int i = 0;
        int length = 0;
        while(i<chars.length){
            char curr = chars[i];
            int cnt = 0;
            while(i<chars.length && chars[i]==curr){
                i++;
                cnt++;
            }
            
            chars[length++]=curr;
            if(cnt>1){
                String countStr = String.valueOf(cnt);
                for (char c : countStr.toCharArray()) {
                    chars[length++] = c;
                }
            }
        }
        return length;
    }
}