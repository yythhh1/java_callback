package Day_twentyfour;

public class Test {
    public static void main(String[] args){
        //创建学生对象
        Student s = new Student();

        Student s1 = new Student("张三",18);
        System.out.println("学生姓名：" + s1.name + "," + "年龄：" + s1.age);
    }
}
