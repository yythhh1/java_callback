package Day_nineteen;

import java.util.ArrayList;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){
        ArrayList<Students1> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            Students1 s = new Students1();
            System.out.println("Enter student name:");
            String name = sc.next();
            s.setName(name);
            System.out.println("Enter student Age:");
            int age = sc.nextInt();
            s.setAge(age);
            students.add(s);
        }
        boolean flag;
        System.out.println("Enter the student's name that you want to search");
        String searchName = sc.next();
        flag = contains(students,searchName);
        System.out.println(flag);
    }
    //通过姓名查找用户是否存在列表中
    public static boolean contains(ArrayList<Students1> students, String name){
        for(int i = 0;i < students.size();i++){
            if(students.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}

class Students1{
    private String name;
    private int age;

    Students1(){};
    Students1(String name, int age){
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
