package Code_block;

import java.util.ArrayList;
import java.util.List;

public class GANE {
    public static List<String> mapList = new ArrayList<>();
    static{
        System.out.println("--> 静态代码块执行了！开始加载游戏资源...");
        mapList.add("死亡沙漠");
        mapList.add("冰封王座");
        System.out.println("--> 游戏资源加载完毕！");
    }
    public GANE(){
        System.out.println("一位玩家进入了游戏!");
    }
}
