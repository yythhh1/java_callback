package myio;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("D:\\Desktop\\Java_callback\\src\\myio\\a.txt");
        //3种写入数据的方式
        //1.写入一个字节
        /*fos.write(97);
        fos.write(98);*/

        //2.写入一个字节数组
        byte[] bytes = {97, 98, 99, 100, 101};
        /*fos.write(bytes);*/

        //3.写入一个字节数组的一部分
        fos.write(bytes, 1, 3);

        //释放资源
        fos.close();
    }
}
