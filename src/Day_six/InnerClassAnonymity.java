package Day_six;

public class InnerClassAnonymity {
    public static void main(String[] args){
        Swimming s1 = new Swimming() {

            @Override
            public void swim() {
                System.out.println("dog swimming fastly");
            }

        };

        Swimming s2 = new Swimming(){
            @Override
            public void swim(){
                System.out.println("cat swimming fastly");
            }
        };
        go(s1);
    }

    public static void go(Swimming s){
        System.out.println("=====start=====");
        s.swim();
    }
}

interface Swimming{
    void swim();
}