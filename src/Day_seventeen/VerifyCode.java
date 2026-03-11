package Day_seventeen;

import java.util.Random;

public class VerifyCode {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Random r1 = new Random();
        for(int i = 0;i < 4;i++){
            //先随机生成四个字母
            sb.append(r1.nextBoolean() ? (char)('A' + r1.nextInt(26)) : (char)('a' + r1.nextInt(26)));
        }
        int num = r1.nextInt(10);
        int insertPoint = r1.nextInt(sb.length() + 1);
        sb.insert(insertPoint,num);
        System.out.println(sb);
    }
}
