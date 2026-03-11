package Day_seventeen;

import java.util.Scanner;

public class ReplaceUse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //敏感词库
        String[] words = {"tmd","fuck","mlgb","cnm"};
        for(int i = 0;i < words.length;i++){
            str = str.replace(words[i], "***");
        }
        System.out.println(str);
    }
}
