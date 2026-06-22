class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int[] freq = new int[26];
        for(int i = 0; i < n; i++) freq[text.charAt(i)-'a']++;
        String temp = "balloon";
        // int count = 0;
        int i = 0;
        int maxBalloons = freq[1];             
        maxBalloons = Math.min(maxBalloons, freq[0]);       
        maxBalloons = Math.min(maxBalloons, freq[11] / 2); 
        maxBalloons = Math.min(maxBalloons, freq[14] / 2); 
        maxBalloons = Math.min(maxBalloons, freq[13]);
        return maxBalloons;
    }
}