package Day_three;

import java.util.Scanner;

public class Extends_downward_transformation {
    public static void main(String[] args){
        Person2 s1 = new Student2();
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int age1 = sc.nextInt();
        int score1 = sc.nextInt();
        //System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getScore);
        //向下转型
        Student2 s2 = (Student2)s1;
        
        System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getScore());
    }
}

class Person2{
    protected String name;
    protected int age;
    Person2(){

    }
    Person2(String name,int age){
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

class Student2 extends Person2{
    private int score;
    public Student2(){

    }
    public Student2(String name,int age,int score){
        super(name, age);
        this.score = score;
    }
    public int getScore(){
        return score;
    }
}