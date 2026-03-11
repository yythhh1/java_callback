package Day_fortyone;

public class IntergerDemo2 {
    public static void main(String[] agrs){
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(200);
        //计算包装类,步骤
        //1.把对象进行拆箱，变成基本数据类型
        //2.进行计算
        //3.把基本数据类型进行装箱，变成包装类对象
        int result = i1.intValue() + i2.intValue();
        Integer i3 = Integer.valueOf(result);
        System.out.println("i3 = i1 + i2 = " + i3);
    }
}
