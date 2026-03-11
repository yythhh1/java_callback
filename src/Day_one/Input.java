package Day_one;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//创建scanner对象
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.printf("%s",name);
        System.out.println();
        System.out.println(age);
    }
}
