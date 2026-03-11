package Day_eighteen;

import java.util.Scanner;

public class ConvertRomanNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        //输入长度超过9的数字字符串
        while(true) {
            str = sc.nextLine();
            if (str.length() > 9) {
                System.out.println("输入字符长度错误，请重新输入!");
                continue;
            }
            int flag = 1;
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                    flag = -1;
                }
            }
            if(flag == -1){
                System.out.println("存在非法字符请重新输入!");
            }else{
                break;
            }
        }
            //将字符串中的每一个数字字符转换为罗马字符
            String roman = "";
            for(int i = 0;i < str.length();i++){
                roman = roman + convertRoman(str.charAt(i));
            }
            System.out.println(roman);
    }

    public static String convertRoman(char num){
        String arr[] = {" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[Character.getNumericValue(num)];
    }
}
