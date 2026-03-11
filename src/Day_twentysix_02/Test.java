package Day_twentysix_02;

public class Test {
    public static void main(String[] args){
        Frog f = new Frog("小青蛙",2);
        System.out.println(f.getName() + " " + f.getAge());
        f.eat();
        f.swim();

        //创建兔子的对象
        Rabbit r = new Rabbit("小白兔",3);
        System.out.println(r.getName() + " " + r.getAge());
        r.eat();
        //r.swim(); // 兔子没有实现Swim接口，所以不能调用swim方法
    }
}
