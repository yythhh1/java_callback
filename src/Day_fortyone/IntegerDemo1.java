package Day_fortyone;

public class IntegerDemo1 {
    public static void main(String[] args){
        //1.利用构造方法获取Integer对象(jdk5以前的方法，已经被禁用了
        /*Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);*/

        //2.利用静态方法获取Integer对象(jdk5以前的方式
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100",10);//第一个参数是字符串，第二个参数是进制

    }
}
