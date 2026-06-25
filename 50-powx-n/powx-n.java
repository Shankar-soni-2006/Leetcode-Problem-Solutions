class Solution {
    public double power(double x, int n){
        if(n == 0) return 1.0;
        double h = power(x,n/2);
        if(n%2==0) return h*h;
        else return x*h*h;
    }
    public double myPow(double x, int n) {
        // long pow = n;
        if(n == 0) return 1;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        return power(x,n);
    }
}