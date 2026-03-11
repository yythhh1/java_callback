package Day_TwentyOne;

import Day_seven.StringBuliderUse;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystemPlus {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作 1.登录  2.注册  3.忘记密码  4.退出系统");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1 -> userLogin(users);
                case 2 -> userRegister(users);
                case 3 -> forgotPassword(users);
                case 4 -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }
                default -> System.out.println("无效选择!");
            }
        }
    }

    //用户注册
    public static void userRegister(ArrayList<User> users){
        String username;
        String password;
        String idcard;
        String iphone;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入用户名:");
            username = sc.nextLine();
            //验证过程一般是先验证格式是否正确，再验证是否唯一
            //验证格式是否正确
            boolean flag1 = checkUserNameLength(username);
            boolean flag2 = checkUserName(username);
            if(!flag1 || !flag2){
                System.out.println("用户名格式不正确，请重新输入");
                continue; //格式不正确，重新输入
            }
            //验证用户名是否唯一
            boolean flag3 = usernameUnique(users, username);
            if(!flag3){
                System.out.println("用户名" + username + "请重新输入");
            }else{
                break; //用户名唯一，注册成功
            }
        }

        while (true) {
            System.out.println("请输入密码:");
            password = sc.nextLine();
            System.out.println("请再次输入密码:");
            String againpassword = sc.nextLine();
            //验证密码是否一致
            boolean flag4 = checkPassword(password, againpassword);
            if(!flag4){
                System.out.println("两次输入的密码不一致，请重新输入");
            }else{
                System.out.println("密码输入成功");
                break; //密码一致，输入成功
            }
        }

        while (true) {
            System.out.println("请输入身份证号:");
            idcard = sc.nextLine();
            //验证身份证格式
            boolean flag5 = checkIdCard(idcard);
            if(!flag5){
                System.out.println("身份证格式不正确，请重新输入");
            }
            else{
                System.out.println("身份证输入成功");
                break; //身份证格式正确，输入成功
            }
        }

        while (true) {
            System.out.println("请输入手机号:");
            iphone = sc.nextLine();
            //验证手机号格式
            boolean flag6 = checkIphone(iphone);
            if(!flag6){
                System.out.println("手机号格式不正确，请重新输入");
            } else{
                System.out.println("手机号输入成功");
                break; //手机号格式正确，输入成功
            }
        }

        //将用户信息添加到用户列表中
        User user = new User(username, password, idcard, iphone);
        users.add(user);
        System.out.println("用户注册成功，欢迎使用学生管理系统");
        printList(users); //打印用户列表
    }

    //用户登录
    public static void userLogin(ArrayList<User> users){
        for (int i = 1;i <= 3;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username =sc.nextLine();
            //验证用户名是否存在,如果flag为true，说明用户名不存在
            boolean flag = usernameUnique(users, username);
            if(flag){
                System.out.println("用户名不存在，请先注册");
                return; //用户名不存在，返回
            }
            System.out.println("请输入密码:");
            String password = sc.nextLine();

            while (true) {
                System.out.println("请输入验证码:");
                String VerificationCode = getVerificationCode();
                System.out.println("验证码为:" + VerificationCode);
                String inputcode = sc.next();
                if(!inputcode.equalsIgnoreCase(VerificationCode)){
                    System.out.println("验证码错误，请重新输入");
                }else{
                    break;
                }
            }

            //验证用户名和密码是否匹配
            boolean loginSuccess = false;
            for(User user : users){
                if(user.getUsername().equals(username) && user.getPassward().equals(password)){
                    loginSuccess = true; //用户名和密码匹配
                    break;
                }
            }
            if(loginSuccess){
                System.out.println("登录成功，欢迎使用学生管理系统");
                return;
            }else{
                System.out.println("用户名或密码错误，请重新登录");
                if(i == 3){
                    System.out.println("登录失败，超过3次尝试，退出系统");
                    System.exit(0);//超过3次尝试，退出系统
                }else{
                    System.out.println("您还有" + (3 - i) + "次尝试机会");
                }
            }
        }

    }

    //忘记密码
    public static void forgotPassword(ArrayList<User> users){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        //验证用户名是否存在
        boolean flag = usernameUnique(users,username);
        if(flag){
            System.out.println("用户名不存在，请先注册");
            return; //用户名不存在，返回
        }
        System.out.println("请输入身份证号:");
        String idcard = sc.nextLine();
        System.out.println("请输入手机号:");
        String iphone = sc.nextLine();
        //验证身份证号和手机号是否匹配
        boolean match = false;
        for(User user : users){
            if(user.getIdCard().equals(idcard) && user.getPhone().equals(iphone)){
                match = true;//身份证号和手机号匹配
                break;
            }
        }
        if(match){
            while (true) {
                System.out.println("验证通过，请输入新密码");
                String newpassword = sc.nextLine();
                System.out.println("请再次输入新密码:");
                String againpassword = sc.nextLine();
                //验证新密码是否一致
                boolean flag1 = checkPassword(newpassword, againpassword);
                if(!flag1){
                    System.out.println("两次输入的密码不一致，请重新输入");
                }else{
                    for(User user : users){
                        if(user.getUsername().equals(username)){
                            user.setPassward(newpassword);//设置新密码
                            System.out.println("密码修改成功，请牢记新密码");
                            return; //密码修改成功，返回
                        }
                    }
                }
            }

        }
    }

    /**
     * 注册部分
     */
    //判断用户名是否唯一
    public static boolean usernameUnique(ArrayList<User> users,String username){
        if(users.size() == 0){
            return true; //如果用户列表为空，用户名唯一
        }
        int flag = 0; //标志位，默认用户名唯一
        for(User user : users){
            if(user.getUsername().equals(username)){
                flag = 1; //用户名已存在
                break;
            }
        }
        if(flag == 1){
            return false; //用户名已存在
        }
        return true; //用户名唯一
    }

    //判断用户名长度是大于3小于15
    public static boolean checkUserNameLength(String username){
        if(username.length() > 3 && username.length() < 15){
            return true;
        }
        return false;
    }

    //判断用户名是不是只由字符和数字组成，且不能是纯数字或纯字母
    public static boolean checkUserName(String username){
        int flag1 = 0; // 字母标志
        int flag2 = 0;// 数字标识
        int flag3 = 0; // 特殊字符标识
        for(char c : username.toCharArray()){
            if(Character.isLetter(c)){
                flag1 = 1;//密码中有字母
            }
            if(Character.isDigit(c)){
                flag2 = 1;//密码中有数字
            }
            if(!Character.isLetterOrDigit(c)){
                flag3 = 1;//密码中有特殊字符
                break;
            }
        }
        if(flag3 == 1){
            return false;
        }
        return flag1 == 1 && flag2 == 1; //密码中必须有字母和数字
    }

    //密码要输入两次，且两次输入一致
    public static boolean checkPassword(String password1,String password2){
        if(password1.equals(password2)){
            return true;//密码一致
        }
        return false;//密码不一致
    }

   //验证身份证格式
   public static boolean checkIdCard(String idcard){
        if(idcard.length() != 18){
            return false;//长度不正确
        }
        if(idcard.charAt(0) == '0'){
            return false; //身份证不能以0开头
        }
        for(int i = 0;i < idcard.length() - 1;i++){
            if(!Character.isDigit(idcard.charAt(i))){
                return false;//身份证前17位必须是数字
            }
        }
        if(!(idcard.charAt(idcard.length() -1) == 'x' || idcard.charAt(idcard.length() - 1) == 'X' || Character.isDigit(idcard.charAt(idcard.length() - 1)))){
            return false; //身份证最后一位可以是数字或字母x或X
        }
        return true; //身份证格式正确
   }

    //验证手机号格式
    public static boolean checkIphone(String iphone){
        if(iphone.length() != 11){
            return false;//手机号长度不正确
        }
        if(iphone.charAt(0) == '0'){
            return false; //手机号不能以0开头
        }
        for(char c : iphone.toCharArray()){
            if(!Character.isDigit(c)){
                return false;//手机号必须是数字
            }
        }
        return true;//手机号格式正确
    }

    /**
     * 登录部分
     */
    //获取验证码，验证码长度为5，由四个字母字符和一个数字字符组成，字母字符可以是大写或小写，同一字母可以重复，数字字符可以出现在任意位置
    public static String getVerificationCode() {
        StringBuilder code = new StringBuilder();
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * letters.length());//Math.rando()是生成一个0到1之间的随机数
            code.append(letters.charAt(index));
        }
        int index = (int) (Math.random() * digits.length());
        code.append(digits.charAt(index));
        // 打乱验证码顺序
        char[] codeArray = code.toString().toCharArray();

        for (int i = 0; i < codeArray.length; i++) {
            int randomIndex = (int) (Math.random() * (i + 1));
            char temp = codeArray[i];
            codeArray[i] = codeArray[randomIndex];
            codeArray[randomIndex] = temp;
        }
        code.setLength(0);//清空StringBuilder字符串
        for (char c : codeArray) {
            code.append(c);
        }
        return code.toString();
    }

    //遍历集合
    public static void printList(ArrayList<User> list){
        for(int i = 0;i < list.size();i++){
            User user = list.get(i);
            System.out.println("用户" + (i + 1) + ":");
            System.out.println("用户名: " + user.getUsername());
            System.out.println("密码: " + user.getPassward());
            System.out.println("身份证号: " + user.getIdCard());
            System.out.println("手机号: " + user.getPhone());
            System.out.println("-------------------------");
        }
    }
}
