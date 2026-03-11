package Day_six;

public class InnerClassStatic {
    public static void main(String[] args){
        Outer1 outer = new Outer1("wtu");
        Outer1.Inner inner = new Outer1.Inner();
        System.out.println(inner.getSchoolName());
    }
}
class Outer1{
    private int age;
    private static String SchoolName;
    Outer1(String SchoolName){
        this.SchoolName = SchoolName;
    }
    public static class Inner{
        private String name;
        private int a;
        public void test(){
            System.out.println(SchoolName);
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getSchoolName(){
            return SchoolName;
        }
    }
}