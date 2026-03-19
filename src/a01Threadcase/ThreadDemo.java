package a01Threadcase;

public class ThreadDemo {
    public static void main(String[] args){
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
