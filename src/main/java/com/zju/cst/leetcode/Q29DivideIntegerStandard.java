package com.zju.cst.leetcode;

/**
 * @auther wulixz
 * @date 2020/2/17 5:51
 */
public class Q29DivideIntegerStandard {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("/ by zero");
        long result = divideLong(dividend, divisor);
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) result;
    }

    public long divideLong(long dividend, long divisor) {
        boolean negative = dividend < 0 != divisor < 0;
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;
        if (dividend < divisor) return 0;
        long sum = divisor;
        long divide = 1;
        while ((sum + sum) <= dividend) {
            sum += sum;
            divide += divide;
        }
        return negative ? -(divide + divideLong((dividend - sum), divisor)) : (divide + divideLong((dividend - sum), divisor));
    }
}
