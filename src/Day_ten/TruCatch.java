package Day_ten;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TruCatch {
    public static void main(String[] args){
        byte[] bs = new byte[10];
        try{
             bs = toGBK("中文");
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(bs));
    }

    public static byte[] toGBK(String str) throws UnsupportedEncodingException {
        //try{
            //用指定编码转换String为byte[];
            return str.getBytes("GBK");
        //}catch (UnsupportedEncodingException e){
            //如果系统不支持GBK编码，会捕获到UnsupportedEncodingException
            //System.out.println(e);
            //return str.getBytes();//尝试使用默认编码
        }
    }
