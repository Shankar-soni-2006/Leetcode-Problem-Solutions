class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> st = new Stack<>();
        List<Integer> al = new ArrayList<>();
        for(int no : nums){
            while(no>0){
                st.push(no%10);
                no/=10;
            }
            while(!st.isEmpty()){
                al.add(st.pop());
            }
        }
        int result[] = new int[al.size()];
        for(int i = 0;i<al.size();i++){
            result[i] = al.get(i);
        }
        return result;
    }
}