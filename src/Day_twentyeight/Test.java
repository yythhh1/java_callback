package Day_twentyeight;

public class Test {
    public static void main(String[] args){
        Car car = new Car();
        car.CarName = "Toyota";
        car.age = 5;
        car.CarColor = "Red";

        Car.Engine engine = car.new Engine();
        engine.engineName = "V6";
        engine.engineAge = 2;

        car.show();
        engine.show();
    }
}
