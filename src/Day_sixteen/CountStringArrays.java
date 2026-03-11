package Day_sixteen;

import java.util.Arrays;
import java.util.Scanner;

public class CountStringArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count1 = 0,count2 = 0,count3 = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                count1++;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                count2++;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count3++;
            }
        }
        System.out.println("小写字母个数为：" + count1 + "," + "大写字母个数为：" + count2 + "," + "数字字符个数为：" + count3);
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
    }
}
