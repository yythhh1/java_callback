package myio;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("D:\\Desktop\\Java_callback\\src\\myio\\a.txt");
        //写入第一段数据
        String str = "woyaozhaodaogongzuo";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);

        //插入换行符
        String wrap = "\r\n";
        byte[] bytewrap = wrap.getBytes();
        fos.write(bytewrap);

        //写入第二段数据
        String str2 = "yidingnengxhaodao";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);
        fos.close();
    }
}
