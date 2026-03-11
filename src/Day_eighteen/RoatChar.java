package Day_eighteen;

import java.util.Scanner;

public class RoatChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder strA = new StringBuilder(sc.nextLine());
        String strB = sc.nextLine();
        StringBuilder strC = new StringBuilder();
        int n = sc.nextInt();
        if(n == 1){
            strC = roatchar(strA);
        }else if(n > 1){
            strC = roatchar(strA);
            for(int i = 1;i < n;i++){
                strC = roatchar(strC);
            }
        }
        System.out.println(strC.toString());
        System.out.println(strB.equals(strC.toString()) ? "TRUE" : "FALSE");
    }

    public static StringBuilder roatchar(StringBuilder sb){
        char firstChar = sb.charAt(0);
        sb = sb.deleteCharAt(0);
        sb = sb.append(firstChar);
        return sb;
    }
}
