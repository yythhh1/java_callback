package a07Threadcase;

public class ThreadDemo{
    public static void main(String[] args){
        /**
         * public static void yield(); 礼让线程，当前线程暂停，让出cpu执行权，重新进入就绪状态
         */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
