package Day_thirtyfour;

import Day_TwentyOne.User;

public class Objectdemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Object中的clone方法

        //创建出一个对象
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Gamer gamer1 = new Gamer(1, "张三", "123456", "D:\\Desktop\\games\\Animal Crossing New Horizons-cover.jpg", data);

        //克隆出一个对象
        Gamer gamer2 = (Gamer) gamer1.clone();//克隆方法返回的是Object类型，需要强制转换为Gamer类型
        System.out.println(gamer1);
        System.out.println(gamer2);

        System.out.println("分割线，下面是验证Object中的克隆是浅克隆");
        //验证Object中的克隆是浅克隆
        int[] arr = gamer2.getData();
        arr[0] = 100;
        System.out.println(gamer1);
        System.out.println(gamer2);
    }
}
