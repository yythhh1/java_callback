package Day_seventeen;

import java.util.Scanner;

public class ConvertAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        //判断金额是否有效
        while (true) {
            System.out.println("Enter the amount you want to convert");
            amount = sc.nextInt();
            if (amount >= 0 && amount <= 9999999) {
                break;
            } else {
                System.out.println("Invalid amount");
            }
        }
        //定义一个变量表示金额
        String monyStr = "";
        //将数字变为大写的中文
        while (amount > 0) {
            int temp = amount % 10;
            String CapNumber = getCapitalNumber(temp);
            monyStr = CapNumber + monyStr;
            amount /= 10;
        }

        //在前面补零，补齐七位
        int count = 7 - monyStr.length();
        if(count > 0){
            for(int i = 0;i < count;i++){
                monyStr = "零" + monyStr;
            }
        }
        //在每位后面添加单位
        String moneyStr = "";
        for(int i = 0;i < 7;i++){
            moneyStr = moneyStr + UnitPer(monyStr.charAt(i),i);
        }
        System.out.println(moneyStr);
    }

    public static String getCapitalNumber(int number){
        String arr[] = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }

    public static String UnitPer(char ch,int index){
        String arr[] = {"佰","拾","万","仟","佰","拾","元"};
        return ch + arr[index];
    }
}
