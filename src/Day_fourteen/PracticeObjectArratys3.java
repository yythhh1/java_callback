package Day_fourteen;

import java.util.Scanner;

public class PracticeObjectArratys3 {
    public static void main(String[] args){
        Students[] students = new Students[3];
        students[0] = new Students("001","张三",18);
        students[1] = new Students("002","李四",19);
        students[2] = new Students("003","王五",18);

        Scanner sc = new Scanner(System.in);
        String f_id = sc.nextLine();

        //1.再次添加一个学生对象，并且添加时进行学号的唯一性判断
        Students students3 = new Students("004","赵六",19);
        //将新的学生对象添加到数组中，分为两种情况，1.数组满了，那就再创建一个新数组（长度为老数组加添加学生数） 2.数组没有满，直接添加
        boolean flag = judge(students,students3);
        if(flag){
            //已存在---不用添加
            System.out.println("当前id重复，修改id后再尝试添加");
        }else{
            //不存在，判断是否存满后添加
            int students_count = getCount(students);
            if(students_count < students.length){
                //没有存满
                students[students_count] = students3;
                printArray(students);
                //2.通过id删除学生信息，如果id不存在则提示删除失败
                int flag1 = f_index(students,f_id);
                if(flag1 == -1){
                    System.out.println("该学生不存在，删除失败！");
                }else{
                    //该学生存在，删除的方式是新建一个新的数组比原数组小1的数组，将除了要被删除的学生都存进去。
                    Students n1_students[] = deleteArray(students,flag1);
                    //输出删除后的学生信息
                    System.out.println();
                    printArray(n1_students);
                }
                //3.查找id为**的学生，如果存在则给它的年龄加1
                String students_id  = sc.nextLine();
                int flag2 = f_index(students,students_id);
                if(flag2 == -1){
                    System.out.println("该学生不存在！");
                }else{
                    int age = students[flag2].getAge();
                    students[flag2].setAge(age + 1);
                    System.out.println();
                    printArray(students);
                }
            }else{
                //已经存满
                Students n_students[]= createArray(students,students3);
                printArray(n_students);
                //2.通过id删除学生信息，如果id不存在则提示删除失败
                int flag1 = f_index(students,f_id);
                if(flag1 == -1){
                    System.out.println("该学生不存在，删除失败！");
                }else{
                    //该学生存在，删除的方式是新建一个新的数组比原数组小1的数组，将除了要被删除的学生都存进去。
                    Students n1_students[] = deleteArray(n_students,flag1);
                    //输出删除后的学生信息
                    System.out.println();
                    printArray(n1_students);
                }
                //3.查找id为**的学生，如果存在则给它的年龄加1
                String students_id  = sc.nextLine();
                int flag2 = f_index(n_students,students_id);
                if(flag2 == -1){
                    System.out.println("该学生不存在！");
                }else{
                    int age = n_students[flag2].getAge();
                    n_students[flag2].setAge(age + 1);
                    System.out.println();
                    printArray(n_students);
                }
            }
        }
    }

    //遍历添加完学生后所有数组中所有学生的信息
    public static void printArray(Students[] students){
        for(int i = 0;i <students.length;i++){
            System.out.println("学号是：" + students[i].getId() +"  姓名是："+ students[i].getName()+"  年龄是："+students[i].getAge());
        }
    }
    //原数组存满创建一个新数组
    public static Students[] createArray(Students[] students,Students students3){
        Students[] n_students = new Students[students.length + 1];
        for(int i = 0;i < students.length;i++){
            n_students[i] = students[i];
        }
        n_students[students.length] = students3;
        return n_students;
    }
    //判断原数组已经存了多少元素
    public static int getCount(Students[] students){
        int count = 0;
        for(Students student : students){
            if(student != null){
                count++;
            }
        }
        return count;
    }
    //判断是否有相同元素
    public  static boolean judge(Students[] students,Students students3){
        for(int i = 0;i < students.length;i++){
            if (students[i] != null) {
                if(students3.getId() == students[i].getId()){
                    return true;
                }
            }
        }
        return false;//表示要插入的id不在原先的数组中
    }
    //通过id查找学生的索引
    public static int f_index(Students[] students,String f_id){
        for(int i = 0;i < students.length;i++){
            if(students[i] != null){
                if(students[i].getId().equals(f_id)){
                    return i;
                }
            }
        }
        return -1;
    }
    //删除根据索引
    public static Students[] deleteArray(Students[] students,int index){
        Students[] n_students = new Students[students.length - 1];
        for(int i = 0,j = 0;i < students.length;i++){
            if(i == index){
                continue;
            }
            if(students[i] != null){
                n_students[j++] = students[i];
            }
        }
        return n_students;
    }
}

class Students{
    private String id;
    private String name;
    private int age;

    public Students(){}

    public Students(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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