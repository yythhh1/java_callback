package myio2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis = new FileInputStream("D:\\Desktop\\Java_callback\\src\\myio2\\a.txt");

        //读取数据
        int b1 = fis.read(); //一次读取一个字节，返回值是int类型
        System.out.println(b1); //一次读取一个字节，返回值是int类型

        int b2 = fis.read();
        System.out.println(b2);

        //释放资源
        fis.close();

    }
}
