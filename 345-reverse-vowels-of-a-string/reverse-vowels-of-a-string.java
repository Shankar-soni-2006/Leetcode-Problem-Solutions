class Solution {
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public String reverseVowels(String s) {
       StringBuilder sb = new StringBuilder(s);
       List<Character> l = new ArrayList<>();
       for(int i=0;i<s.length();i++){
          if(isVowel(s.charAt(i))){
            l.add(s.charAt(i));
          }
       }
       int j = l.size()-1;
       for(int i=0;i<sb.length();i++){
          if(isVowel(s.charAt(i))){
            sb.setCharAt(i,l.get(j));
            j--;
          }
       }
       return sb.toString();
    }   
}