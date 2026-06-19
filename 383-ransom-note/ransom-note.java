class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char c : magazine.toCharArray()) freq[c-'a']++;

        for(char d : ransomNote.toCharArray()){
            freq[d-'a']--;
            if(freq[d-'a'] < 0) return false;
        }
        return true;
        
    }
}