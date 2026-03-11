package Day_thirtysix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("10.01");
        BigDecimal bd2 = new BigDecimal("0.81");
        //1.加法
        BigDecimal sum = bd1.add(bd2);
        System.out.println("10.01 + 0.81 =" + sum);
        //2.减法
        BigDecimal differnece = bd1.subtract(bd2);
        System.out.println("10.01 - 0.81 =" + differnece);
        //3.乘法
        BigDecimal product = bd1.multiply(bd2);
        System.out.println("10.01 * 0.81 =" + product);
        //4.除法
        BigDecimal bd3 = new BigDecimal("10.0");
        BigDecimal bd4 = new BigDecimal("2.0");
        BigDecimal quotient = bd3.divide(bd4);
        System.out.println("10.0 / 2.0 =" + quotient);
        //5.除不尽的情况
        BigDecimal quotient2 = bd1.divide(bd2,2, RoundingMode.HALF_DOWN);
        System.out.println("10,01 / 0.81 = " + quotient2);
    }
}
