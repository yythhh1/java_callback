package Day_thirtyeight;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args){
        //1.创建空参对象，表示当前日期
        Date d = new Date();
        System.out.println("当前日期:" + d);
        //2.创建带参对象，表示指定日期,参数表示从1970年1月1日00:00:00 GMT开始的毫秒数
        Date d2 = new Date(0L);
        System.out.println("时间原点:" + d2);

        //3.setTime修改时间
        d2.setTime(1000L);
        System.out.println("修改时间:" + d2);

        //4.getTime获取时间的毫秒值
        long time = d2.getTime();
        System.out.println("获取时间的毫秒值:" + time);
    }
}
