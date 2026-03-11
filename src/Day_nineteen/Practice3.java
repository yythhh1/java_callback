package Day_nineteen;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        ArrayList<Phone> phones = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            Phone p = new Phone();
            System.out.println("请输入手机品牌:");
            String brand = sc.next();
            p.setBrand(brand);

            System.out.println("请输入手机价格:");
            int price = sc.nextInt();
            p.setPrice(price);

            phones.add(p);
        }

        for(int i = 0;i < phones.size();i++){
            if(phones.get(i).getPrice() > 3000){
                System.out.println("品牌为:" + phones.get(i).getBrand() + "  " + "价格为:" + phones.get(i).getPrice());
            }
        }
    }
}

class Phone{
    private String brand;
    private int price;

    public Phone(){};
    public Phone(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
