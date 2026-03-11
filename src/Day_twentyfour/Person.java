package Day_twentyfour;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类空的无参构造器");
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;

    }
}
