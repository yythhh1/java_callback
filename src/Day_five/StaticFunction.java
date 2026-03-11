package Day_five;

public class StaticFunction {
    public static void main(String[] args){
        Person3.setName("yyt");
        System.out.println(Person3.getName());
    }
}

class Person3{
    private static String name;
    public static void setName(String name1){
        name = name1;
    }
    public static String getName(){
        return name;
    }
}
