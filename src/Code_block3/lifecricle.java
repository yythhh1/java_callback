package Code_block3;

public class lifecricle {
    static{
        System.out.println("静态代码块，，只执行一次");
    }
    {
        System.out.println("构造代码块，每次创建对象都会执行");

    }
    public lifecricle() {
        System.out.println("③ 我是构造方法！(在构造代码块之后执行)");
    }
}
