package Day_thirtythree;

public class Objectdemon {
    public static void main(String[] args){
        Object o1 = new Object();
        String str1 = o1.toString();
        System.out.println(str1);

        Student s1 = new Student();
        String str2 = s1.toString();
        System.out.println(str2);

        Student s2 = new Student("John", 20, "123 Main St");
        System.out.println(s2.toString());
    }
}
