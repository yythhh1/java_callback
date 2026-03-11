package Day_fifteen;

import java.util.Scanner;

public class LoginPractice {
    public static void main(String[] args){
        //1.定义两个变量记录正确的用户名和密码
        String username = "admin";
        String password = "123456";
        //2.键盘录入模拟用户登录
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String user = sc.nextLine();
            System.out.println("Enter your password: ");
            String pass = sc.nextLine();
            if(username.equals(user) && password.equals(pass)){
                System.out.println("You have successfully logged in!");
                break;
            }else{
                System.out.println("You have not successfully logged in!");
            }
        }
    }
}
