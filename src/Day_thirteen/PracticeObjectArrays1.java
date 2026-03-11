package Day_thirteen;

import java.util.Scanner;

public class PracticeObjectArrays1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Goods1[] goods = new Goods1[3];
        for(int i = 0;i < goods.length;i++){
            String brand = sc.next();
            double price = sc.nextDouble();
            String color = sc.next();
            goods[i] = new Goods1();
            goods[i].setBrand(brand);
            goods[i].setPrice(price);
            goods[i].setColor(color);
        }
        for(Goods1 good : goods){
            System.out.println(good.getBrand() + " " + good.getPrice() + " " + good.getColor());
        }
    }
}
class Goods1{
    private String brand;
    private double price;
    private String color;

    public Goods1(){

    }

    public Goods1(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}