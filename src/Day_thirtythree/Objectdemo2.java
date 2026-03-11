package Day_thirtythree;

public class Objectdemo2 {
    public static void main(String[] args){
        Student s1 = new Student("Alice", 18, "456 Elm St");
        Student s2 = new Student("Alice", 18, "456 Elm St");

        //如果没有重写toString方法，默认调用Object类的toString方法，而Object中的euqals是用==来比较对象的地址
        boolean isEqual = s1.equals(s2);
        System.out.println("s1 euqals s2:" + isEqual);

        System.out.println("...............");

        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("s equals sb:" + s.equals(sb));//因为equals是被String类对象调用，所以要看String中的equals方法
        System.out.println("sb equals s:" + sb.equals(s));//而StringBuilder中的equals方法(没有重写,是直接用的Object中的)是用==来比较对象的地址，所以返回false
    }
}
