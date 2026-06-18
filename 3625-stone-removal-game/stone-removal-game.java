class Solution {
    public boolean canAliceWin(int n) {
        int stoneRemove = 10;
        boolean turn = false;
        while(n >= stoneRemove){
            n-=stoneRemove;
            stoneRemove--;
            turn = !turn;
        }
        return turn;
    }
}