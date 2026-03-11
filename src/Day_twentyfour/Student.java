package Day_twentyfour;

public class Student extends Person{
    Student(){
        System.out.println("子类空的无参构造器");
    }

    Student(String name,int age){
        super(name,age);
    }
}
