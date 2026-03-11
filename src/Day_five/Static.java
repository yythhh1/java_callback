package Day_five;

public class Static {
    public static void main(String[] args){
        Person2 p1 = new Person2("yyt");
        Person2 p2 = new Person2("yuyuting");
        System.out.println(p1.equals(p2));
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}

class Person2{
   private static String name;
   public Person2(String name){
       this.name = name;
   }

   public String getName(){
       return name;
   }
}