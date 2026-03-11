package Day_two;

import java.util.Scanner;

public class Structure_function {
    public static void main(String[] args){
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        name = sc.next();
        Person person1 = new Person(name,age);
        System.out.println(person1.getAge() + " " + person1.getName());
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

