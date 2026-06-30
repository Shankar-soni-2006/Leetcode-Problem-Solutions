class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] part = path.split("/");
        for(String x :part){
            if(x.equals("") || x.equals(".")) continue;
            else if(x.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(x);
        }
        if(st.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder();
        for(String x : st){
            ans.append("/").append(x);
        }
        return ans.toString();
    }
}