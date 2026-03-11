package Day_thirteen;

public class PracticeObjectArrays2 {
    public static void main(String[] args){
        Phones[] phones = new Phones[3];
        Phones p1 = new Phones("小米",2699,"白色");
        Phones p2 = new Phones("iphone",9999,"白色");
        Phones p3 = new Phones("三星",6999,"黑色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;
        double count = 0;
        for(Phones phone : phones){
            count += phone.getPrice();
        }
        System.out.printf("%.2f",count/phones.length);
    }
}

class Phones{
    private String brand;
    private double price;
    private String color;

    public Phones(){}

    public Phones(String brand, double price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
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