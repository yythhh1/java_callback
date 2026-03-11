package Day_five;

public class Interface_implements {
    public static void main(String[] args){
        Person1 s1 = new Student("wangtian");
        System.out.println(s1.getName());
        s1.run();
    }
}
interface Person1{
    void run();//省略public abstract
    String getName();
}

class Student implements Person1{
    private String name;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        System.out.println(this.name +" " + "run");
    }
}