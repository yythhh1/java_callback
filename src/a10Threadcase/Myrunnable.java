package a10Threadcase;

public class Myrunnable implements Runnable{
    int ticket;

    @Override
    public void run(){
        //1.循环 2.先写同步代码块后面改成同步方法 3.判断共享数据是否到了末尾 如果到了末尾 4.判断共享数据是否到了末尾 如果没到末尾
        while(true){
                if (method()) break;
        }
    }

    synchronized private boolean method() {
        if (ticket == 1000) {
            return true;
        }else{
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        }
        return false;
    }
}
