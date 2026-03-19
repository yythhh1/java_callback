package a08Threadcase;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         *  public final void join(); 插入线程/插入线程:当前线程等待调用join方法的线程执行完毕后再继续执行
         */

        Mythread t = new Mythread();
        t.setName("线程1");
        t.start();
        //表示把t这个线程插入到当前线程之前
          //t线程指线程1
          //当前线程指的是代码运行在哪个线程之上
        t.join();
        //执行再main线程当中的
        for(int i = 1;i <= 100;i++){
            System.out.println("main线程" + i);
        }
    }
}
