package a01Threadcase;

public class Mythread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100;i++){
            System.out.println(getName()+("Mythread"+i));
        }
    }
}
