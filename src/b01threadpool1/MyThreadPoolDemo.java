package b01threadpool1;

import a05Threadcase.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args){
        //创建线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();

        //提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //销毁线程池
        pool1.shutdown();
    }
}
