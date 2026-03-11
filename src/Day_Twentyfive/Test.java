package Day_Twentyfive;

public class Test {
    public static void main(String[] args){
        Person p = new Person("张三", 20);

        Animal dog  = new Dog(3,"黑色");

        Animal cat = new Cat(2,"白色");

        p.keepAnimal(dog, "骨头");
        System.out.println("-------------------");
        p.keepAnimal(cat, "鱼");
    }
}
