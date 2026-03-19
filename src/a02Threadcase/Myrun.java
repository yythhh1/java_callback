package a02Threadcase;

public class Myrun implements Runnable{
    @Override
    public void run(){
        for(int i = 0;i < 100;i++){
            //获取到当前线程的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "myrun" + i);
        }
    }

}
