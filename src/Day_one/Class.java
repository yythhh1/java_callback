package Day_one;

import java.util.Scanner;

public class Class {
    public static void main(String[] args){
        City city1 = new City();
        Scanner sc = new Scanner(System.in);
        city1.name = sc.nextLine();
        city1.latitude = sc.nextDouble();
        city1.longitude = sc.nextDouble();
        System.out.print(city1.name + " " + city1.latitude + " " + city1.longitude);
    }
}
class City{
    String name;
    double latitude;
    double longitude;
}
