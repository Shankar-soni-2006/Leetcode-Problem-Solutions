class Solution {
    public String removeSpaceBetnWords(String x){
        String s1 = x.trim();
        int spaceCount = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i = 0 ; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch != ' '){
                word.append(ch);
                spaceCount = 0;
            }else{
                spaceCount++;
                if(spaceCount == 1){
                    sb.append(word).append(" ");
                    word.delete(0, word.length());
                }
            }
        }
        sb.append(word);
        return sb.toString();
    }
    public String reverseWords(String s) {
        String remove = removeSpaceBetnWords(s);
        String[] arr = remove.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            ans.append(arr[i]);
            if(i != 0) ans.append(" ");
        } 
        return ans.toString();      
    }
}