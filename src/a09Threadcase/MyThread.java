package a09Threadcase;

public class MyThread extends Thread{
    static int ticket = 0;
    //锁对象一定要是唯一的
    static Object obj = new Object();
    @Override
    public void run(){
            while (true) {
                synchronized (obj) {
                    if (ticket < 1000) {
                        ticket++;
                        System.out.println(getName() + "正在卖第" + ticket + "张票");
                }   else {
                        break;
                }
            }
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
