package Day_seven;

public class StringUse {
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println(s1);

        //字符串大小写转换
        s1 = s1.toUpperCase();
        System.out.println(s1);
        s1 = s1.toLowerCase();
        System.out.println(s1);

        //将字符串中的某个字符用另外一个字符替代
        String s2 = s1.replace('l','o');
        System.out.println(s2);

        //字符串的比较
        String s3 = "hello";
        boolean b = s3.equals(s1);
        System.out.println(b);

        //检查字符串是否包含某个子串
        boolean b1 = s3.contains("ll");
        System.out.println("hello中是否包含ll" + b1);

        //搜索子串
        int sp = "hello".indexOf("l");//第一次出现的位置
        int ep =  "hello".lastIndexOf("l");//最后一次出现的位置

        //检查是否以某个子串开头或结尾
        boolean b2 = "hello".startsWith("he");
        System.out.println("检查hello是否以he开头" + b2);
        boolean b3 = "hello".endsWith("lo");
        System.out.println("检查hello是否已lo结尾" + b3);

        //提取字符串
        String s4 = "hello".substring(2);
        System.out.println("下标为2(包括2)后的所有字符" + s4);
        String s5 = "hello".substring(0,2);
        System.out.println("下标为0到下标为2的所有字符串" + s5);

        //String转换为char[]
        char[] c_array = "hello".toCharArray();//String -> char[]
        String s6 = new String(c_array);
    }
}
