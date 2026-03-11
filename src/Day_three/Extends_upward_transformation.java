package Day_three;

import java.util.Scanner;

public class Extends_upward_transformation {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int score = sc.nextInt();
        //私有成员变量，不能通过对象访问
        Person1 s2 = new Student1(name,age,score);
        System.out.println(s2.getName() + " " + s2.getAge());
    }
}
class Person1{
    private String name;
    private int age;
    public Person1(){

    }
    public Person1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class Student1 extends Person1{
    private int score;
    public Student1(){

    }
    public Student1(String name,int age,int score){
        super(name,age);
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}
