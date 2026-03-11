package Day_thirty;

public class Test {
    public static void main(String[] args) {
        /*
        匿名内部类的格式:
        new 接口名(){
        重写方法;
        }
         */

        new Swim(){
            @Override
            public void swim(){
                System.out.println("重写了游泳的方法");
            }
        };//这里要加上分号因为这算是一整个语句
    }
}
