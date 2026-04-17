package threadpooldemo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args){
//        //获取无上限的线程池
//        ExecutorService pool1 = Executors.newCachedThreadPool();
//
//        //提交任务
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//
//        //线程的销毁
//        pool1.shutdown();

        //获取有上限的线程池
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
    }
}
