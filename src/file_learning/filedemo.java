package file_learning;

import java.io.File;

public class filedemo {
    public static void main(String[] args){
        String str = "D:\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);
    }

}
