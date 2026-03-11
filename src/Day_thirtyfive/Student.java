package Day_thirtyfive;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name,int age){
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

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o){
        //如果掉用equals方法比较的是同一个对象，那么直接返回true
        if(this == o) return true;
        //如果传入的对象是null或者不是Student类型，返回false
        if(o == null || o.getClass() != getClass()) return false;

        //将传入的对象强制转换为Student类型，并比较属性值
        Student student = (Student) o;
        return age == student.age && Objects.equals(name,student.name);
    }


}
