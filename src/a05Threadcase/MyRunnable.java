package a05Threadcase;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println(Thread.currentThread().getName() + "正在执行" + i);
        }
    }

}
