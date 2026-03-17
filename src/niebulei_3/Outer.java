package niebulei_3;

public class Outer {
    public void show(){
        int a = 10;

        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println("局部内部类的方法被调用了");
            }

    }


        //创建局部内部类对象
        Inner i = new Inner();
        i.method1();
    }

}
