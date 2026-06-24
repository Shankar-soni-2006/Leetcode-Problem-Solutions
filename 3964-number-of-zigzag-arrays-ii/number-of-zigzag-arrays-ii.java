class Solution {
    public static final long MOD = 1_000_000_007L;

    public long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;

                long aik = A[i][k];

                for (int j = 0; j < n; j++) {
                    C[i][j] = (C[i][j] + aik * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }

    public long[][] power(long[][] base, long exp) {
        int n = base.length;

        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = multiply(result, base);
            }

            base = multiply(base, base);
            exp >>= 1;
        }

        return result;
    }

    public long[] multiplyMatrixVector(long[][] A, long[] v) {
        int n = A.length;
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long cur = 0;

            for (int j = 0; j < n; j++) {
                cur = (cur + A[i][j] * v[j]) % MOD;
            }

            res[i] = cur;
        }

        return res;
    }

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[][] A = new long[m][m];
        long[][] B = new long[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = Math.min(i + 1, j + 1) - 1;
                B[i][j] = m - Math.max(i + 1, j + 1);
            }
        }

        long[] U2 = new long[m];
        long[] D2 = new long[m];

        for (int v = 0; v < m; v++) {
            U2[v] = v;
            D2[v] = m - 1 - v;
        }

        long[] U, D;

        if ((n & 1) == 0) {
            long p = (n - 2L) / 2;

            long[][] Ap = power(A, p);
            long[][] Bp = power(B, p);

            U = multiplyMatrixVector(Ap, U2);
            D = multiplyMatrixVector(Bp, D2);

        } else {

            long[] U3 = new long[m];
            long[] D3 = new long[m];

            for (int i = 0; i < m; i++) {

                for (int j = 0; j < i; j++) {
                    U3[i] = (U3[i] + D2[j]) % MOD;
                }

                for (int j = i + 1; j < m; j++) {
                    D3[i] = (D3[i] + U2[j]) % MOD;
                }
            }

            long p = (n - 3L) / 2;

            long[][] Ap = power(A, p);
            long[][] Bp = power(B, p);

            U = multiplyMatrixVector(Ap, U3);
            D = multiplyMatrixVector(Bp, D3);
        }

        long ans = 0;

        for (long x : U) {
            ans = (ans + x) % MOD;
        }

        for (long x : D) {
            ans = (ans + x) % MOD;
        }

        return (int) ans;
    }
}