package Day_three;

import java.util.Scanner;

public class Extends_super {
    public static void main(String[] args){
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int score = sc.nextInt();
        s1.name = name;
        s1.age = age;
        s1.score = score;
        System.out.println(s1.name + " " + s1.age + " " + s1.score);
    }
}
class Person{
    protected String name;
    protected int age;
    public Person(){

    }
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
}
class Student extends Person{
    protected int score;
    public Student(){

    }
    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
