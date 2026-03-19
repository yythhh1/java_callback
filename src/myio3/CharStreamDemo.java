package myio3;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Desktop\\Java_callback\\src\\myio3\\b.txt");
        //循环读取字符
        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        //释放资源
        fr.close();
    }

}
