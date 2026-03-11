package Day_thirtyfive;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(15);

        //除法，获取商和余数
        BigInteger[] arr = bd2.divideAndRemainder(bd1);
        BigInteger quotient = arr[0]; //商
        BigInteger remainder = arr[1]; //余数
        System.out.println("计算得到的商的值为:" + quotient);
        System.out.println("计算得到的余数的值为:" + remainder);
    }
}
