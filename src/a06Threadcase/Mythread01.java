package a06Threadcase;

public class Mythread01 extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<= 100;i++){
            System.out.println(getName() + "正在执行" + i);
        }
    }
}
