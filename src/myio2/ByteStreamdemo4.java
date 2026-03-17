package myio2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamdemo4 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fis = new FileInputStream("D:\\Desktop\\Java_callback\\src\\myio2\\a.txt");

        //读取数据,一次读取两个字节数据
        byte[] bytes = new byte[2];

        int len = fis.read(bytes);//返回值是实际读取的字节数
        System.out.println(len);

        String str = new String(bytes,0,len);//加0和len参数是为了防止读取到最后时，bytes数组中还有上次读取到的数据
        System.out.println(str);

        //释放资源
        fis.close();
    }
}
