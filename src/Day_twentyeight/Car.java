package Day_twentyeight;


public class Car {
    String CarName;
    int age;
    String CarColor;


    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(CarName);
        }
    }

    public void show(Car this){
        System.out.println(this.CarName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
}
