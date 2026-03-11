package Day_twenty;

import Day_one.Switch;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        loop://定义标签
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------\n" +
                    "            1:添加学生\n" +
                    "            2:删除学生\n" +
                    "            3:修改学生\n" +
                    "            4:查询学生\n" +
                    "            5:退出系统");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1 -> addStudent(students);
                case 2 -> deleteStudent(students);
                case 3 -> updateStudent(students);
                case 4 -> queryStudent(students);
                case 5 -> {
                    System.out.println("退出系统");
                    break loop;//跳出定义的循环标签
                }
                //System.exit(0);停止虚拟机运行
                default -> System.out.println("无效选择");
            }
        }
    }

    //添加学生的方法：
    public static void addStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        int id = 0;
        boolean idExist = true;
        while(idExist){
            System.out.println("请输入学号:");
            id = sc.nextInt();
            idExist = false;
            for(int i = 0;i < students.size();i++){
                if(students.get(i).getId() == id){
                    System.out.println("学号已经存在，请重新输入!");
                    idExist = true;
                }
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入地址:");
        String address = sc.next();
        Student student = new Student(id,name,age,address);
        students.add(student);
    }

    //删除学生的方法
    public static void deleteStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号:");
        int id = sc.nextInt();
        int flag = 0;
        for(int i = 0;i < students.size();i++){
            if(students.get(i).getId() == id){
                flag = 1;
                students.remove(i);
            }
        }
        if(flag == 0){
            System.out.println("该学生不存在，即将返回初始菜单...");
        }
    }

    public static void updateStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要被修改的学生id:");
        int id = sc.nextInt();
        int flag = 0;
        for(int i = 0;i < students.size();i++){
            if(students.get(i).getId() == id){
                int id1 = 0;
                boolean idExist = true;
                while(idExist){
                    System.out.println("请输入要修改的学号:");
                    id1 = sc.nextInt();
                    idExist = false;
                    for(int j = 0;j < students.size();j++){
                        if(students.get(j).getId() == id1){
                            System.out.println("学号已经存在，请重新输入!");
                            idExist = true;
                        }
                    }
                }
                System.out.println("请输入要修改的姓名:");
                String name = sc.next();
                System.out.println("请输入要修改的年龄:");
                int age = sc.nextInt();
                System.out.println("请输入要修改的地址:");
                String address = sc.next();
                students.get(i).setId(id1);
                students.get(i).setName(name);
                students.get(i).setAge(age);
                students.get(i).setAddress(address);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("该学生不存在，即将返回初始菜单...");
        }
    }

    public static void queryStudent(ArrayList<Student> students){
        if(students.size() == 0){
            System.out.println("学生信息表为空,请先输入学生信息!");
        }
        else{
            System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
            for(Student student : students){
                System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAddress());
            }
        }
    }
}
