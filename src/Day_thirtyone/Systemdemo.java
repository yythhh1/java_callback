package Day_thirtyone;

public class Systemdemo {
    public static void main(String[] args) {

        //System.exit(0);
        //System.out.println("This line will not be executed because System.exit(0) terminates the program.");
        long time = System.currentTimeMillis();
        System.out.println("Current time in milliseconds since epoch: " + time);

        System.out.println();

        //拷贝数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        //将arr1数组中的内容拷贝到arr2数组中
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.print("Contents of arr2 after copying: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        //可以对数组进行部分拷贝
        int arr3[] = new int[10];
        System.arraycopy(arr1,0,arr3,5,5);
        System.out.print("\nContents of arr3 after partial copy: ");
        for(int i = 0;i < arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }

        //创建三个学生类对象
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        Student s3 = new Student("Charlie", 21);

        //将三个学生对象存入数组
        Student[] students = {s1,s2,s3};
    }
}

class Person{
    private String name;
    private int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Student extends Person{
    public Student(){
        super(); // 调用父类的无参构造方法
    }
    public Student(String name,int age){
        super(name,age);
    }
}