class Solution {
    public int getSum(int a, int b) {
    //    return a+b;
      while(b!=0){
        int c = a&b;
        a = a^b;
        b = c <<1;
      }
      return a;
    }
}