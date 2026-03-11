package Day_thirtyfive;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerdemo1 {
    public static void main(String[] args){

        //1.获取一个随机大的整数
          //Random r = new Random();
          //BigInteger bo1 = new BigInteger(12345,r);
          //System.out.println("随机生成的整数为：" + bo1);

        //2.获取一个指定大的整数,注意只能是数字字符串
          //BigInteger bo2 = new BigInteger("100");
          //System.out.println(bo2);

        //3.获取指定进制大的整数
          //BigInteger bo3 = new BigInteger("100",3);
          //System.out.println("二进制100转换为十进制：" + bo3);

        //4.静态方法获取BigInteger对象
          //BigInteger bd4 = BigInteger.valueOf(1000000000);
          //System.out.println("BigInteger对象bd4的值为：" + bd4);
        //获取long类型的最大值
          //System.out.println("long类型的最大值为：" + Long.MAX_VALUE);

        //5.对象一旦创建内部的数据不能发生改变
        BigInteger bd5 = BigInteger.valueOf(17);
        BigInteger bd6 = BigInteger.valueOf(17);

        BigInteger result = bd5.add(bd6);
        System.out.println("bd5和bd6相加的结果为：" + result);
    }
}
