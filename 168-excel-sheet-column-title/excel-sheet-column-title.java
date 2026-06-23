class Solution {
    public String convertToTitle(int columnNumber) {
        // int pow = columnNumber/26;
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            sb.append((char)('A'+(columnNumber % 26)));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}