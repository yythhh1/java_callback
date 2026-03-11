package Day_fortythree;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDeom2 {
    public static void main(String[] args){
        //创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);

        //将学生对象添加到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("李四",19);
        boolean b = coll.contains(s4);
        System.out.println("19岁的李四是否存在: " + b);

        boolean b1 = coll.isEmpty();
        System.out.println("集合内容是否为空: " + b1);
    }
}
