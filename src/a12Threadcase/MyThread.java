package a12Threadcase;

public class MyThread extends Thread{
    static Object objA = new Object();
    static Object objB = new Object();

    @Override
    public void run(){
        //循环
        while(true){
            if("线程A".equals(getName())){
                synchronized (objA){
                    System.out.println("线程A拿到了锁A,准备拿锁B");
                    synchronized (objB){
                        System.out.println("线程A拿到了锁B，顺利执行完一轮");
                    }
                }
            }else if("线程B".equals(getName())){
                if("线程B".equals(getName())){
                    synchronized (objB){
                        System.out.println("线程B拿到了锁B，准备拿锁A");
                        synchronized (objA){
                            System.out.println("线程B拿到了锁A,顺利执行完一轮");
                        }
                    }
                }
            }
        }
    }
}
