package Day_thirtyeight;

import java.util.Date;
import java.util.Random;

public class DateDemo3 {
    public static void main(String[] args) {
        Random r = new Random();

        Date d1 = new Date(r.nextInt());
        Date d2 = new Date(r.nextInt());

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if(time1 > time2){
            System.out.println("d1的时间:" + d1);
            System.out.println("d2的时间:" + d2);
            System.out.println("d1比d2晚");
        } else if(time1 < time2) {
            System.out.println("d1的时间:" + d1);
            System.out.println("d2的时间:" + d2);
            System.out.println("d1比d2早");
        } else {
            System.out.println("d1和d2的时间相同");
        }
    }
}
