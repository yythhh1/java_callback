package myio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis = new FileInputStream("D:\\Desktop\\Java_callback\\src\\myio2\\2024-11-26 20-12-10.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Desktop\\Java_callback\\src\\myio2\\test\\copy.mp4");

        //核心思想，边读边操作
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);

        }

        //释放资源
        //规则：先开的最后关闭
        fos.close();
        fis.close();
    }
}
