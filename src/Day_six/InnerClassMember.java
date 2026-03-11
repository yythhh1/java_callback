package Day_six;

public class InnerClassMember {
    public static void main(String[] args){
        Outer.Inner inner = new Outer().new Inner();
        inner.setName("wangtian");
        System.out.println(inner.getName());
        inner.test();
    }
}

class Outer{
    private int age = 99;
    public static String a = "yyt";

    //成员内部类
    public class Inner{
        private String name;
        private static String SchoolName;
        private int age = 88;

        public void test(){
            //成员内部类可以直接访问外部类的成员
            System.out.println(age);
            System.out.println(a);

            int age = 66;
            System.out.println(age);//局部变量
            System.out.println(this.age);//内部类成员变量
            System.out.print(Outer.this.age);//外部类成员变量

        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }
}
