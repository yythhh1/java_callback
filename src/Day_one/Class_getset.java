package Day_one;

import java.util.Scanner;

public class Class_getset {
    public static void main(String[] args){
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //person.setAge(age);
        //sc.nextLine(); //如果是换行输入，nextInt会残留换行符，要用sc.nextLine()吸收
        String name = sc.nextLine();
        //person.setName(name);
        person.setNameandAge(name,age);
        System.out.println(person.getAge() + " " + person.getName());
    }
}
class Person{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    /*public void setName(String name){
        this.name = name;
    }*/
    public int getAge(){
        return this.age;
    }
    /*public void setAge(int age){
        if(age < 0 || age > 100){
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.age = age;
    }*/
    public void setNameandAge(String name,int age){
        this.name = name;
        this.age = age;
    }
}