package Code_block;

public class main {
    public static void main(String[] args){
        System.out.println("程序开始运行...");
        // 第一次访问静态变量，会触发Game类的加载
        System.out.println("查看一下当前地图：" + GANE.mapList);

        System.out.println("--------------------");

        System.out.println("两位玩家准备进入游戏...");
        // 创建两个Game对象
        new GANE();
        new GANE();
    }
}
