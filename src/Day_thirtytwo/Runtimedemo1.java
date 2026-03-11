package Day_thirtytwo;

import java.io.IOException;

public class Runtimedemo1 {
    public static void main(String[] args) throws IOException {
        //获取runtime对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        //比较两个runtime对象
        System.out.println("runtime只能创建一个实例" + (r1 == r2));

        //获取当前cup线程数
        System.out.println("当前cpu线程数:" + r1.availableProcessors());

        //JVM能从系统中获取的容量大小(单位是bit但是除以两个1024转换为MB)
        System.out.println("JVM能从系统中获取的容量大小:" + r1.totalMemory() / 1024 / 1024 + "MB");

        //JVM已经使用的容量大小(单位是bit但是除以两个1024转换为MB)
        System.out.println("JVM已经使用的容量大小:" + r1.totalMemory() / 1024 / 1024 + "MB");

        //JVM剩余的容量大小(单位是bit但是除以两个1024转换为MB)
        System.out.println("JVM剩余的容量大小:" + r1.freeMemory() / 1024 / 1024 + "MB");

        //运行CMD命令
        r1.exec("notepad.exe");
    }
}
