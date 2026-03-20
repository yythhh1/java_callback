package a13Threadcase;

public class Cook extends Thread{
    @Override
    public void run(){
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    //如果没有了，就结束线程
                    break;
                }else{
                    //判断桌子上是否有面条
                    if(Desk.foodFlag == 1){
                        //如果有就等待
                        try{
                            Desk.lock.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }else{
                        //如果没有就制作食物
                        System.out.println("厨师做了一碗面条");
                        //修改桌子上的食物状态
                        Desk.foodFlag = 1;
                        //叫醒等待的消费者开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
