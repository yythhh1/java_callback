package Day_fifteen;

import java.util.Scanner;

public class EqualsUse {
    public static void main(String[] args) {
        //==对于基本数据类型比较具体的数据值，对于引用数据类型，比较地址值
        //equals对于基本数据类型比较具体的数据值，对于引用数据类型
        /*String str1  = new String("abc");
        String str2 = "abc";
        String str3 = "ABc";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str3));*/
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "abc";
        System.out.println(str == str2);//false
    }
}
