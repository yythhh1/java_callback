package Day_fortyone;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args){
        //1.获取日历对象
       Calendar c =  Calendar.getInstance();
       System.out.println(c);
       //2.修改日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);

        System.out.println(c);
    }
}
