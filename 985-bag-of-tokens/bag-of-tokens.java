class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int maxScore = 0;
        int currScore = 0;
        int n = tokens.length;
        int j = n-1 , i=0;
        Arrays.sort(tokens);
        while(i<=j){
            if(tokens[i] <= power){
                currScore++;
                power-=tokens[i++];
            }else if(currScore > 0){
                currScore--;
                power+=tokens[j--];
            }
            else break;
            maxScore = Math.max(maxScore, currScore);
        }
        return maxScore;
    }
}