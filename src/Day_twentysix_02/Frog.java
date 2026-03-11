package Day_twentysix_02;

public class Frog extends Animal implements Swim{
    @Override
    public void eat(){
        System.out.println("青蛙在吃害虫");
    }

    @Override
    public void swim(){
        System.out.println("青蛙在水中游泳");
    }

    public Frog(){

    }

    public Frog(String name,int age){
        super(name,age);
    }
}
