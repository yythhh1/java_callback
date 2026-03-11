package Day_thirtyone;

public class Mathdemo {
    public static void main(String[] args) {
        //math获取绝对值
        System.out.println(Math.abs(-10));
        //math向上取整
        System.out.println(Math.ceil(-10.1));
        //math向下取整
        System.out.println(Math.floor(-10.1));
        //math四舍五入
        System.out.println("10.4四舍五入是:" + Math.round(10.4));
        System.out.println("10,5四舍五入是:" + Math.round(10.5));
        //math开平方
        System.out.println("16的平方根是:" + Math.sqrt(16));
        //math求最大值
        System.out.println("10和20的最大值是:" + Math.max(10, 20));
        //返回a的b次幂
        System.out.println("2的3次幂是:" + Math.pow(2, 3));
        //获取随机数
        System.out.println("随机数是:" + Math.random());
    }
}
