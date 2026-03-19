package a05Threadcase;

public class ThreadDemo {
    public static void main(String[] args){

        //创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr,"线程1");
        Thread t2 = new Thread(mr,"线程2");

        //看默认优先级是多少,可以看到默认优先级是5
        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());*/

        //设置线程优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
