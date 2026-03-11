package Day_thirteen;

//定义数组存储三个商品对象
public class PracticeObjectArrays {
    public static void main(String[] args){
        Goods[] goods = new Goods[3];
        //创建三个商品对象
        Goods g1 = new Goods("001","Huaweip40",999,100);
        Goods g2 = new Goods("002","保温杯",100,999);
        Goods g3 = new Goods("003","枸杞",66,88);
        //把商品添加到数组
        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;
        //遍历展示商品信息
        for(Goods g : goods){
            System.out.println(g.getId() + " " + g.getName() + " " + g.getPrice() + " " + g.getCount());
        }
    }
}

class Goods{
    private String id;
    private String name;
    private double price;
    private int count;

    public Goods(){

    }

    public Goods(String id,String name,double price,int count){
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}