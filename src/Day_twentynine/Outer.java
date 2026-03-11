package Day_twentynine;

public class Outer {
    int a = 10;

    public void show(){
        class  inner{
            String name;
            int age;

            public void method1() {
                System.out.println("Inner class method1");
            }

            public static void method2() {
                System.out.println("Inner class static method2");
            }
        }

        //创建inner类的对象
        inner in = new inner();
        in.name = "Inner Class";
        in.age = 5;
        in.method1();
        inner.method2();
        System.out.println("Name: " + in.name + ", Age: " + in.age);
    }



}
