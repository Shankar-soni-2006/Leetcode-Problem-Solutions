class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int cnt = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0;
        while(i < trainers.length && j < players.length){
            if(trainers[i] >= players[j]){
                i++;
                j++;
                cnt++;
            }else i++;
        }
        return cnt;
    }
}