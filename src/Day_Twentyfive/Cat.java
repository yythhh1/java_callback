package Day_Twentyfive;

public class Cat extends Animal{
    public Cat(){

    }
    public Cat(int age,String Color){
        super(age,Color);
    }

    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫在吃" + something);
    }

    public void meow() {
        System.out.println("喵喵喵");
    }
}
