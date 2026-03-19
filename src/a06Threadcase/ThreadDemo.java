package a06Threadcase;

public class ThreadDemo {
    public static void main(String[] args){

        /**
         * final void setDaemon(boolean on) 设置线程为守护线程
         * 细节：
         *     当其他的非守护线程执行完毕后，守护线程会陆续结束
         * 如下面的例子，线程1是非守护线程，线程2是守护线程，当线程1执行完毕后，线程2也会随之结束
         *     注意：守护线程不是立即结束，而是等待到正在执行的非守护线程结束完后再陆续结束，不过守护线程不会运行完
         * 举一个守护线程的应用场景：比如用qq和别人聊天的聊天时你发送了一个文件，那聊天窗口就相当于一个非守护线程，而发送文件的线程就相当于一个守护线程，当聊天窗口关闭，发送文件的线程也会随之停止
         */
        Mythread01 t1 = new Mythread01();
        Mythread02 t2 = new Mythread02();

        t1.setName("线程1");
        t2.setName("线程2");

        t2.setDaemon(true);//将线程2设置为守护线程，守护线程会随着主线程的结束而结束

        //开始线程
        t1.start();
        t2.start();
    }
}
