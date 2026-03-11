package Day_thirtyfive;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args){

        Student s1 = null;
        Student s2 = new Student("zhangsan",20);

        //比较两个对象的属性值是否相同
        boolean result = Objects.equals(s1,s2);
        System.out.println("s1和s2的属性值是否相同：" + result);
    }
}
