import java.math.BigInteger;

class Solution {
    private BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;
    }

    public int numTrees(int n) {
        BigInteger ans =
            factorial(2 * n)
            .divide(factorial(n + 1).multiply(factorial(n)));

        return ans.intValue();
    }
}