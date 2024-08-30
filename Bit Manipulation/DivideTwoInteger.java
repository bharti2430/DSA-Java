public int divide(int dividend, int divisor) {
        int result=0;
        // Handle edge cases for overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // 2^31 - 1
        }
         // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        // Convert both numbers to positive
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;

            // Try to subtract the largest multiple of divisor from dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest possible multiple of divisor from dividend
            absDividend -= tempDivisor;
            result += multiple;
        }

        // Apply the sign to the result
        return isNegative ? -result : result;
    }
