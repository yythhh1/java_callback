package a13Threadcase;

public class ThreadDemo {
    public static void main(String[] args){
        //需求：实现生产者和消费者（等待唤醒机制）代码，实现线程轮流交替执行的效果

        //创建线程对象
        Cook c = new Cook();
        Food f = new Food();

        //给线程设置名字
        c.setName("厨师");
        f.setName("吃货");

        //开启线程
        c.start();
        f.start();

    }

}
