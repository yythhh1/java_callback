package a10Threadcase;

public class ThreadDemo {
    public static void main(String[] args){

        //创建参数对象
        Myrunnable myrunnable = new Myrunnable();

        Thread t1 = new Thread(myrunnable);
        Thread t2 = new Thread(myrunnable);
        Thread t3 = new Thread(myrunnable);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
