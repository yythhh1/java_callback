package Code_block2;

public class Dog {
    {
        System.out.println("构造代码块，初始化健康度");
    }
    Dog(){
        System.out.println("这是一只未命名的小狗");
    }
    Dog(String name){
        System.out.println("这是一只名叫" + name + "的小狗");
    }
}
