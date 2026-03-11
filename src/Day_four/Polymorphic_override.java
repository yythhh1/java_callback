package Day_four;

public class Polymorphic_override {
    public static void main(String[] args){
        Person p1 = new Person();
        Person s1 = new Student();
        p1.run();
        s1.run();
    }
}
class Person{
    public void run(){
        System.out.println("Person.run");
    }
}

class Student extends Person{
    public void run(){
        System.out.println("Student.run");
    }
}
