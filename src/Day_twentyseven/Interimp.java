package Day_twentyseven;

public class Interimp implements Inter, Inter2 {
    @Override
    public void method1(){
        System.out.println("方法1在Interimp中实现");
    }

    @Override
    public void method2(){
        System.out.println("由于Interimp实现的两个接口都有method2方法，" +
                           "因此需要在Interimp中重写method2方法以避免冲突");
    }
}
