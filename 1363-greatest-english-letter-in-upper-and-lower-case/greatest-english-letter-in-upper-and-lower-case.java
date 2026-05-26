class Solution {
    public String greatestLetter(String s) {
        List<Character> great = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                char upper = (char)(s.charAt(i)-32);
                if(s.contains(""+upper) && !great.contains(upper)) great.add(upper);    
            }else{
                char lower = (char)(s.charAt(i)+32);
                if(s.contains(""+lower)  && !great.contains(s.charAt(i))) great.add(s.charAt(i));    
            }
        }
        if(great.isEmpty()) return "";
        char max = great.get(0);
        for(int i = 1; i < great.size(); i++){
           if(great.get(i) > max) max = great.get(i);
        }
        return ""+max;
    }
}