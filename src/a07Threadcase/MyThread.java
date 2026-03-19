package a07Threadcase;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+"@"+i);
            //表示让出当前cup的执行权
            Thread.yield();
        }
    }
}
