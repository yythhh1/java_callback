package Day_twentyeight_02;

public class Test {
    public static void main(String[] args){
        Outer o = new Outer();
        System.out.println(o.getInnerInstance());
        // 或者用一个内部类去接受创建的成员变量
        Object inner = o.getInnerInstance();
        System.out.println(inner);

        Outer.Inner inner1 = new Outer().new Inner();
        inner1.show();
    }
}
