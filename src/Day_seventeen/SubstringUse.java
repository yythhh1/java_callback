package Day_seventeen;

import java.util.Scanner;

public class SubstringUse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String n_str = str.substring(0,3);
        System.out.println(n_str);
    }
}
