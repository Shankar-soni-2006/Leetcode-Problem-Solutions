class Solution {
    public boolean Upper(String u){
        for(int i = 0 ; i < u.length() ;i++){
            if(!(u.charAt(i) >= 'A' && u.charAt(i) <= 'Z')) return false;
        }
        return true;
    }
    public boolean Lower(String l){
        for(int i = 0 ; i < l.length() ;i++){
            if(!(l.charAt(i) >= 'a' && l.charAt(i) <= 'z')) return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        if(Upper(word)) return true;
        else if(Lower(word)) return true;
        else{
            // boolean[] arr = new boolean[word.length()];
            // for(int i = 0 ; i < word.length(); i++){
            //     if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') arr[i] = true;
            //     else arr[i] = false;
            // }
            // for(int j = 0; j < arr.length-1; j++){
            //     if(arr[j]==false && arr[j+1]==true) return false; 
            // }
            if(word.length() > 0 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') return Lower(word.substring(1));
        }
        return false;
    }
}