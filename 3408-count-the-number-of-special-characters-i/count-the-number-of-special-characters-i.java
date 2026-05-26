class Solution {
    public int numberOfSpecialChars(String s) {
        Set<Character> arr = new HashSet<>();
        int count = 0;
        for(char ch : s.toCharArray()) arr.add(ch);
        for(char ch : arr){
           if(ch >= 'A' && ch <= 'Z' && arr.contains(Character.toLowerCase(ch))){
              count++;
           }
        }
        return count;
        // int count = 0;
        // char[] arr = s.toCharArray();
        // for(int i = 0; i < arr.length; i++){
        //     if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        //        char lower = (char)(s.charAt(i)+32);
        //        if(s.contains(""+lower)) count++;
        //        int idx = s.indexOf(lower);
        //        arr[i] = '0';
        //        if(idx > 0) arr[idx] = '0';
        //     }
        // }
        // return count;
    }
}