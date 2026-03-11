package Day_twentysix_04;

public class Test {
    public static void main(String[] args) {
        // 创建篮球教练对象
        BasketballCoach coach = new BasketballCoach("张三", 35);
        coach.teach(); // 输出: 篮球教练正在教授篮球技术

        // 创建篮球运动员对象
        BasketballSporter player = new BasketballSporter("李四", 25);
        player.study(); // 输出: 李四正在学习篮球技术


        //创建乒乓球教练对象
        PingpongCoach pingPongCoach = new PingpongCoach("王五", 40);
        pingPongCoach.teach(); // 输出: 乒乓球教练正在教授乒乓球技术
        pingPongCoach.speechEnglish();
        // 创建乒乓球运动员对象
        PingpangSporter pingPongPlayer = new PingpangSporter("赵六", 22);
        pingPongPlayer.study(); // 输出: 赵六正在学习乒乓球技术
        pingPongPlayer.speechEnglish(); // 输出: 赵六正在用英语进行演讲

    }
}
