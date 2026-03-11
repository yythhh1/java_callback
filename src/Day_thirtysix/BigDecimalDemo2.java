package Day_thirtysix;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args){
        //1.通过传递double类型的小数来创建对象
        //这种方式可能是不准确的，因为double类型的小数在内存中是近似值
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        //2.通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println("0.01 + 0.09 = " + bd5);

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(0.09);
        System.out.println(bd6);
    }
}
