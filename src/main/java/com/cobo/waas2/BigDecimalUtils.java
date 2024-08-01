package com.cobo.waas2;

import java.math.BigDecimal;

public class BigDecimalUtils {
     /**
     * Converts a string to a BigDecimal.
     *
     * @param str the string to convert
     * @return the resulting BigDecimal
     * @throws NumberFormatException if the string cannot be converted to BigDecimal
     */
    public static BigDecimal stringToBigDecimal(String str) throws NumberFormatException {
        if (str == null || str.trim().isEmpty()) {
            throw new NumberFormatException("Input string cannot be null or empty");
        }
        return new BigDecimal(str);
    }

    /**
     * Converts a BigDecimal to a string.
     *
     * @param bigDecimal the BigDecimal to convert
     * @return the resulting string
     */
    public static String bigDecimalToString(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            throw new IllegalArgumentException("Input BigDecimal cannot be null");
        }
        return bigDecimal.toPlainString();
    }

    /**
     * Adds two BigDecimal numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input BigDecimal numbers cannot be null");
        }
        return a.add(b);
    }

    /**
     * Subtracts one BigDecimal number from another.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the result of a minus b
     */
    public static BigDecimal subtract(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input BigDecimal numbers cannot be null");
        }
        return a.subtract(b);
    }

    /**
     * Multiplies two BigDecimal numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input BigDecimal numbers cannot be null");
        }
        return a.multiply(b);
    }

    /**
     * Divides one BigDecimal number by another.
     *
     * @param a the dividend
     * @param b the divisor
     * @param scale the number of digits to the right of the decimal point
     * @return the result of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public static BigDecimal divide(BigDecimal a, BigDecimal b, int scale) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input BigDecimal numbers cannot be null");
        }
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return a.divide(b, scale, BigDecimal.ROUND_HALF_UP);
    }

}
