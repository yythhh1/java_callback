package a04Threadcase;

import a01Threadcase.Mythread;

public class ThreadDemo {
    public static void main(String[] args){
        /**
         * String getName();获取线程名称
         * void setName(String name);设置线程名称
         *细节:
         * 1、如果我们没有给线程设置名字，线程也是有默认的名字的
         *         格式：Thread-X(X序号，从0开始的)
         * 2、如果我们要给线程设置名字，可以用set方法进行设置，也可以用构造方式进行设置
         *         注意：自己写的类中要对父类Thread的构造方式进行继承，用super调用父类的构造方法
         * static Thread currentThread();获取当前线程对象
         * 细节：
         *     当JVM虚拟机启动后，会自动的启动多条线程
         *     其中有一条线程就叫main线程
         *     他的作用就是去调用main方法，并执行里面的代码
         *     在以前，我们写的所有代码，其实都是运行在main线程当中
         * static void sleep(long time); 让当前线程进入睡眠状态，单位是毫秒即1秒 = 1000毫秒
         * 细节:
         *     1.哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
         *     2.方法参数就是停留的时间，单位是毫秒
         *     3.当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
         */
        //创建线程对象
        /*Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();*/

        //启动线程
        /*t1.start();
        t2.start();*/

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
