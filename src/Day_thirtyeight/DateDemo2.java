package Day_thirtyeight;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args){
        //1.创建一个Date对象表示时间原点
        Date d1 = new Date(0L);
        //2.获取d1的时间毫秒值
        long time = d1.getTime();

        time = time + 1000L * 60 * 60 * 24 * 365;
        //3.重新设置d1的时间
        d1.setTime(time);
        //4.输出d1
        System.out.println("d1的时间:" + d1);
    }
}
