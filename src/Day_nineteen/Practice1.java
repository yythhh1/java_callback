package Day_nineteen;

import Day_one.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        //遍历集合
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < students.size();i++){

            String name = sc.next();
            int age = sc.nextInt();
            System.out.println("请输入姓名:");

            students.get(i).setName(name);
            System.out.println("请输入年龄:");
            students.get(i).setAge(age);
        }
        for(Student student : students){
            System.out.println("姓名是：" + student.getName() + "  年龄是: " + student.getAge());
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(){};

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
