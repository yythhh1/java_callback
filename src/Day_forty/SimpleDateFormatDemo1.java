package Day_forty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //1.利用空参构造创建SimpleDateFormat对象,默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println("默认格式化:" + str);
        //2.利用带参构造创建SimpeDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2.format(d);
        System.out.println("指定格式:" + str2);

        //3.定义一个字符串表示时间
        String str1 = "2023年10月01日 12:00:00";

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(str1);
        System.out.println("解析字符串得到的时间:" + date);

    }
}
