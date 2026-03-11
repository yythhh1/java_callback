package Day_fortyone;

public class IntegerDemo4 {
    public static void main(String[] args){
        //1.将整数转化为二进制，八进制，十六进制
        String str = Integer.toBinaryString(100);
        System.out.println("100的二进制表示为：" + str);

        System.out.println("-----------");
        String str2 = Integer.toOctalString(100);
        System.out.println("100的八进制表示为：" + str2);

        System.out.println("-----------");
        String str3 = Integer.toHexString(100);
        System.out.println("100的十六进制表示为：" + str3);

        //2.将字符串转化为整数
        System.out.println("-----------");
        int i = Integer.parseInt("123");
        System.out.println("字符串123转化后的类型为:"  + i);
    }
}
