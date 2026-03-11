package Day_fortyone;

public class IntegerDemo3 {
    public static void main(String[] args){
        /**
         * 自动装箱与自动拆箱
         * 自动装箱：把基本数据类型自动变成其对应的包装类
         * 自动拆箱: 把包装类自动变成其对应的基本数据类型
         */
        //自动装箱
        Integer i1 = 100;//Integer.valueOf(100);

        //自动拆箱
        Integer i2 = Integer.valueOf(200);
        int i = i2;//i2.intValue();
    }
}
