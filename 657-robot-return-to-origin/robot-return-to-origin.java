class Solution {
    public boolean judgeCircle(String moves) {
        char [] str = moves.toCharArray();
        int x = 0;
        int y = 0;
        for(int i =0 ;i<str.length;i++){
            if(str[i]=='U') x++;
            if(str[i]=='D') x--;
            if(str[i]=='L') y--;
            if(str[i]=='R') y++;
        }
        if(x==0 && y==0) return true;
        else return false;
    }
}