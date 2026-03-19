package myio3;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileReader fr = new FileReader("D:\\Desktop\\Java_callback\\src\\myio3\\b.txt");
        //循环一次读取多个字节
        char[] chars = new char[2];
        int len;
        while((len = fr.read(chars)) != -1 ){
            System.out.println(new String(chars,0,len));
        }
        //释放资源
        fr.close();
    }
}
