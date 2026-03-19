package a02Threadcase;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class ThreadDemo {
    public static void main(String[] args){
        /**
         * 1.自己定义一个类实现Runnable接口
         * 2.重写run方法
         * 3.创建自己类的对象
         */
        //创建Myrun对象，表示多线程要执行的任务
        Myrun myrun = new Myrun();

        //开启线程对象
        Thread t1 = new Thread(myrun);
        Thread t2 = new Thread(myrun);

        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        //开启线程
        t1.start();
        t2.start();
    }
}
