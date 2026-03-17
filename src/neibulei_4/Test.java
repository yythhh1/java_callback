package neibulei_4;

public class Test {
    public static void main(String[] args){

        new Swim(){
            @Override
            public void swim(){
                System.out.println("匿名内部类实现了接口");
            }
        };

        new Animal(){
            @Override
            public void eat(){
                System.out.println("重写了eat方法");
            }
        };
    }
}
