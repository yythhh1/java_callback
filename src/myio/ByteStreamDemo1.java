package myio;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("D:\\Desktop\\Java_callback\\src\\myio\\a.txt");
        //写入数据
        fos.write(97);
        //释放资源
        fos.close();
    }
}
