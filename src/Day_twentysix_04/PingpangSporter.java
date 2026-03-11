package Day_twentysix_04;

public class PingpangSporter extends Sporter implements English{
    public PingpangSporter(){

    }

    public PingpangSporter(String name,int age){
        super(name,age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员正在训练乒乓球技术");
    }

    @Override
    public void speechEnglish() {
        System.out.println("乒乓球运动员正在用英语进行演讲");
    }
}
