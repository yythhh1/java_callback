package myio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis = new FileInputStream("D:\\Desktop\\Java_callback\\src\\myio2\\2024-11-26 20-12-10.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Desktop\\Java_callback\\src\\myio2\\test\\copy2.mp4");

        //一次读取多个字节的方法读取数据
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);//这里加上0和len参数的原因是因为在最后一次读取数据时，可能会读取到不足一个字节数组长度的数据，如果不加上0和len参数，就会把整个字节数组都写入文件中，导致文件损坏。
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
