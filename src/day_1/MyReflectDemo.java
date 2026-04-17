package day_1;

import java.lang.reflect.Field;

public class MyReflectDemo {
    public static void main(String[] args) throws IllegalAccessException {
        Student s = new Student("张三", 20, '男', 1.75, "篮球");
        Teacher t = new Teacher("李四", 8000.0);

        saveObject(t);


    }

    //把对象里面所有的成员变量名和值保存到本地文件中
    public static void saveObject(Object obj) throws IllegalAccessException {
        //获取字节码文件的对象
        Class clazz = obj.getClass();

        //2.获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();

            //获取成员变量的值
            Object value = field.get(obj);
            System.out.println(name + "=" + value);
        }
    }
}
